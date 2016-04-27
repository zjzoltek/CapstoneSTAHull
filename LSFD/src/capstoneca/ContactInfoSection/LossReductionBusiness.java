package capstoneca.ContactInfoSection;

import capstonezz.InspectionReport.PhoneNumberBox;
import capstonezz.NumberDocument;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.Insets;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author ccallen0504
 */
public class LossReductionBusiness extends JPanel {
    
    private final JTextField businessNameF = new JTextField(20);
    private final JTextField addressF = new JTextField(20);
    private final JTextField suiteF = new JTextField(8);
    private final JTextField telephoneF = new JTextField(10);
    private final JTextField cityF = new JTextField(10);
    private final JTextField stateF = new JTextField(5);
    private final JTextField zipF = new JTextField(8);
    
    private final JTextField ownerNameF = new JTextField(20);
    private final JTextField oaddressF = new JTextField(20);
    private final JTextField osuiteF = new JTextField(8);
    private final PhoneNumberBox otelephoneF = new PhoneNumberBox(10);
    private final JTextField ocityF = new JTextField(10);
    private final JTextField ostateF = new JTextField(5);
    private final JTextField ozipF = new JTextField(8);
    
    JLabel businessNameL, addressL, suiteL, telephoneL, cityL, stateL, zipL, title, ownerNameL;
    
    private final GridBagLayout layout = new GridBagLayout();
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    public LossReductionBusiness() {
        businessNameF.setName("80");
        addressF.setName("81");
        suiteF.setName("82");
        telephoneF.setName("83");
        cityF.setName("84");
        stateF.setName("85");
        zipF.setName("86");
        ownerNameF.setName("87");
        oaddressF.setName("88");
        osuiteF.setName("89");
        otelephoneF.setName("90");
        ocityF.setName("91");
        ostateF.setName("92");
        ozipF.setName("93");
        
        ((AbstractDocument)ozipF.getDocument()).setDocumentFilter(new NumberDocument());
        setLayout(layout);
        
        title = new JLabel("Emergency Contact Field");
        c.gridx = 2;
        c.gridy = 0;
        
        panel.add(title,c);
        add(title,c);
        
        //Business Name and Address column
        businessNameL = new JLabel("Business Name:");
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(8,8,8,8);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(businessNameL,c);
        add(businessNameL,c);
        
        c.gridx = 1;
        c.gridy = 2;
        panel.add(businessNameF,c);
        add(businessNameF,c);
        
        addressL = new JLabel("Address:");
        c.gridx = 1;
        c.gridy = 3;
        panel.add(addressL,c);
        add(addressL,c);
        
        c.gridx = 1;
        c.gridy = 4;
        panel.add(addressF,c);
        add(addressF,c);
        //The suite/unit column
        suiteL = new JLabel("Suite/Unit:");
        
        c.gridx = 2;
        c.gridy = 3;
        panel.add(suiteL,c);
        add(suiteL,c);
        
        c.gridx = 2;
        c.gridy = 4;
        panel.add(suiteF,c);
        add(suiteF,c);
        // The telephone and city column
        telephoneL = new JLabel("Telephone:");
        c.gridx = 3;
        c.gridy = 1;
        panel.add(telephoneL,c);
        add(telephoneL,c);
        
        c.gridx = 3;
        c.gridy = 2;
        panel.add(telephoneF,c);
        add(telephoneF,c);
        
        
        cityL = new JLabel("City:");
        
        c.gridx = 3;
        c.gridy = 3;
        panel.add(cityL, c);
        add(cityL, c);
        
        c.gridx = 3;
        c.gridy = 4;
        panel.add(cityF, c);
        add(cityF,c);
        // State column
        stateL = new JLabel("State:");
        
        
        c.gridx = 4;
        c.gridy = 3;
        panel.add(stateL, c);
        add(stateL, c);
        
        c.gridx = 4;
        c.gridy = 4;
        panel.add(stateF, c);
        add(stateF,c);
        
        //Zip column
        zipL = new JLabel("Zip:");
        
        c.gridx = 5;
        c.gridy = 3;
        panel.add(zipL, c);
        add(zipL, c);
        
        c.gridx = 5;
        c.gridy = 4;
        panel.add(zipF, c);
        add(zipF,c);
        
        // owner name and address column
        ownerNameL = new JLabel("Owner/ Operator Name:");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 7;
        panel.add(ownerNameL,c);
        add(ownerNameL,c);
        
        c.gridx = 1;
        c.gridy = 8;
        panel.add(ownerNameF,c);
        add(ownerNameF,c);
        
        addressL = new JLabel("Address:");
        c.gridx = 1;
        c.gridy = 9;
        panel.add(addressL,c);
        add(addressL,c);
        
        c.gridx = 1;
        c.gridy = 10;
        panel.add(oaddressF,c);
        add(oaddressF,c);
        //The suite/unit column
        suiteL = new JLabel("Suite/Unit:");
        
        c.gridx = 2;
        c.gridy = 9;
        panel.add(suiteL,c);
        add(suiteL,c);
        
        c.gridx = 2;
        c.gridy = 10;
        panel.add(osuiteF,c);
        add(osuiteF,c);
        // The telephone and city column
        telephoneL = new JLabel("Telephone:");
        c.gridx = 3;
        c.gridy = 7;
        panel.add(telephoneL,c);
        add(telephoneL,c);
        
        c.gridx = 3;
        c.gridy = 8;
        panel.add(otelephoneF,c);
        add(otelephoneF,c);
        
        
        cityL = new JLabel("City:");
        
        c.gridx = 3;
        c.gridy = 9;
        panel.add(cityL, c);
        add(cityL, c);
        
        c.gridx = 3;
        c.gridy = 10;
        panel.add(ocityF, c);
        add(ocityF,c);
        // State column
        stateL = new JLabel("State:");
        
        
        c.gridx = 4;
        c.gridy = 9;
        panel.add(stateL, c);
        add(stateL, c);
        
        c.gridx = 4;
        c.gridy = 10;
        panel.add(ostateF, c);
        add(ostateF,c);
        
        //Zip column
        zipL = new JLabel("Zip:");
        
        c.gridx = 5;
        c.gridy = 9;
        panel.add(zipL, c);
        add(zipL, c);
        
        c.gridx = 5;
        c.gridy = 10;
        panel.add(ozipF, c);
        add(ozipF,c);
        
    }
}
