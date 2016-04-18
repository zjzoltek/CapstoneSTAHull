/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 */

import java.awt.*;
import javax.swing.*;

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    
    private Title title = new Title();
    private JPanel businessInformation = new JPanel();
    private JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    private EmergencyContactFields contactFields = new EmergencyContactFields();
    
    
    //create numbered sections
    private numberedField section1 = new numberedField(1);
    private numberedField section2 = new numberedField(2);
    private numberedField section3 = new numberedField(3);
    private numberedField section4 = new numberedField(4);
    private numberedField section5 = new numberedField(5);
    private numberedField section6 = new numberedField(6);
    private numberedField section7 = new numberedField(7);
    private numberedField section8 = new numberedField(8);
    private numberedField section9 = new numberedField(9);
    private numberedField section10 = new numberedField(10);
    private numberedField section11 = new numberedField(11);
    private numberedField section12 = new numberedField(12);
    private numberedField section13 = new numberedField(13);
    private numberedField section14 = new numberedField(14);
    private numberedField section15 = new numberedField(15);
    private numberedField section16 = new numberedField(16);
    private numberedField section17 = new numberedField(17);
    private numberedField section18 = new numberedField(18);
    
    private CommentsInspection commentsInspection = new CommentsInspection();
    
    InspectionReport(){
        
        setLayout(layout);
        constraints = new GridBagConstraints();
        
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1000;
        addComponent(title, 0, 0, 1, 1);
        
        businessInformation.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(businessInformation, 1, 0, 1, 1);
        
        emergancyContactLabel.setFont(new Font("Serif", Font.BOLD, 16));
        emergancyContactLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(emergancyContactLabel, 2, 0, 1, 1);
        
        addComponent(contactFields, 3, 0, 1, 1);
        
        
        // adding the numbered fields into the form
        //column 0
        addComponent(section1, 4, 0, 1, 1);
        addComponent(section2, 5, 0, 1, 1);
        addComponent(section3, 6, 0, 1, 1);
        addComponent(section4, 7, 0, 1, 1);
        //column 1
        addComponent(section5, 4, 1, 1, 1);
        addComponent(section6, 5, 1, 1, 1);
        addComponent(section7, 6, 1, 1, 1);
        addComponent(section8, 7, 1, 1, 1);
        //column 2
        addComponent(section9, 4, 2, 1, 2);
        addComponent(section10, 6, 2, 1, 2);
        //column 3
        addComponent(section11, 4, 3, 1, 1);
        addComponent(section12, 5, 3, 1, 1);
        addComponent(section13, 6, 3, 1, 1);
        addComponent(section14, 7, 3, 1, 1);
        //column 4
        addComponent(section15, 4, 4, 1, 1);
        addComponent(section16, 5, 4, 1, 1);
        addComponent(section17, 6, 4, 1, 1);
        addComponent(section18, 7, 4, 1, 1);
        //end of numbered fields
        
        addComponent(commentsInspection, 8, 0, 1, 1);
        
        
        
    } // end of InspectionReport constructor
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    } // end of addComponent method
} // end of class
