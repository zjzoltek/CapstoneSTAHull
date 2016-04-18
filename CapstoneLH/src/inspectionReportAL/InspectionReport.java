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
    private JLabel emergancyContactLabel = new JLabel("Emergancy Contact Information", SwingConstants.CENTER);
    
    InspectionReport(){
        
        setLayout(layout);
        constraints = new GridBagConstraints();
        
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1000;
        addComponent(title, 0, 0, 1, 1);
        
        businessInformation.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(businessInformation, 1, 0, 1, 1);
        
        emergancyContactLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        emergancyContactLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(emergancyContactLabel, 2, 0, 1, 1);
        
        
        
    }
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    }
}
