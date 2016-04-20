/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.InspectionReport;

/**
 *
 * @author ACLeavitt0612
 */

import java.awt.*;
import javax.swing.*;
import capstonelh.NumberedField;
import capstonead.CommentsInspection;

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    
    private Title title = new Title();
    private JPanel businessInformation = new JPanel();
    private JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    private EmergencyContactFields contactFields = new EmergencyContactFields();
    
    
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
    
    private CommentsInspection commentsInspection = new CommentsInspection();
    
    InspectionReport(){
        
        setLayout(layout);
        constraints = new GridBagConstraints();
        //setting basic constraints
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1000;
        addComponent(title, 0, 0, 1, 1);
        
        businessInformation.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(businessInformation, 1, 0, 1, 1);
        // creating and adding the emergancy contact label
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
