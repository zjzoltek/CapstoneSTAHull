package capstonezz;

import capstonezz.GUI.SearchResultsPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 12, 2016
 */

public class Linker {
    public final JFrame frame;
    private final Stack<JPanel> backStack;
    private final Stack<JPanel> forwardStack;
    
    private final SearchResultsPage searchResultsPage;
    
    public Linker(int width, int height){
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        
        searchResultsPage = new SearchResultsPage(width, height);
        
        frame = new JFrame();
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setSize(width, height);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        init();
    }
    
    public Linker(Dimension dimension){
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        searchResultsPage = new SearchResultsPage((int)dimension.getWidth(), (int)dimension.getHeight());
        frame = new JFrame();
        frame.setSize(dimension);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        init();
    }
    
    private void init(){
       searchResultsPage.getBackButton().addActionListener(new BackButton(searchResultsPage, searchResultsPage.getBackButton()));
       searchResultsPage.getForwardButton().addActionListener(new ForwardButton(searchResultsPage, searchResultsPage.getForwardButton()));
    }
    
    class BackButton implements ActionListener {
        private JPanel panel;
        private final JButton button;
        
        public BackButton(JPanel panel, JButton button){
            this.panel = panel;
            this.button = button;
            
            if(backStack.isEmpty()){
                button.setVisible(false);
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(backStack.isEmpty()){
                button.setVisible(false);
            }
            
            JPanel lastScreen = backStack.pop();
            
            backStack.push(panel);
            
            panel = lastScreen;
            
            frame.removeAll();
            frame.add(lastScreen);
            frame.validate();
            
        }
        
    }
    
    public class ForwardButton implements ActionListener {
        private JPanel panel;
        private final JButton button;
        
        public ForwardButton(JPanel panel, JButton button){
            this.panel = panel;
            this.button = button;
            
            if(forwardStack.isEmpty()){
                button.setVisible(false);
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(forwardStack.isEmpty()){
                button.setVisible(false);
            }
            
            JPanel lastScreen = forwardStack.pop();
            
            backStack.push(panel);
            
            panel = lastScreen;
            
            frame.removeAll();
            frame.add(lastScreen);
            frame.validate();
            
        }
        
    }
    
        
    public static void main(String[] args){
        Linker frame = new Linker(Util.getScreenDimension());
        
        frame.frame.setContentPane(frame.searchResultsPage);
        frame.frame.setVisible(true);
        
        frame.frame.requestFocus();
        
    }
    
}   
