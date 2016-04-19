/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javax.swing.SwingConstants;

public class PFNA extends JPanel{
    // JRadioButtons and button group
    private final JRadioButton pass = new JRadioButton();
    private final JRadioButton fail = new JRadioButton();
    private final JRadioButton na = new JRadioButton();
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
