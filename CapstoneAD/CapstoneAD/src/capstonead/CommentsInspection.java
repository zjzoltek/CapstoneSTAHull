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
        JLabel comments = new JLabel("Comments:"); // create a varriable to hold the string
        JLabel date = new JLabel("Date of Report:"); // create a varriable to hold the string
        JLabel inspector = new JLabel("Inspector:"); // create a varriable to hold the string
        JLabel signature = new JLabel("Signature:"); // create a varriable to hold the string
        JTextArea commentArea = new JTextArea(8, 1); // arguements rows, columns
        
        JTextField dateField = new JTextField(); // create the text fields
        JTextField inspectorField = new JTextField(); // create the text fields
        JTextField signatureField = new JTextField(); // create the text fields
        
        JPanel signiturePanel = new JPanel(); // create the text fields
    
        CommentsInspection(){

            setLayout(layout); // set the layout
            
            add(comments, BorderLayout.NORTH); // add the string Comments to the screen 
            add(commentArea, BorderLayout.CENTER); // add a text area to the screen
        
            signiturePanel.setLayout(layout2); // add the string 
            signiturePanel.add(date); // 
            signiturePanel.add(dateField); // add the string 
            signiturePanel.add(inspector);
            signiturePanel.add(inspectorField); // add the string 
            signiturePanel.add(signature);
            signiturePanel.add(signatureField);
            
            add(signiturePanel, BorderLayout.SOUTH);
        
        }
}
