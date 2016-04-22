/*
 * This class uses JPanel to assemble the componenets of the homescreen
 */
package capstoneal.GUI;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import capstonezz.CapstoneConstants;
import capstonezz.GUI.NavigationButton;
import capstonezz.NavigationModel;
import capstonezz.Util;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.*;

public class HomeScreen extends JPanel implements NavigationModel{
    public final Search search;
    public final NotificationBar notificationBar;
    
    private final NavigationButton backButton; // creates back button
    private final NavigationButton forwardButton; // creates forward button
    private final JButton newAddressButton = new JButton("Create New Address"); // creates New Address button
    private final JToolBar toolBar = new JToolBar();
    
    public static final String LINK_NAME = "HOMESCREEN";
        
    public HomeScreen(int width, int height){
        setBackground(CapstoneConstants.PANEL_BG);
        notificationBar = new NotificationBar(); // create an instance of NotificationBar
        search = new Search(); // create an instance of Search
        setLayout(new BorderLayout()); // sets layout to border layout
        // add the components to the screen
        toolBar.setBorderPainted(false);
        toolBar.setLayout(new FlowLayout());
        //adding the buttons to the toolbar
        
        
        //getting dimensions for buttons
        int screenWidth = Util.getScreenDimension().width;
        int screenHeight = Util.getScreenDimension().height;
        
        //creating back button
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(screenWidth), 
        NavigationButton.getButtonHeight(screenHeight));
        
        //creating forward button
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight)); 
        
        toolBar.add(backButton);
        toolBar.add(newAddressButton);
        toolBar.add(forwardButton);
        
        add(toolBar, BorderLayout.NORTH);
        add(search, BorderLayout.CENTER);
        add(notificationBar, BorderLayout.SOUTH);
    } // end of constructor

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getForwardButton() {
        return forwardButton;
    }

    @Override
    public Component getHomeButton() {
        return null;
    }
    
} // end of class
