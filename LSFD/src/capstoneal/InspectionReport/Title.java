/*
 * This class creates a jpanel for the title of the loss reduction form
 */
package capstoneal.InspectionReport;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ACLeavitt0612
 */



public class Title extends JPanel{
    
    private final GridBagLayout layout = new GridBagLayout();
    private final GridBagConstraints constraints;
    
    private final JLabel header1 = new JLabel("Lee's Summit, Missouri Fire Department");
    private final JLabel header2 = new JLabel("Inspection Report");
    private final JLabel header3 = new JLabel("Phone: (816)969-1300");
    
    public Title(){
        //sets layout and constraints
        setLayout(layout);
        constraints = new GridBagConstraints();
        //setting font of jlabels
        header1.setFont(new Font("Serif", Font.BOLD, 20));
        header2.setFont(new Font("Serif", Font.PLAIN,20));
        //adding components to the frame
        addComponent(header1, 0, 0, 1, 2);
        addComponent(header2, 2, 0, 1, 2);
        addComponent(header3, 4, 0, 1, 1);
        
        
    }
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    }
}
