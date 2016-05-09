package capstoneal.LossReduction;

import capstonezz.NumberDocument;
import javax.swing.*;
import java.awt.*;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author awdobson1129
 */
public class LRMisc extends JPanel{
    private final BorderLayout layout = new BorderLayout(); // create layout
    private final FlowLayout layout2 = new FlowLayout(); // create layout
    private final JLabel CLASS = new JLabel("CLASS:"); // create a varriable to hold the string
    private final JLabel BOX = new JLabel("BOX:"); // create a varriable to hold the string
    private final JLabel PFA = new JLabel("PFA #:"); // create a varriable to hold the string
    private final JLabel KNOX_BOX = new JLabel("KNOX BOX:"); // create a varriable to hold the string
    private final JLabel LOCATION = new JLabel("KNOX LOCATION:"); // create a varriable to hold the string


    private final JTextField CLASSField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField BOXField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField PFAField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField KNOX_BOXField = new JTextField(10); // create the text fields and show 10 spaces
    private final JTextField LOCATIONField = new JTextField(10); // create the text fields and show 10 spaces

    private final JPanel signiturePanel = new JPanel(); // create the text fields
    
    public LRMisc(){
        setLayout(layout); // set the layout
        
        CLASSField.setName("51");
        BOXField.setName("52");
        PFAField.setName("53");
        KNOX_BOXField.setName("54");
        LOCATIONField.setName("55");
        
        ((AbstractDocument)PFAField.getDocument()).setDocumentFilter(new NumberDocument());
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
