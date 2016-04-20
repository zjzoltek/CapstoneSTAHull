/*
 * This program will create a drop down boxes for the location promts on 
 * the Inspection form portion of the edit page
 * Phillip Bledsoe
 * 041416
 */
package locationgui;

import javax.swing.*;
import javax.swing.JComboBox; //import for drop down boxes
import java.awt.*;



public class LocationDropDown extends JPanel{
    
    public LocationDropDown(){
        
         //JPanel panel = new JPanel(new GridBagLayout());
        //array of strings for the options in the drop box 
        String location[] = {"A", "B", "C", "D"};
    
        //creating the panel for the drop box to be in
        //JPanel locationPanel = new JPanel();
        
        //setting the panel layout
        this.setLayout(new GridBagLayout());
        
        //creating the drop box
        JComboBox locationDrop = new JComboBox(location);
        locationDrop.setSelectedIndex(0);
        //adding the drop box to the panne;
        
        JLabel words = new JLabel("  words n stuff  ");
        
        JTextField field = new JTextField("Words in a box",20);
        
        this.add(locationDrop);
        this.add(words);
        this.add(field);
    } 
    
    
    
        
    
}

