package capstoneal.InspectionReport;

/**
 *
 * @author ACLeavitt0612
 */


import capstonead.CommentsInspection;
import capstonezz.InspectionReport.AllContact;
import capstonezz.InspectionReport.EmergencyContact;
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

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private final GridBagConstraints constraints;
    private final JPanel completeForm;
    private final JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    
    private final NumberedFieldArea nFA = new NumberedFieldArea();
    
    private final CommentsInspection commentsInspection = new CommentsInspection();
    private final AllContact ac = new AllContact();
    private final EmergencyContact ec;
    
    public InspectionReport(){
        super(new BorderLayout());
        completeForm = new JPanel(layout);
        constraints = new GridBagConstraints();
        //setting basic constraints
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        addComponent(ac, 0, 0, 1, 1);
        
        ec = new EmergencyContact();
        ec.setBorder(BorderFactory.createLineBorder(Color.black));
        
        // creating and adding the emergancy contact label
        emergancyContactLabel.setFont(new Font("Serif", Font.BOLD, 16));
        emergancyContactLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(emergancyContactLabel, 1, 0, 1, 1);
        addComponent(ec, 2, 0, 1, 1);
        
        addComponent(nFA, 3, 0, 1, 4); // adding the numbered fields
        addComponent(commentsInspection, 9, 0, 1, 1); // adding the bottom comments section
        
        add(completeForm, BorderLayout.CENTER);
    } // end of InspectionReport constructor
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridy = row;
        constraints.gridx = column;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        completeForm.add(component);
    } // end of addComponent method
    
    public NumberedFieldArea getNumberedFieldArea(){
        return nFA;
    }
    
    public CommentsInspection getCommentsInspection(){
        return commentsInspection;
    }
    
    public AllContact getAllContact(){
        return ac;
    }
    
    public EmergencyContact getEmergencyContact(){
        return ec;
    }
} // end of class
