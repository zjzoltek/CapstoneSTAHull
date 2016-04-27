package capstonezz;

import capstoneal.GUI.HomeScreen;
import capstonezz.GUI.NavigationButton;
import capstonezz.GUI.SearchResultsPage;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 12, 2016
 */

public class Linker {
    private final JPanel frame;
    private final Stack<String> backStack;
    private final Stack<String> forwardStack;

    private final SearchResultsPage searchResultsPage;
    private final HomeScreen homescreen;

    private boolean backButtonEnabled = false;
    private boolean forwardButtonEnabled = false;

    private final NavButtonHandler bhb;
    private final NavButtonHandler bhf;

    private String currPanel = HomeScreen.LINK_NAME;

    private static Linker linker;

    private Linker(int width, int height){
        searchResultsPage = new SearchResultsPage(width, height);
        homescreen = new HomeScreen(width, height);


        backStack = new Stack<>();
        forwardStack = new Stack<>();
        frame = new JPanel(new CardLayout());
        frame.setSize(width, height);

        bhb = new NavButtonHandler();
        bhf = new NavButtonHandler();
        init();
    }

    private Linker(Dimension dimension){
        searchResultsPage = new SearchResultsPage((int)dimension.getWidth(), (int)dimension.getHeight());
        homescreen = new HomeScreen((int)dimension.getWidth(), (int)dimension.getHeight());
        backStack = new Stack<>();
        forwardStack = new Stack<>();

        frame = new JPanel(new CardLayout());
        frame.setSize(dimension.width, dimension.height);

        bhb = new NavButtonHandler();
        bhf = new NavButtonHandler();
        init();
    }

    private void init(){
       frame.add(homescreen, HomeScreen.LINK_NAME);
       frame.add(searchResultsPage, SearchResultsPage.LINK_NAME);

       bhf.addButton((NavigationButton)searchResultsPage.getForwardButton());
       bhf.addButton((NavigationButton)homescreen.getForwardButton());
       bhb.addButton((NavigationButton)searchResultsPage.getBackButton());
       bhb.addButton((NavigationButton)homescreen.getBackButton());

       searchResultsPage.getBackButton().addActionListener
        (new BackButton());

       searchResultsPage.getForwardButton().addActionListener
        (new ForwardButton());

       searchResultsPage.getHomeButton().addActionListener
               (new HomeTaker());

       homescreen.getBackButton().addActionListener
        (new BackButton());

       homescreen.getForwardButton().addActionListener
        (new ForwardButton());

       homescreen.getSearch().getLinkingComponent().
               addActionListener((ActionEvent ae) -> {
                   homescreen.getSearch().getGoButton().doClick();
               });

       homescreen.getSearch().getGoButton().
               addActionListener((ActionEvent ae) -> {
                   searchResultsPage.getSearchResultsGUI().getAddressBox()
                           .setText(homescreen.getSearch().getLinkingComponent().getText());

                   homescreen.getSearch().getLinkingComponent().setText("");
               });

       homescreen.getSearch().getGoButton()
               .addActionListener(new PanelChanger(SearchResultsPage.LINK_NAME));

       homescreen.getSearch().getGoButton()
               .addActionListener((ActionEvent ae) -> {
                  searchResultsPage.getSearchResultsGUI().getAddressBox().setText(
                          homescreen.getSearch().getLinkingComponent().getText());

                  searchResultsPage.getSearchResultsGUI().getInitiateSearchButton().doClick();
               });

       ((CardLayout)frame.getLayout()).show(frame, homescreen.getName());

       bhf.setButtonsEnabled(false);
       bhb.setButtonsEnabled(false);
    }

    class BackButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(backStack.empty()){
                return;
            }

            String lastScreen = backStack.pop();
            forwardStack.push(currPanel);

            currPanel = lastScreen;

