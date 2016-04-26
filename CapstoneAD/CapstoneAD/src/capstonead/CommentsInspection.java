/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonead;

/**
 *
 * @author awdobson1129
 */

import javax.swing.*;
import java.awt.*;

public class CommentsInspection extends JPanel{
        BorderLayout layout = new BorderLayout(); // create layout
        FlowLayout layout2 = new FlowLayout(); // create layout
        JLabel comments = new JLabel("ADDITIONAL  VIOLATIONS/COMMENTS: Type comments below"); // create a varriable to hold the string
        JLabel date = new JLabel("Date of Report:"); // create a varriable to hold the string
        JLabel inspector = new JLabel("Inspector:"); // create a varriable to hold the string
        JLabel signature = new JLabel("Signature:"); // create a varriable to hold the string
        JTextArea commentArea = new JTextArea(8, 1); // arguements rows, columns
        
        JTextField dateField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField inspectorField = new JTextField(10); // create the text fields and show 10 spaces
        JTextField signatureField = new JTextField(10); // create the text fields and show 10 spaces
        
        JPanel signiturePanel = new JPanel(); // create the text fields
    
        CommentsInspection(){
            setLayout(layout); // set the layout
            
            add(comments, BorderLayout.NORTH); // add the string Comments to the screen 
            add(commentArea, BorderLayout.CENTER); // add a text area to the screen
        
            signiturePanel.setLayout(layout2); // set new layout
            signiturePanel.add(date); // add the string date of report to the screen
            signiturePanel.add(dateField); // add a text field to hold the date
            signiturePanel.add(inspector); // add the string Inspector to the screen
            signiturePanel.add(inspectorField); // add a text field to hold the inspectors name
            signiturePanel.add(signature); // add the string Signature to the screen
            signiturePanel.add(signatureField); // add a text field to hold the signature of who ever signs off on the form
            
            add(signiturePanel, BorderLayout.SOUTH);
        
        }
}
