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

import javax.swing.*;
import java.awt.*;


public class EmergencyContactFields extends JPanel{
    private FlowLayout layout = new FlowLayout();
    private JLabel nameLabel = new JLabel("Name");
    private JLabel contactTypeLabel = new JLabel("Contact Type");
    private JLabel numberLabel = new JLabel("Number");
    private JLabel typeOfPhoneLabel = new JLabel("Type of Phone");
    
    EmergencyContactFields()
    {
        setLayout(layout);
        
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        add(nameLabel);
        add(contactTypeLabel);
        add(numberLabel);
        add(typeOfPhoneLabel);
        
        
    }
    
    
}
