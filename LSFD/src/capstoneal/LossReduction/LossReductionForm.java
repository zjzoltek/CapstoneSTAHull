/*
 * This class assembles the entire loss reduction form
 */
package capstoneal.LossReduction;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author ACLeavitt0612
 */
public class LossReductionForm extends JPanel{
    // layout
    public final GridBagLayout layout = new GridBagLayout();
    public final GridBagConstraints constraints = new GridBagConstraints();
    // Individual components
    JLabel title1 = new JLabel("LEE'S SUMMIT FIRE DEPARTMENT", SwingConstants.CENTER);
    JLabel title2 = new JLabel("LOSS REDUCTION PROGRAM", SwingConstants.CENTER);
    JPanel placeHolder1 = new JPanel();
    EmergencyContactInformation emergencyContact = new EmergencyContactInformation();
    JPanel placeHolder2 = new JPanel();
    ComponentThree componentThree = new ComponentThree();
    Notes notes = new Notes();
    // Font
    public final Font sectionFont = new Font("Serif", Font.BOLD, 18);
    // border
    public final Border border = BorderFactory.createLineBorder(Color.black);
    
    
    public LossReductionForm()
    {
        //layout stuffs
        setLayout(layout);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;
        
        // setting the font of the title
        title1.setFont(sectionFont);
        title2.setFont(sectionFont);
        
        // adding borders
        placeHolder1.setBorder(border);
        placeHolder2.setBorder(border);
        componentThree.setBorder(border);
        notes.setBorder(border);
        
        //adding components to the panel
        addComponent(title1, 0, 0, 1, 1);
        addComponent(title2, 0, 1, 1, 1);
        addComponent(placeHolder1, 0, 2, 1, 1);
        addComponent(emergencyContact, 0, 3, 1, 1);
        addComponent(placeHolder2, 0, 4, 1, 1);
        addComponent(componentThree, 0, 5, 1, 1);
        addComponent(notes, 0, 6, 1, 1);
        
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
