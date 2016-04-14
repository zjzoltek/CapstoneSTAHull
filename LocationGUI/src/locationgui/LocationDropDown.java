/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationgui;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;

/**
 *
 * @author pebledsoe1231
 */
public class LocationDropDown {
    
    public void locationBox(){
        
         String location[] = {"A", "B", "C", "D"};
    
        JPanel locationPanel = new JPanel();
    
        JComboBox locationDrop = new JComboBox(location);
    
        locationPanel.setLayout(new GridBagLayout());
        locationPanel.add(locationDrop);
    
    
    //public void steven(){
    //locationPanel.add(locationDrop);
    
    } 
}

