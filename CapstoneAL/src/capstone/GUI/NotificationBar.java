/*
 * This class extends JPanel to make a panel containing the notification bar 
 */
package capstone.GUI;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.*;

public class NotificationBar extends JPanel{
    
    //Strings for status buttons
    String overdueText = "Overdue 0";
    String pendingText = "Pending 0";
    String failedText = "Failed 0";
    
    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    
    NotificationBar()
    {
        
        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        //Create status buttons
        JButton overdueB = new JButton(overdueText);
        JButton pendingB = new JButton(pendingText);
        JButton failedB = new JButton(failedText);
        
        constraints.weightx = 1000;
        constraints.fill = GridBagConstraints.BOTH;
        
        // add buttons to panel
        addComponent(overdueB, 0, 0, 1, 1);
        addComponent(pendingB, 0, 1, 1, 1);
        addComponent(failedB, 0, 2, 1, 1);
    } // end of constructor
    
        private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    }
} // end of class
