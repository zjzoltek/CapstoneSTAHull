package capstonezz.InspectionReport;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 22, 2016
 */

public class BasicInformation extends JPanel {
    private final JLabel business;
    private final JLabel phone;
    private final JLabel address;
    
    private final JTextField businessField;
    private final JTextField addressField;
    private final PhoneNumberBox phoneField;
    
    public BasicInformation(String businessLabel, String phoneLabel, String addressLabel){
        super(new GridBagLayout());
        
        business = new JLabel(businessLabel);
        phone = new JLabel(phoneLabel);
        address = new JLabel(addressLabel);
        
        businessField = new JTextField(10);
        addressField = new JTextField(13);
        phoneField = new PhoneNumberBox(7);
        
        init();
    }
    
    private void init(){
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);
        
        add(business, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(businessField, c);
        
        c.gridx = 1;
        c.gridy = 0;
        
        add(phone, c);
        
        c.gridx = 1;
        c.gridy = 1;
        
        add(phoneField, c);
        
        c.gridx = 2;
        c.gridy = 0;
        
        add(address, c);
        
        c.gridx = 2;
        c.gridy = 1;
        
        add(addressField, c);
    }
}
