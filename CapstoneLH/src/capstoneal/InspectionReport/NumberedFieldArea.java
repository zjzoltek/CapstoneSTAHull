package capstoneal.InspectionReport;

import capstonelh.IRSection;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author ACLeavitt0612
 */
public class NumberedFieldArea extends JPanel{
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
        setLayout(new GridLayout(6,3,5,5));
        
        //constraints.anchor = GridBagConstraints.EAST;
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        // adding the numbered fields into the form
        //column 0
        
        add(section1);
        add(section2);
        add(section3);
        add(section4);
        //column 1
        add(section5);
        add(section6);
        add(section7);
        add(section8);
        //column 2
        add(section9);
        add(section10);
        //column 3
        add(section11);
        add(section12);
        add(section13);
        add(section14);
        //column 4
        add(section15);
        add(section16);
        add(section17);
        add(section18);
        //end of numbered fields
    }
}
