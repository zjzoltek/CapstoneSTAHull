/*
 * This class creates the banner for the homescreen
 */
package capstoneal.GUI;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.*;
import capstonezz.GUI.NavigationButton;
import capstonezz.Util;


public class Banner extends JPanel{
    
    private NavigationButton backButton; // creates back button
    private NavigationButton forwardButton; // creates forward button
    private JButton newAddressButton = new JButton("New Address"); // creates New Address button
    private final int screenWidth;
    private final int screenHeight;    
    private JToolBar toolBar = new JToolBar();


    Banner(){
        
        //getting dimensions for buttons
        screenWidth = Util.getScreenDimension().width;
        screenHeight = Util.getScreenDimension().height;
        
        //creating back button
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(screenWidth), 
        NavigationButton.getButtonHeight(screenHeight));
        
        //creating forward button
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight)); 
        
        
        toolBar.setBorderPainted(false);
        
        toolBar.setLayout(new FlowLayout());
        //adding the buttons to the toolbar
        toolBar.add(backButton);
        toolBar.add(newAddressButton);
        toolBar.add(forwardButton);
        
        toolBar.setBorderPainted(false);
        
        add(toolBar); // add toolBar to the panel
    
    } // end of constructor
    
} // end of class
