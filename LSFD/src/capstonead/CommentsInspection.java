package capstonead;

/**
 *
 * @author awdobson1129
 */

import capstonezz.InspectionReport.DateField;
import javax.swing.*;
import java.awt.*;

public class CommentsInspection extends JPanel{
    private final BorderLayout layout = new BorderLayout(); // create layout
    private final FlowLayout layout2 = new FlowLayout(); // create layout
    private final JLabel comments = new JLabel("ADDITIONAL  VIOLATIONS/COMMENTS:                                                                                                                                                                                                                 P = Pass     F = Fail   NA = Not Applicable"); // create a varriable to hold the string
    private final JLabel date = new JLabel("Date of Report:"); // create a varriable to hold the string
    private final JLabel inspector = new JLabel("Inspector:"); // create a varriable to hold the string
    private final JLabel signature = new JLabel("Signature:"); // create a varriable to hold the string
    private final JTextArea commentArea = new JTextArea(); // arguements rows, columns

    private final DateField dateField = new DateField('.', "Date of Report"); // create the text fields and show 10 spaces
    private final JTextField inspectorField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField signatureField = new JTextField(10); // create the text fields and show 10 spaces

    private final JPanel signiturePanel = new JPanel(); // create the text fields
    
    public CommentsInspection(){
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
