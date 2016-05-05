/*
 * This program will create a drop down boxes for the location promts on 
 * the Inspection form portion of the edit page
 * Phillip Bledsoe
 * 041416
 */
package capstonepb.locationgui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox; //import for drop down boxes
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicBorders;



public class LocationDropDown extends JPanel{
    
    public LocationDropDown(String label, String fieldText){
        super(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        //JPanel panel = new JPanel(new GridBagLayout());
        //array of strings for the options in the drop box 
        String location[] = {"A", "B", "C", "D"};
    
        //creating the panel for the drop box to be in
        //JPanel locationPanel = new JPanel();
        
        //creating the drop box
        JComboBox locationDrop = new JComboBox(location);
        locationDrop.setSelectedIndex(0);
        //adding the drop box to the panne;
        
        JLabel words = new JLabel(label);
        
        JTextArea field = new JTextArea(fieldText);
        field.setBorder(BasicBorders.getTextFieldBorder());
        field.setColumns(8);
        //adjusting constraints and adding components
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,5,0,0);
        add(locationDrop, c);
        c.gridx = 1;
        c.insets = new Insets(0,5,0,0);
        add(words, c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,0);
        c.gridwidth = 3;
        add(field, c);
    } 
    
    
    
        
    
}

