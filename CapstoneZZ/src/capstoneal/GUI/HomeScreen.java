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

import java.awt.BorderLayout;
import javax.swing.*;

public class HomeScreen extends JPanel{
    public final Banner banner;
    public final Search search;
    public final NotificationBar notificationBar;
    
    public HomeScreen(int width, int height){
        notificationBar = new NotificationBar(); // create an instance of NotificationBar
        search = new Search(); // create an instance of Search
        banner = new Banner(); // create an instance of Banner
        setLayout(new BorderLayout()); // sets layout to border layout
        // add the components to the screen
        add(banner, BorderLayout.PAGE_START);
        add(search, BorderLayout.CENTER);
        add(notificationBar, BorderLayout.SOUTH);
    } // end of constructor
    
} // end of class
