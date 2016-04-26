/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.LossReduction;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author awdobson1129
 */
public class ComponentThree extends JPanel{
    BorderLayout layout = new BorderLayout(); // create layout
        FlowLayout layout2 = new FlowLayout(); // create layout
        JLabel CLASS = new JLabel("CLASS:"); // create a varriable to hold the string
        JLabel BOX = new JLabel("BOX:"); // create a varriable to hold the string
        JLabel PFA = new JLabel("PFA #:"); // create a varriable to hold the string
        JLabel KNOX_BOX = new JLabel("KNOX BOX:"); // create a varriable to hold the string
        JLabel LOCATION = new JLabel("KNOX LOCATION:"); // create a varriable to hold the string
        
        
        JTextField CLASSField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField BOXField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField PFAField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField KNOX_BOXField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField LOCATIONField = new JTextField(10); // create the text fields and show 10 spaces
        
        JPanel signiturePanel = new JPanel(); // create the text fields
    
        ComponentThree(){
            setLayout(layout); // set the layout
            
            signiturePanel.setLayout(layout2); // set new layout
            signiturePanel.add(CLASS); // add the string CLASS of report to the screen
            signiturePanel.add(CLASSField); // add a text field to hold the class type
            signiturePanel.add(BOX); // add the string BOX to the screen
            signiturePanel.add(BOXField); // add a text field to hold the BOX
            signiturePanel.add(PFA); // add the string PFA to the screen
            signiturePanel.add(PFAField); // add a text field to hold the PFA# of the form
            signiturePanel.add(KNOX_BOX); // add the string KNOX_BOX to the screen
            signiturePanel.add(KNOX_BOXField); // add a text field to hold the KNOX_BOX
            signiturePanel.add(LOCATION); // add the string LOCATION to the screen
            signiturePanel.add(LOCATIONField); // add a text field to hold the location of the form
            
            add(signiturePanel, BorderLayout.CENTER); // set the location of the boxes on the screen
        
        }
}
