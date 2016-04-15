package capstonezz.GUI;

import capstonezz.CapstoneConstants;
import capstonezz.NavigationModel;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResultsPage extends JPanel implements NavigationModel {
    private NavigationButton backButton;
    private NavigationButton forwardButton;
    public HomeButton homeButton;
    
    private final JToolBar toolbar = new JToolBar();
    private final int screenWidth;
    private final int screenHeight;
    public final GUI mainPanel; 
    public final SearchResults searchResults;
    
    public SearchResultsPage(int width, int height){
        screenWidth = width;
        screenHeight = height;
        searchResults = new SearchResults(CapstoneConstants.PANEL_BG, screenWidth, screenHeight);
        mainPanel = new GUI(CapstoneConstants.PANEL_BG, screenWidth, screenHeight, searchResults);
        init();
    }
    
    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(CapstoneConstants.PANEL_BG);
        
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
    
    @Override
    public JButton getBackButton(){
        return backButton;
    }
    
    @Override
    public JButton getForwardButton(){
        return forwardButton;
    }

    @Override
    public JButton getHomeButton() {
        return homeButton;
    }

}

