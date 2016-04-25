package capstonezz.InspectionReport;

import capstoneal.InspectionReport.Title;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 22, 2016
 */

public class AllContact extends JPanel {
    private final Title title;
    private final BasicInformation contactFields;
    
    public AllContact(){
        super(new GridBagLayout());
        contactFields = new BasicInformation("Businesss Name", "Phone", "Address #");
        contactFields.setBorder(BorderFactory.createLineBorder(Color.black));
        
        title = new Title();
        init();
    }
    
    private void init(){
        GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        
        add(title, c);
        
        c.gridy = 1;
        
        add(contactFields, c);
    }
}
