/**
 * NumberedFieldTest:
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class NumberedFieldTest extends JPanel
{
    static final int ARRAY_SIZE = 18;
    
    private static final GridBagLayout layout = new GridBagLayout();
    
    public static void main(String[] args)
    {
        //Create JFrame
        JFrame frame = new JFrame();
        
        //Create JPanel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        
        //Create GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();
        
        //Create array for fields
        NumberedField[] fields = new NumberedField[ARRAY_SIZE];
        
        //Initialize array and add to panel
        for(int i = 0; i < ARRAY_SIZE; i++)
        {
            fields[i] = new NumberedField(i+1);
//            fields[i].setBorder(BorderFactory.createLineBorder(Color.black));
            c.gridx = 0;
            c.gridy = i;
            c.anchor = GridBagConstraints.WEST;
            panel.add(fields[i], c);
        }
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

}
