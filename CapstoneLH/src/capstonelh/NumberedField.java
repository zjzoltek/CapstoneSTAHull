/**
 * NumberedField: 
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import inspectionReportAL.PFNA;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NumberedField extends JPanel{
    private GridBagLayout layout;
    
    public NumberedField(int field)
    {
        layout = new GridBagLayout();
        setLayout(layout);
        
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel title = new JLabel("");
        title.setFont(getFont().deriveFont(16f));
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel subtitle = new JLabel("   P    F   NA");
        subtitle.setFont(getFont().deriveFont(14f));
//        subtitle.setHorizontalAlignment(SwingConstants.WEST);
        subtitle.setAlignmentX(LEFT_ALIGNMENT);
        
        
        switch(field)
        {
            case 1:
                title.setText("   EXIT DOORS/EXIT WAYS   ");
                c.gridx = 0;
                c.gridy = 0;
                c.anchor = GridBagConstraints.WEST;
                add(title, c);
                
                c.gridy = 1;
                add(subtitle, c);
                
                PFNA obstruction = new PFNA("Obstruction");
                obstruction.setAlignmentX(LEFT_ALIGNMENT);
                c.gridy = 2;
                add(obstruction, c);
                        
                PFNA locks = new PFNA("Locks/Panic Hardware");
                locks.setAlignmentX(LEFT_ALIGNMENT);
                c.gridy = 3;
                add(locks, c);
                
                
                break;
        }
    }

    private void FieldOne(JPanel panel)
    {
        
    }
}
