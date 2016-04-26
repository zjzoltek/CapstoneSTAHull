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
import javax.swing.border.Border;

/**
 *
 * @author ACLeavitt0612
 * 
 */
public class EmergencyContactInformation extends JPanel{
    // telephone boxes
    public final PhoneNumberBox telephone1 = new PhoneNumberBox();
    public final PhoneNumberBox telephone2 = new PhoneNumberBox();
    public final PhoneNumberBox telephone3 = new PhoneNumberBox();
    public final PhoneNumberBox telephone4 = new PhoneNumberBox();
    // number labels
    public final JLabel label1 = new JLabel("1.");
    public final JLabel label2 = new JLabel("2.");
    public final JLabel label3 = new JLabel("3.");
    public final JLabel label4 = new JLabel("4.");
    // name and telephone label
    public final JLabel name = new JLabel("Name");
    public final JLabel telephone = new JLabel("Telephone");
    // section label
    public final JLabel sectionLabel = new JLabel("EMERGENCY CONTACT INFORMATION");
    //name text fields
    public final JTextField name1 = new JTextField();
    public final JTextField name2 = new JTextField();
    public final JTextField name3 = new JTextField();
    public final JTextField name4 = new JTextField();
    // border
    public final Border border = BorderFactory.createLineBorder(Color.black);
    // fonts
    public final Font sectionFont = new Font("Serif", Font.BOLD, 16);
    public final Font headerFont = new Font("Serif", Font.BOLD, 14);
    // layout
    public final GridBagLayout layout = new GridBagLayout();
    public final GridBagConstraints constraints = new GridBagConstraints();
    
    
    public EmergencyContactInformation()
    {
        setLayout(layout);
        setBorder(border);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        
        
        // font and border of section header
        sectionLabel.setFont(sectionFont);
        sectionLabel.setBorder(border);
        //font of name and telephone labels
        name.setFont(headerFont);
        telephone.setFont(headerFont);
        
        //adding components
        //column 0
        addComponent(sectionLabel, 0, 0, 4, 1);
        addComponent(name, 0, 1, 2, 1);
        addComponent(label1, 0, 2, 1, 1);
        addComponent(label2, 0, 3, 1, 1);
        addComponent(label3, 0, 4, 1, 1);
        addComponent(label4, 0, 5, 1, 1);
        //column 1
        addComponent(name1, 1, 2, 2, 1);
        addComponent(name2, 1, 3, 2, 1);
        addComponent(name3, 1, 4, 2, 1);
        addComponent(name4, 1, 5, 2, 1);
        //column 2
        addComponent(telephone, 3, 1, 1, 1);
        addComponent(telephone1, 3, 2, 1, 1);
        addComponent(telephone2, 3, 3, 1, 1);
        addComponent(telephone3, 3, 4, 1, 1);
        addComponent(telephone4, 3, 5, 1, 1);
                
        
        
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
