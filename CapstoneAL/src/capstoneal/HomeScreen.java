/*
 * This class uses JPanel to assemble the componenets of the homescreen
 */
package capstoneal;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import java.awt.BorderLayout;
import javax.swing.*;

public class HomeScreen extends JPanel{
    
    Banner banner = new Banner(); // create an instance of Banner
    Search search = new Search(); // create an instance of Search
    NotificationBar notificationBar = new NotificationBar(); // create an instance of NotificationBar
    
    HomeScreen(){
        
        setLayout(new BorderLayout()); // sets layout to border layout
        
        // add the components to the screen
        add(banner, BorderLayout.NORTH);
        add(search, BorderLayout.CENTER);
        add(notificationBar, BorderLayout.SOUTH);
    } // end of constructor
    
} // end of class
