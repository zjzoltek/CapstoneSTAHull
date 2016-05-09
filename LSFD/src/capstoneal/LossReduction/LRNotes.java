/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.LossReduction;
import capstonezz.InspectionReport.DateField;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author awdobson1129
 */
public class LRNotes extends JPanel{
    
    
    private final BorderLayout layout = new BorderLayout(); // create layout
    private final FlowLayout layout2 = new FlowLayout(); // create layout
    private final static String yes = "Yes"; // string for the yes button
    private final static String no = "No"; // string for the no button
    private final JLabel date = new JLabel("Date of Report:"); // create a varriable to hold the string
    private final JLabel inspector = new JLabel("Inspector:"); // create a varriable to hold the string
    private final JLabel YesOrNo = new JLabel("Prevention Folow-up Required?"); // create a varriable to hold the string
    private final JLabel signature = new JLabel("Signature:"); // create a varriable to hold the string
    private final JTextArea commentArea = new JTextArea(8, 1); // arguements rows, columns
    private final DateField dateField = new DateField('.', ""); // create the text fields and show 10 spaces
    private final JTextField inspectorField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField signatureField = new JTextField(10); // create the text fields and show 10 spaces
    
    private final JCheckBox YesButton = new JCheckBox("YES"); // create check box
    private final JCheckBox NoButton = new JCheckBox("NO"); // create check box
    private final ButtonGroup group = new ButtonGroup(); // create the group so one check box can be selected
    
    
    private final JPanel signiturePanel = new JPanel(); // create the text fields
    
    public LRNotes(){
        commentArea.setName("70");
        dateField.setName("71");
        inspectorField.setName("72");
        signatureField.setName("73");
        YesButton.setName("74");
        NoButton.setName("75");
        
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