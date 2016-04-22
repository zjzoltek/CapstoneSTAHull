/*
 * This class creates a field with three radio buttons for pass, fail, and not avaible options
 * as well as a JLabel to the right
 * The constructor takes a string arguement which is the text for the JLabel
 */
package inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 * 04/13/2016
 * 
 */
// swing imports
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
// awt imports
import java.awt.FlowLayout;

public class PFNA extends JPanel{
    // JRadioButtons and button group
    private JRadioButton pass = new JRadioButton();
    private JRadioButton fail = new JRadioButton();
    private JRadioButton na = new JRadioButton();
    private ButtonGroup group =  new ButtonGroup();
    // Instantiating textfield
    private JLabel label;
    
    private FlowLayout layout = new FlowLayout();
    
    public PFNA(String labelText)
    {
        setLayout(layout); // set layout of screen
        
        //add buttons to group of radiobuttons
        group.add(pass);
        group.add(fail);
        group.add(na);
        
        //initialize text field
        label = new JLabel(labelText);
        
        //add components to the JPanel
        add(pass);
        add(fail);
        add(na);
        add(label);
    } // end of constructor
} // end of method
