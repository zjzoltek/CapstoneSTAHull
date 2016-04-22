/*
 * This class uses JLabel to make the title and header for the inspection report form
 */
package inspectionReportAL;

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
    //creates objects for the layout
    private GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    //creating JLabels
    private JLabel header1 = new JLabel("Lee's Summit, Missouri Fire Department");
    private JLabel header2 = new JLabel("Inspection Report");
    private JLabel header3 = new JLabel("Phone: (816)969-1300");
    
    Title(){
        //Setting layout and constraints
        setLayout(layout);
        constraints = new GridBagConstraints();
        //setting font of labels
        header1.setFont(new Font("Serif", Font.BOLD, 20));
        header2.setFont(new Font("Serif", Font.PLAIN,20));
        //adding components
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
