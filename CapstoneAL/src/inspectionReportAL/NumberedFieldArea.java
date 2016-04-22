/*
 * This class creates all of the 18 numbered fields and adds them to a JPanel to later be added to 
 * The InspectionReport form
 */
package inspectionReportAL;

import capstonelh.NumberedField;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author ACLeavitt0612
 */
public class NumberedFieldArea extends JPanel{
    
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    
    
        //create numbered sections
    private NumberedField section1 = new NumberedField(1);
    private NumberedField section2 = new NumberedField(2);
    private NumberedField section3 = new NumberedField(3);
    private NumberedField section4 = new NumberedField(4);
    private NumberedField section5 = new NumberedField(5);
    private NumberedField section6 = new NumberedField(6);
    private NumberedField section7 = new NumberedField(7);
    private NumberedField section8 = new NumberedField(8);
    private NumberedField section9 = new NumberedField(9);
    private NumberedField section10 = new NumberedField(10);
    private NumberedField section11 = new NumberedField(11);
    private NumberedField section12 = new NumberedField(12);
    private NumberedField section13 = new NumberedField(13);
    private NumberedField section14 = new NumberedField(14);
    private NumberedField section15 = new NumberedField(15);
    private NumberedField section16 = new NumberedField(16);
    private NumberedField section17 = new NumberedField(17);
    private NumberedField section18 = new NumberedField(18);
    
    NumberedFieldArea(){
        setLayout(layout);
        
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.EAST;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        // adding the numbered fields into the form
        //column 0
        addComponent(section1, 0, 0, 1, 1);
        addComponent(section2, 1, 0, 1, 1);
        addComponent(section3, 2, 0, 1, 1);
        addComponent(section4, 3, 0, 1, 1);
        //column 1
        addComponent(section5, 0, 1, 1, 1);
        addComponent(section6, 1, 1, 1, 1);
        addComponent(section7, 2, 1, 1, 1);
        addComponent(section8, 3, 1, 1, 1);
        //column 2
        addComponent(section9, 0, 2, 1, 2);
        addComponent(section10, 2, 2, 1, 2);
        //column 3
        addComponent(section11, 0, 3, 1, 1);
        addComponent(section12, 1, 3, 1, 1);
        addComponent(section13, 2, 3, 1, 1);
        addComponent(section14, 3, 3, 1, 1);
        //column 4
        addComponent(section15, 0, 4, 1, 1);
        addComponent(section16, 1, 4, 1, 1);
        addComponent(section17, 2, 4, 1, 1);
        addComponent(section18, 3, 4, 1, 1);
        //end of numbered fields
    }
    
        private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridy = row;
        constraints.gridx = column;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    } // end of addComponent method
}
