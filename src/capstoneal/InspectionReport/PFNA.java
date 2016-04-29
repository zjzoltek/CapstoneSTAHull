package capstoneal.InspectionReport;

/**
 *
 * @author ACLeavitt0612
 * 04/13/2016
 * 
 */
// swing imports
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
// awt imports
import java.awt.FlowLayout;

public class PFNA extends JPanel{
    // JCheckBoxs and button group
    private final JCheckBox pass = new JCheckBox();
    private final JCheckBox fail = new JCheckBox();
    private final JCheckBox na = new JCheckBox();
    private final ButtonGroup group =  new ButtonGroup();
    // Instantiating textfield
    private final JLabel label;
    
    private final FlowLayout layout = new FlowLayout();
    
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
