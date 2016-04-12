/*
 * This class creates the banner for the homescreen
 */
package capstone.GUI;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.*;
import capstonezz.NavigationButton;


public class Banner extends JPanel{
    
    private NavigationButton backButton; // creates back button
    private NavigationButton forwardButton; // creates forward button
    private JButton newAddressButton = new JButton("New Address"); // creates New Address button
    private final int screenWidth;
    private final int screenHeight;    
    private JToolBar toolBar = new JToolBar();


    Banner(){
        
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(screenWidth), 
        NavigationButton.getButtonHeight(screenHeight));
        
        
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight)); 
        
        toolbar.setBorderPainted(false);
        
        toolBar.setLayout(new FlowLayout());
        toolBar.add(backButton);
        toolBar.add(newAddressButton);
        toolBar.add(forwardButton);
        
        toolBar.setBorderPainted(false);
        
        add(toolBar);
    
    } // end of constructor
    
} // end of class
