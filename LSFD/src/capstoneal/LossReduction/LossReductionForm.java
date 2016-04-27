/*
 * This class assembles the entire loss reduction form
 */
package capstoneal.LossReduction;

import capstoneca.ContactInfoSection.LossReductionBusiness;
import capstoneca.SFLossReduction.sFLRTType;
import java.awt.BorderLayout;
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
    private final GridBagLayout layout = new GridBagLayout();
    private final GridBagConstraints constraints = new GridBagConstraints();
    // Individual components
    private final JLabel title1 = new JLabel("LEE'S SUMMIT FIRE DEPARTMENT", SwingConstants.CENTER);
    private final JLabel title2 = new JLabel("LOSS REDUCTION PROGRAM", SwingConstants.CENTER);
    private final LossReductionBusiness business = new LossReductionBusiness();
    private final EmergencyContactInformation emergencyContact = new EmergencyContactInformation();
    private final sFLRTType sflr = new sFLRTType();
    private final LRMisc lrmisc = new LRMisc();
    private final LRNotes notes = new LRNotes();
    // Font
    private final Font sectionFont = new Font("Serif", Font.BOLD, 18);
    // border
    private final Border border = BorderFactory.createLineBorder(Color.black);
    
    private final JPanel completeForm;
    
    public LossReductionForm()
    {
        completeForm = new JPanel(layout);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;
        
        // setting the font of the title
        title1.setFont(sectionFont);
        title2.setFont(sectionFont);
        
        // adding borders
        business.setBorder(border);
        sflr.setBorder(border);
        lrmisc.setBorder(border);
        notes.setBorder(border);
        
        //adding components to the panel
        addComponent(title1, 0, 0, 1, 1);
        addComponent(title2, 0, 1, 1, 1);
        addComponent(business, 0, 2, 1, 1);
        addComponent(emergencyContact, 0, 3, 1, 1);
        addComponent(sflr, 0, 4, 1, 1);
        addComponent(lrmisc, 0, 5, 1, 1);
        addComponent(notes, 0, 6, 1, 1);
        
        add(completeForm, BorderLayout.CENTER);
        
    }
    
    private void addComponent(Component component, int column, int row, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        completeForm.add(component);
    } // end of addComponent method
    
    public LossReductionBusiness getLRBusiness(){
        return business;
    }
    
    public EmergencyContactInformation getEmergencyContact(){
        return emergencyContact;
    }
    
    public sFLRTType getSFLRTType(){
        return sflr;
    }
    
    public LRMisc getLRMisc(){
        return lrmisc;
    }
    
    public LRNotes getLRNotes(){
        return notes;
    }
    
    
}