            updateButtons();
            ((CardLayout)frame.getLayout()).show(frame, currPanel);
        }

    }

    class ForwardButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(forwardStack.empty()){
                return;
            }

            String lastScreen = forwardStack.pop();

            backStack.push(currPanel);

            currPanel = lastScreen;

            updateButtons();
            ((CardLayout)frame.getLayout()).show(frame, currPanel);
        }

    }

    class PanelChanger implements ActionListener{
        private final String screen;

        public PanelChanger(String newScreen){
            screen = newScreen;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            changeScreen(screen);
        }

    }

    class GracefulExit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            currPanel = backStack.pop();

            updateButtons();
            ((CardLayout)frame.getLayout()).show(frame, currPanel);
        }

    }

    class HomeTaker implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            backStack.push(currPanel);
            currPanel = HomeScreen.LINK_NAME;

            forwardStack.removeAllElements();
            updateButtons();
            ((CardLayout)frame.getLayout()).show(frame, currPanel);
        }

    }

    class EditCreate implements ActionListener{
        private final FormEntity controller;
        public EditCreate(FormEntity controller){
            this.controller = controller;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            controller.getIRP().setEnabled(true);
            controller.getLRP().setEnabled(true);
            controller.getEditor().add(controller.getTabber());
            ((CardLayout)controller.getLayout()).show(controller, "edit");
            controller.revalidate();
        }
    }
    
    class EditExit implements ActionListener{
        private final FormEntity controller;

        public EditExit(FormEntity controller){
            this.controller = controller;
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            controller.getIRP().setEnabled(false);
            controller.getLRP().setEnabled(false);
            controller.getViewer().add(controller.getTabber());
            ((CardLayout)controller.getLayout()).show(controller, "view");
            controller.revalidate();
            updateButtons();
        }
    }
    
    public void updateButtons(){
        backButtonEnabled = !backStack.isEmpty();
        forwardButtonEnabled = !forwardStack.isEmpty();
        bhb.setButtonsEnabled(backButtonEnabled);
        bhf.setButtonsEnabled(forwardButtonEnabled);
    }

    public void changeScreen(String screen){
        backStack.push(currPanel);
         if(!forwardStack.isEmpty())
                forwardStack.pop();

        currPanel = screen;

        updateButtons();
        ((CardLayout)frame.getLayout()).show(frame, currPanel);
    }


    public void createView(String display){
        FormEntity view = new FormEntity(frame.getWidth(), frame.getHeight(), display);
        frame.add(view, display);

        bhf.addButton((NavigationButton)view.getViewer().getForwardButton());
        bhb.addButton((NavigationButton)view.getViewer().getBackButton());

        view.getViewer().getForwardButton().addActionListener(new ForwardButton());
        view.getViewer().getBackButton().addActionListener(new BackButton());
        view.getViewer().getHomeButton().addActionListener(new HomeTaker());

        view.getViewer().getEditButton().addActionListener(new EditCreate(view));
        
        view.getEditor().getAndButton().addActionListener(new EditExit(view));
        view.getEditor().getCancelButton().addActionListener(new EditExit(view));
        view.getEditor().getSaveButton().addActionListener(new EditExit(view));
        
        changeScreen(display);
    }


    public static Linker getLinker(int width, int height){
        if(linker == null) linker = new Linker(width, height);
        return linker;
    }

    public static Linker getLinker(Dimension dimension){
        if(linker == null) linker = new Linker(dimension);
        return linker;
    }

    public static Linker getLinker(){
        return linker;
    }
    
    public static boolean linkerExists(){
        return linker != null;
    }
    
    public JPanel getFrame(){
        return frame;
    }

    public static void main(String[] args){
        UIManager.put("JComponent.sizeVariant", "large");
        /*try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | 
                InstantiationException | 
                IllegalAccessException | 
                UnsupportedLookAndFeelException e){
        }*/
        
        Linker link = Linker.getLinker(Util.getScreenDimension());
        UIManager.put("JComponent.sizeVariant", "large");
        
        JFrame frame = new JFrame("LSFD Form Database");
        frame.add(link.frame);
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        frame.requestFocus();

    }

}
