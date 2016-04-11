package capstonezz.GUI;

import capstonezz.Util;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResultsPage extends JPanel {
    private NavigationButton backButton;
    private NavigationButton forwardButton;
    private HomeButton homeButton;
    
    private final JToolBar toolbar = new JToolBar();
    private final int screenWidth;
    private final int screenHeight;
    private GUI mainPanel; 
    private SearchResults searchResults;
    
    public SearchResultsPage(){
        screenWidth = Util.getScreenDimension().width;
        screenHeight = Util.getScreenDimension().height;
        
        init();
    }
    
    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //NOTE: if you need to change the toolbar to have navigation buttons on far left,
        //and home button in the middle, switch layout manager to boxlayout and adjust
        //using glue
        setBackground(Color.GRAY.brighter());
        searchResults = new SearchResults(getBackground(), screenWidth, screenHeight);
        mainPanel = new GUI(getBackground(), screenWidth, screenHeight, searchResults);
        
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(screenWidth), 
        NavigationButton.getButtonHeight(screenHeight));
        
        
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight));
        
        homeButton = new HomeButton(NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight));
        
        homeButton.setBorderPainted(true);
        homeButton.setFocusPainted(true);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        toolbar.setBorderPainted(false);
        
        
        
        toolbar.setLayout(new FlowLayout());
        toolbar.add(backButton);
        toolbar.add(homeButton);
        toolbar.add(forwardButton);
        
        
        add(toolbar);
        add(mainPanel);
        JScrollPane scrollPane = new JScrollPane(searchResults,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        scrollPane.getVerticalScrollBar().setUnitIncrement(12);
        scrollPane.setPreferredSize(new Dimension(screenWidth, screenHeight / 2));
        add(scrollPane);
    }
    
    public static void main(String[] args){
        JPanel page = new SearchResultsPage();
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(page);
        //frame.setResizable(false);
        frame.setVisible(true);
        
        frame.requestFocus();
        
    }
    
    public JPanel getPage()
    {
        JPanel page = new SearchResultsPage();
        
        return page;
    }

}

