/**
 * NumberedField: 
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import inspectionReportAL.PFNA;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class NumberedField extends JPanel{
    private BoxLayout layout;
    
    public NumberedField(int field)
    {
        layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        
        
        JLabel title = new JLabel("");
        title.setFont(getFont().deriveFont(16f));
        title.setBorder(BorderFactory.createLineBorder(Color.black));
//        title.setHorizontalAlignment(SwingConstants.WEST);
        
        JLabel subtitle = new JLabel("P  F  NA");
        subtitle.setFont(getFont().deriveFont(14f));
//        subtitle.setHorizontalAlignment(SwingConstants.WEST);
        
        
        switch(field)
        {
            case 1:
                title.setText("   EXIT DOORS/EXIT WAYS   ");
                
                PFNA obstruction = new PFNA("Obstruction");
//                obstruction.setAlignmentX(LEFT_ALIGNMENT);
                        
                PFNA locks = new PFNA("Locks/Panic Hardware");
                
                //Add objects to the frame
                add(title);
                add(subtitle);
                add(obstruction);
                add(locks);
                break;
        }
    }

    private void FieldOne(JPanel panel)
    {
        
    }
}
