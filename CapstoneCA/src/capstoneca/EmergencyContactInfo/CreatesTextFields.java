/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergencyContactInfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author ccallen0504
 */
public class CreatesTextFields extends JPanel {

    private JLabel label;
    
    //text fields
    private JTextField nameF = new JTextField("Name", 15);
    private JTextField contactf = new JTextField("Contact Type", 10);
    
    //Makes the layout
    private GridBagLayout layout = new GridBagLayout();
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    //adding in the sections of text fields
    CreatesTextFields (String labelText)
    {
        setLayout(layout);
        
        c.gridx = -1;
        c.gridy = -1;
        panel.add(nameF,c);
        
        c.gridx = -1;
        c.gridy = -1;
        panel.add(contactf,c);
        
        label = new JLabel(labelText);
        
        add(nameF,c);
        add(contactf,c);
    }   
}
