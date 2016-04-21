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
import capstonelh.IRSection;
import capstonead.CommentsInspection;

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    
    private Title title = new Title();
    private JPanel businessInformation = new JPanel();
    private JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    private EmergencyContactFields contactFields = new EmergencyContactFields();
    
    
    //create numbered sections
    private IRSection section1 = new IRSection(1);
    private IRSection section2 = new IRSection(2);
    private IRSection section3 = new IRSection(3);
    private IRSection section4 = new IRSection(4);
    private IRSection section5 = new IRSection(5);
    private IRSection section6 = new IRSection(6);
    private IRSection section7 = new IRSection(7);
    private IRSection section8 = new IRSection(8);
    private IRSection section9 = new IRSection(9);
    private IRSection section10 = new IRSection(10);
    private IRSection section11 = new IRSection(11);
    private IRSection section12 = new IRSection(12);
    private IRSection section13 = new IRSection(13);
    private IRSection section14 = new IRSection(14);
    private IRSection section15 = new IRSection(15);
    private IRSection section16 = new IRSection(16);
    private IRSection section17 = new IRSection(17);
    private IRSection section18 = new IRSection(18);
    
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
