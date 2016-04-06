/*
 * This class creates the the search area for the homescreen
 */
package capstoneal;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.GridLayout;

public class Search extends JPanel{
    
    JTextField searchBar = new JTextField("Search..."); // create search field
    JButton searchButton = new JButton("GO"); // creates search button
    JCheckBox nwcb = new JCheckBox("NW"); // create nw check box
    JCheckBox necb = new JCheckBox("NE"); // create ne check box
    JCheckBox swcb = new JCheckBox("SW"); // create sw check box
    JCheckBox secb = new JCheckBox("SE"); // create se check box
        
    Search(){
        
        setLayout(new GridLayout()); // set the layout to GridLayout
        
        add(nwcb); // add nw check box
        add(necb); // add ne check box
        add(swcb); // add sw check box
        add(secb); // add se check box
        add(searchBar); // add search bar text field
        add(searchButton); // add search button
    } // end of constructor
} // end of class
