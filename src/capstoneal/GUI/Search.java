/*
 * This class creates the the search area for the homescreen
 */
package capstoneal.GUI;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import capstonezz.CapstoneConstants;
import capstonezz.GUI.SearchBox;
import capstonezz.LinkerModel;
import capstonezz.Util;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders;


public class Search extends JPanel implements LinkerModel{
    
    private final SearchBox searchBar = new SearchBox("Address Search . . .", 30, 5, false); // create search field
    private final JButton searchButton = new JButton("GO"); // creates search button
    
    private final GridBagConstraints constraints = new GridBagConstraints();
    
    public Search(){
        setBackground(CapstoneConstants.PANEL_BG);
        setLayout(new GridBagLayout()); // sets the layout to GridLayout
        constraints.insets = new Insets(5,5,5,5);
        searchButton.setBorder(new BasicBorders.ButtonBorder(Color.BLACK,
        Color.GRAY, Color.WHITE, Color.WHITE.darker()));
        searchButton.setContentAreaFilled(false);
        searchButton.setPreferredSize(new Dimension(Util.getScreenDimension().width / 8, 30));
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 0;
        searchBar.setFocusLostColor(Color.WHITE);
        addComponent(searchBar, 0, 4, 1, 1); // add search bar text field
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        addComponent(searchButton, 1, 4, 1, 1); // add search button
        
    } // end of constructor
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        ((GridBagLayout)getLayout()).setConstraints(component, constraints); //set constraints
        add(component);
    }
        
    @Override
    public JTextField getLinkingComponent() {
        return searchBar;
    }
    
    public JButton getGoButton(){
        return searchButton;
    }
} // end of class
