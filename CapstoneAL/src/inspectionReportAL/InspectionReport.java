/*
 * This class assembles all of the components for the Inspection Report form into one complete form
 */
package inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 */


import capstonead.CommentsInspection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    private JPanel completeForm;
    private Title title = new Title();
    private JPanel businessInformation = new JPanel();
    private JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    private JScrollPane scroller;
    
    private EmergencyContactFields contactFields = new EmergencyContactFields();
    
    private NumberedFieldArea nFA = new NumberedFieldArea();
    
    private CommentsInspection commentsInspection = new CommentsInspection();
    
    
    public InspectionReport(){
        super(new BorderLayout());
        completeForm = new JPanel(layout);
        constraints = new GridBagConstraints();
        //setting basic constraints
        constraints.fill = GridBagConstraints.HORIZONTAL;

        addComponent(title, 0, 0, 1, 1);
        
        
        businessInformation.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(businessInformation, 1, 0, 1, 1);
        // creating and adding the emergancy contact label
        emergancyContactLabel.setFont(new Font("Serif", Font.BOLD, 16));
        emergancyContactLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        addComponent(emergancyContactLabel, 2, 0, 1, 1);
        
        addComponent(contactFields, 3, 0, 1, 1);
        constraints.fill = GridBagConstraints.CENTER;
        
        addComponent(nFA, 4, 0, 1, 4); // adding the numbered fields
        addComponent(commentsInspection, 8, 0, 1, 1); // adding the bottom comments section
        
        scroller = new JScrollPane(completeForm);
        
        add(scroller, BorderLayout.CENTER);
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
} // end of class
