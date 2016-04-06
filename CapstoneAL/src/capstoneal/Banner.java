/*
 * This class creates the banner for the homescreen
 */
package capstoneal;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 */

import javax.swing.*;
import java.awt.GridLayout;

public class Banner extends JPanel{
    
    JButton backButton = new JButton("Back"); // creates back button
    JButton forwardButton = new JButton("Forward"); // creates forward button
    JButton newAddressButton = new JButton("New Address"); // creates New Address button
    
    Banner(){
    
        setLayout(new GridLayout()); // sets the layout to GridLayout
        
        add(backButton); // adds the backButton to the panel
        add(forwardButton); // add the forwardButton to the panel
        add(newAddressButton); // add the newAddressButton to the panel
    
    } // end of constructor
} // end of class
