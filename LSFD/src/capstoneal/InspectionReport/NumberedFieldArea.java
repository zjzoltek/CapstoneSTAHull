package capstoneal.InspectionReport;

import capstonelh.IRSection;
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
    private final IRSection section1 = new IRSection(1);
    private final IRSection section2 = new IRSection(2);
    private final IRSection section3 = new IRSection(3);
    private final IRSection section4 = new IRSection(4);
    private final IRSection section5 = new IRSection(5);
    private final IRSection section6 = new IRSection(6);
    private final IRSection section7 = new IRSection(7);
    private final IRSection section8 = new IRSection(8);
    private final IRSection section9 = new IRSection(9);
    private final IRSection section10 = new IRSection(10);
    private final IRSection section11 = new IRSection(11);
    private final IRSection section12 = new IRSection(12);
    private final IRSection section13 = new IRSection(13);
    private final IRSection section14 = new IRSection(14);
    private final IRSection section15 = new IRSection(15);
    private final IRSection section16 = new IRSection(16);
    private final IRSection section17 = new IRSection(17);
    private final IRSection section18 = new IRSection(18);
    
    public NumberedFieldArea(){
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
