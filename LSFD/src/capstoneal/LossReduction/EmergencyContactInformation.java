/*
 * This class makes a jpanel with a title, name header, telephone header, and 4 numbered bullets
 */
package capstoneal.LossReduction;

import javax.swing.JPanel;
import capstonezz.InspectionReport.PhoneNumberBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author ACLeavitt0612
 * 
 */
public class EmergencyContactInformation extends JPanel{
    // telephone boxes
    private final PhoneNumberBox telephone1 = new PhoneNumberBox(7);
    private final PhoneNumberBox telephone2 = new PhoneNumberBox(7);
    private final PhoneNumberBox telephone3 = new PhoneNumberBox(7);
    private final PhoneNumberBox telephone4 = new PhoneNumberBox(7);
    // number labels
    private final JLabel label1 = new JLabel("1.");
    private final JLabel label2 = new JLabel("2.");
    private final JLabel label3 = new JLabel("3.");
    private final JLabel label4 = new JLabel("4.");
    // name and telephone label
    private final JLabel name = new JLabel("Name");
    private final JLabel telephone = new JLabel("Telephone");
    // section label
    private final JLabel sectionLabel = new JLabel("EMERGENCY CONTACT INFORMATION", SwingConstants.CENTER);
    //name text fields
    private final JTextField name1 = new JTextField();
    private final JTextField name2 = new JTextField();
    private final JTextField name3 = new JTextField();
    private final JTextField name4 = new JTextField();
    // border
    private final Border border = BorderFactory.createLineBorder(Color.black);
    // fonts
    private final Font sectionFont = new Font("Serif", Font.BOLD, 16);
    private final Font headerFont = new Font("Serif", Font.BOLD, 14);
    // layout
    private final GridBagLayout layout = new GridBagLayout();
    private final GridBagConstraints constraints = new GridBagConstraints();
    
    
    public EmergencyContactInformation()
    {
        telephone1.setName("60");
        telephone2.setName("61");
        telephone3.setName("62");
        telephone4.setName("63");
        
        name1.setName("64");
        name2.setName("65");
        name3.setName("66");
        name4.setName("67");
        
        setLayout(layout);
        setBorder(border);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;
        
        
        // font and border of section header
        sectionLabel.setFont(sectionFont);
        sectionLabel.setBorder(border);
        //font of name and telephone labels
        name.setFont(headerFont);
        telephone.setFont(headerFont);
        
        //adding components
        //column 0
        addComponent(sectionLabel, 0, 0, 6, 1);
        addComponent(name, 0, 1, 2, 1);
        addComponent(label1, 0, 2, 1, 1);
        addComponent(label2, 0, 3, 1, 1);
        addComponent(label3, 0, 4, 1, 1);
        addComponent(label4, 0, 5, 1, 1);
        //column 1
        constraints.weightx = 1000;
        addComponent(name1, 2, 2, 2, 1);
        addComponent(name2, 2, 3, 2, 1);
        addComponent(name3, 2, 4, 2, 1);
        addComponent(name4, 2, 5, 2, 1);
        //column 2
        addComponent(telephone, 4, 1, 1, 1);
        addComponent(telephone1, 4, 2, 1, 1);
        addComponent(telephone2, 4, 3, 1, 1);
        addComponent(telephone3, 4, 4, 1, 1);
        addComponent(telephone4, 4, 5, 1, 1);
    }
    
    private void addComponent(Component component, int column, int row, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    } // end of addComponent method
}
