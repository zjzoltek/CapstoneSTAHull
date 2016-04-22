package capstoneal.InspectionReport;

/**
 *
 * @author ACLeavitt0612
 */

import javax.swing.*;
import java.awt.*;


public class EmergencyContactFields extends JPanel{
    private final FlowLayout layout = new FlowLayout();
    private final JLabel nameLabel = new JLabel("Name");
    private final JLabel contactTypeLabel = new JLabel("Contact Type");
    private final JLabel numberLabel = new JLabel("Number");
    private final JLabel typeOfPhoneLabel = new JLabel("Type of Phone");
    
    public EmergencyContactFields()
    {
        setLayout(layout);
        
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        add(nameLabel);
        add(contactTypeLabel);
        add(numberLabel);
        add(typeOfPhoneLabel);
        
        
    }
    
    
}
