/*
 * This class uses JPanel to assemble the componenets of the homescreen
 */
package capstone;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Dimension;

public class HomeScreen extends JPanel{
    
    HomeScreen(int width, int height){
        
        setLayout(new BorderLayout()); // sets layout to border layout
        
        
        Banner banner = new Banner(); // create an instance of Banner
        Search search = new Search(); // create an instance of Search
        NotificationBar notificationBar = new NotificationBar(); // create an instance of NotificationBar
        
        
        // add the components to the screen
        add(banner, BorderLayout.NORTH);
        add(search, BorderLayout.CENTER);
        add(notificationBar, BorderLayout.SOUTH);
    } // end of constructor
    
} // end of class
