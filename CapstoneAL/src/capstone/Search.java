/*
 * This class creates the the search area for the homescreen
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


public class Search extends JPanel{
    
    JTextField searchBar = new JTextField("Search..."); // create search field
    JButton searchButton = new JButton("GO"); // creates search button
    
    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    
    // making check boxes
    private JCheckBox nwcb = new JCheckBox("NW");
    private JCheckBox necb = new JCheckBox("NE");
    private JCheckBox swcb = new JCheckBox("SW");
    private JCheckBox secb = new JCheckBox("SE");
        
    Search(){
        
        setLayout(new GridLayout()); // set the layout to GridLayout
        layout = new GridBagLayout();
        setLayout(layout); // sets the layout to GridLayout
        constraints = new GridBagConstraints();
        
        
        // adding check boxes to panel
        addComponent(nwcb, 0, 0, 1, 1);
        addComponent(necb, 0, 1, 1, 1);
        addComponent(swcb, 0, 2, 1, 1);
        addComponent(secb, 0, 3, 1, 1);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1000;
        addComponent(searchBar, 0, 4, 1, 1); // add search bar text field
        constraints.weightx = 0;
        addComponent(searchButton, 0, 6, 1, 1); // add search button
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
