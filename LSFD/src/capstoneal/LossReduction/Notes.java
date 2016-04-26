/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.LossReduction;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author awdobson1129
 */
public class Notes extends JPanel{
    
    
    BorderLayout layout = new BorderLayout(); // create layout
    FlowLayout layout2 = new FlowLayout(); // create layout
    static String yes = "Yes"; // string for the yes button
    static String no = "No"; // string for the no button
    JLabel date = new JLabel("Date of Report:"); // create a varriable to hold the string
    JLabel inspector = new JLabel("Inspector:"); // create a varriable to hold the string
    JLabel YesOrNo = new JLabel("Prevention Folow-up Required?"); // create a varriable to hold the string
    JLabel signature = new JLabel("Signature:"); // create a varriable to hold the string
    JTextArea commentArea = new JTextArea(8, 1); // arguements rows, columns
    JTextField dateField = new JTextField(10); // create the text fields and show 10 spaces
    JTextField inspectorField = new JTextField(10); // create the text fields and show 10 spaces
    JTextField signatureField = new JTextField(10); // create the text fields and show 10 spaces
    
    JCheckBox YesButton = new JCheckBox("YES"); // create check box
    JCheckBox NoButton = new JCheckBox("NO"); // create check box
    ButtonGroup group = new ButtonGroup(); // create the group so one check box can be selected
    
    
    JPanel signiturePanel = new JPanel(); // create the text fields
    
        Notes(){
            setLayout(layout); // set the layout
            
            add(commentArea, BorderLayout.CENTER); // add a text area to the screen
        
            signiturePanel.setLayout(layout2); // set new layout
            signiturePanel.add(date); // add the string date of report to the screen
            signiturePanel.add(dateField); // add a text field to hold the date
            signiturePanel.add(inspector); // add the string Inspector to the screen
            signiturePanel.add(inspectorField); // add a text field to hold the inspectors name
            group.add(YesButton); // add the check box to group
            group.add(NoButton); // add the check box to group
            signiturePanel.add(YesOrNo); // add the string to see if there is a fallow up required to the screen
            signiturePanel.add(YesButton); // add check box with string to the screen
            signiturePanel.add(NoButton); // add check box with string to the screen
            signiturePanel.add(signature); // add the string Signature to the screen
            signiturePanel.add(signatureField); // add a text field to hold the signature of who ever signs off on the form
            add(signiturePanel, BorderLayout.SOUTH); // put all the strings and text boxes to the bottom of the screen and the text area to the rest of the screen
        
        }
}