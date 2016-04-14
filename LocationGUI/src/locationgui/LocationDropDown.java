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


public class LocationDropDown {
    
    public void locationBox(){
        
        //array of strings for the options in the drop box 
        String location[] = {"A", "B", "C", "D"};
    
        //creating the panel for the drop box to be in
        JPanel locationPanel = new JPanel();
        
        //creating the drop box
        JComboBox locationDrop = new JComboBox(location);
        locationDrop.setSelectedIndex(4);
        
        //setting the panel layout
        locationPanel.setLayout(new GridBagLayout());
        
        //adding the drop box to the panne;
        locationPanel.add(locationDrop);
    
    
    //public void steven(){
    //locationPanel.add(locationDrop);
    
    } 
}

