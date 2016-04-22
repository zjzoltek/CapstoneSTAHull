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

public class EmergencyContact extends JPanel{
    private final JLabel name;
    private final JLabel phone;
    private final JLabel contactType;
    private final JLabel typeOfPhone;
    
    private final JTextField nameField;
    private final JTextField contactField;
    private final JTextField TOPField;
    private final PhoneNumberBox numberField;
    
    public EmergencyContact(String nameLabel, String contactLabel, String phoneLabel, String TOPLabel){
        super(new GridBagLayout());
        
        name = new JLabel(nameLabel);
        phone = new JLabel(phoneLabel);
        contactType = new JLabel(contactLabel);
        typeOfPhone = new JLabel(TOPLabel);
        
        nameField = new JTextField(10);
        contactField = new JTextField(13);
        TOPField = new JTextField(11);
        numberField = new PhoneNumberBox(7);
        
        init();
    }
    
    private void init(){
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);
        
        add(name, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(nameField, c);
        
        c.gridx = 1;
        c.gridy = 0;
        
        add(contactType, c);
        
        c.gridx = 1;
        c.gridy = 1;
        
        add(contactField, c);
        
        c.gridx = 2;
        c.gridy = 0;
        
        add(phone, c);
        
        c.gridx = 2;
        c.gridy = 1;
        
        add(numberField, c);
        
        c.gridx = 3;
        c.gridy = 0;
        
        add(typeOfPhone, c);
        
        c.gridx = 3;
        c.gridy = 1;
        
        add(TOPField, c);
    }
}
