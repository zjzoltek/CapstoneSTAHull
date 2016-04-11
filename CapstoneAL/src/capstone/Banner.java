/*
 * This class creates the banner for the homescreen
 */
package capstone;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.*;


public class Banner extends JPanel{
    
    JButton backButton = new JButton("Back"); // creates back button
    JButton forwardButton = new JButton("Forward"); // creates forward button
    JButton newAddressButton = new JButton("New Address"); // creates New Address button
    
    JToolBar toolBar = new JToolBar();


    Banner(){
        
        toolBar.add(backButton);
        toolBar.add(newAddressButton);
        toolBar.add(forwardButton);
        
        add(toolBar);
        
        
        toolBar.setBorderPainted(false);
    
    } // end of constructor
    
} // end of class
