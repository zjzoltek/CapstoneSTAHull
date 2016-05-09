package capstonezz.InspectionReport;

import capstoneal.InspectionReport.PFNA;
import capstonezz.NumberDocument;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.AbstractDocument;

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
    private final JLabel occupancy;
    private final JLabel hazardSpec;
    private final JLabel districtL;
    private final JLabel pfaL;
    private final JLabel fireAlarmL;
    private final JLabel locationL;
    private final JLabel SYSLABEL = new JLabel("     P     F    NA");
    private final JLabel ACTIVELABEL = new JLabel("         P     F    NA");
    
    private final JTextField nameField;
    private final JTextField contactField;
    private final JTextField TOPField;
    private final PhoneNumberBox numberField;
    
    private final JTextField occupancyClass;
    private final JTextField hazard;
    private final JComboBox district;
    private final JTextPane pfa;
    private final JTextField fireAlarm;
    private final PFNA active;
    private final PFNA sysNormal;
    private final JTextField panelPadLocation;
    
    public EmergencyContact(){
        super(new GridBagLayout());
        
        name = new JLabel("Name");
        phone = new JLabel("Number");
        contactType = new JLabel("Contact Type");
        typeOfPhone = new JLabel("Type of Phone");
        occupancy = new JLabel("Occupancy Class");
        hazardSpec = new JLabel("Hazard Classification");
        districtL = new JLabel("District");
        pfaL = new JLabel("PFA#");
        fireAlarmL = new JLabel("Fire Alarm Panel");
        locationL = new JLabel("Panel/Pad Location");
        
        
        nameField = new JTextField(10);
        contactField = new JTextField(13);
        TOPField = new JTextField(11);
        occupancyClass = new JTextField();
        hazard = new JTextField();
        fireAlarm = new JTextField();
        panelPadLocation = new JTextField();
        numberField = new PhoneNumberBox(7);
        pfa = new JTextPane();
        
        nameField.setName("10");
        contactField.setName("11");
        TOPField.setName("12");
        occupancyClass.setName("13");
        hazard.setName("14");
        fireAlarm.setName("15");
        panelPadLocation.setName("16");
        numberField.setName("17");
        pfa.setName("18");
        
        district = new JComboBox(new Object[]{1,2,3,4,5,6,7});
        
        district.setName("19");
        ((AbstractDocument)pfa.getDocument()).setDocumentFilter(new NumberDocument());
        
       
        active = new PFNA("Active");
        sysNormal = new PFNA("Sys Normal");
        
        active.setName("20");
        sysNormal.setName("21");
        
        pfa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fireAlarm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelPadLocation.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contactField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numberField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TOPField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        hazard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        occupancyClass.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
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
        
        c.gridx = 0;
        c.gridy = 2;
         
         
        add(occupancy, c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        add(occupancyClass, c);
        
        c.gridx = 1;
        c.gridy = 2;
        
        add(hazardSpec, c);
        
        c.gridx = 1;
        c.gridy = 3;
        
        add(hazard, c);
        
        c.gridx = 2;
        c.gridy = 2;
        
        add(districtL, c);
        
        c.gridx = 2;
        c.gridy = 3;
        
        add(district, c);
        
        c.gridx = 3;
        c.gridy = 2;
        
        add(pfaL, c);
        
        c.gridx = 3;
        c.gridy = 3;
        
        add(pfa, c);
        
        c.gridx = 0;
        c.gridy = 4;
        
        add(fireAlarmL, c);
        
        c.gridx = 0;
        c.gridy = 5;
        
        add(fireAlarm, c);
        
        c.gridx = 1;
        c.gridy = 4;
        
        add(ACTIVELABEL, c);
        
        c.gridx = 1;
        c.gridy = 5;
        
        add(active, c);
        
        c.gridx = 2;
        c.gridy = 4;
        
        add(SYSLABEL, c);
        
        c.gridx = 2;
        c.gridy = 5;
        
        add(sysNormal, c);
        
        c.gridx = 3;
        c.gridy = 4;
        
        add(locationL, c);
        
        c.gridx = 3;
        c.gridy = 5;
        
        add(panelPadLocation, c);
        
    }
}
