/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.InspectionReport;

/**
 *
 * @author ACLeavitt0612
 */


import capstonead.CommentsInspection;
import capstonezz.InspectionReport.BasicInformation;
import capstonezz.Util;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class InspectionReport extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private final GridBagConstraints constraints;
    private final JPanel completeForm;
    private final Title title = new Title();
    private final JPanel businessInformation = new JPanel();
    private final JLabel emergancyContactLabel = new JLabel("Emergency Contact Information", SwingConstants.CENTER);
    private final JScrollPane scroller;
    
    private final BasicInformation contactFields = new BasicInformation("Businesss Name", "Phone", "Address #");
    
    private final InspectionReport nFA = new InspectionReport();
    
    private final CommentsInspection commentsInspection = new CommentsInspection();
    
    
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
    
    public static void main(String[] args){
        InspectionReport ir = new InspectionReport();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(ir);
        frame.setVisible(true);
    }
} // end of class
