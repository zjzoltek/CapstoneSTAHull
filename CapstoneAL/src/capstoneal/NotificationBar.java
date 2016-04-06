/*
 * This class extends JPanel to make a panel containing the notification bar 
 */
package capstoneal;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import javax.swing.*;
import java.awt.GridLayout;

public class NotificationBar extends JPanel{
    
    //Strings for status buttons
    String overdueText = "Overdue 0";
    String pendingText = "Pending 0";
    String failedText = "Failed 0";
    
    
    
    NotificationBar()
    {
        //Create status buttons
        JButton overdueB = new JButton(overdueText);
        JButton pendingB = new JButton(pendingText);
        JButton failedB = new JButton(failedText);
    
        setLayout(new GridLayout()); // sets layout to GridLayout
        
        // add buttons to panel
        add(overdueB);
        add(pendingB);
        add(failedB);
    } // end of constructor
} // end of class
