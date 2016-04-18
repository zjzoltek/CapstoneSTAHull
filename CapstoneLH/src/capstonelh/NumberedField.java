/**
 * NumberedField: 
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import inspectionReportAL.PFNA;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NumberedField extends JPanel{
    public NumberedField(int field)
    {
        JLabel title = new JLabel("");
        title.setFont(getFont().deriveFont(16f));
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel subtitle = new JLabel("P  F  NA");
        subtitle.setFont(getFont().deriveFont(14f));
        
        
        switch(field)
        {
            case 1:
                title.setText("   EXIT DOORS/EXIT WAYS   ");
                PFNA obstruction = new PFNA("Obstruction");
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
