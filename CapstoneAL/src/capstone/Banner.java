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
    
    private final GridBagLayout layout;
    private final GridBagConstraints constraints;

    Banner(){
        layout = new GridBagLayout();
        setLayout(layout); // sets the layout to GridLayout
        constraints = new GridBagConstraints();
        
        constraints.anchor = GridBagConstraints.EAST;
        addComponent(backButton, 0, 0, 1, 1); // adds the backButton to the panel
        addComponent(forwardButton, 0, 1, 1, 1); // add the forwardButton to the panel
        constraints.weightx = 1000;
        addComponent(newAddressButton, 0, 4, 1, 1); // add the newAddressButton to the panel
        
        setBackground(Color.GRAY);
    
    } // end of constructor
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    }
} // end of class
