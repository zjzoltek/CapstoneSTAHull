/**
 * NumberedField: 
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import inspectionReportAL.PFNA;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NumberedField extends JPanel{
    private GridBagLayout layout;
    
    public NumberedField(int field)
    {
        //Set layout of the panel
        layout = new GridBagLayout();
        setLayout(layout);
        //Constraints to be used
        GridBagConstraints c = new GridBagConstraints();
        
        //Create title and set font and border
        JLabel title = new JLabel("");
        title.setFont(getFont().deriveFont(16f));
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //Create subtitle and set font
        JLabel subtitle = new JLabel("   P    F   NA");
        subtitle.setFont(getFont().deriveFont(14f));
        
        //Create whichever component is called for by the constructor.
        switch(field)
        {
            //Pass to a function to construct the JPanel
            case 1:
                Field1(this, title, subtitle, c);
                break;
            case 2:
                Field2(this, title, subtitle, c);
                break;
            case 3:
                Field3(this, title, subtitle, c);
                break;
            case 4:
                Field4(this, title, subtitle, c);
                break;
            case 5:
                Field5(this, title, subtitle, c);
                break;
            case 6:
                Field6(this, title, subtitle, c);
                break;
            case 7:
                Field7(this, title, subtitle, c);
                break;
            case 8:
                Field8(this, title, subtitle, c);
                break;
            case 9:
                Field9(this, title, subtitle, c);
                break;
            case 10:
                Field10(this, title, subtitle, c);
                break;
            case 11:
                Field11(this, title, subtitle, c);
                break;
            case 12:
                Field12(this, title, subtitle, c);
                break;
            case 13:
                Field13(this, title, subtitle, c);
                break;
            case 14:
                Field14(this, title, subtitle, c);
                break;
            case 15:
                Field15(this, title, subtitle, c);
                break;
            case 16:
                Field16(this, title, subtitle, c);
                break;
            case 17:
                Field17(this, title, subtitle, c);
                break;
            case 18:
                Field18(this, title, subtitle, c);
                break;
            default:
                break;
        }
    }

    //Create and add components for field one
    private void Field1(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 1. EXIT DOORS/EXIT WAYS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);

        c.gridy = 1;
        add(subtitle, c);

        PFNA obstruction = new PFNA("Obstruction");
        c.gridy = 2;
        add(obstruction, c);

        PFNA locks = new PFNA("Locks/Panic Hardware");
        c.gridy = 3;
        add(locks, c);
    }
    
    //Create and add components for field two
    private void Field2(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 2. EXIT SIGNS/EMERGENCY LIGHTS ");
//        Rectangle rect = new Rectangle(0,0,100,500);
//        title.setBounds(rect);
//        Dimension dimension = new Dimension(100, 50);
//        title.setMinimumSize(dimension);
//        System.out.printf("%s", title.getSize());
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA exitSigns = new PFNA("Exit Signs Illuminated");
        c.gridy = 2;
        add(exitSigns, c);
        
        PFNA lights = new PFNA("Emer. Lights Working");
        c.gridy = 3;
        add(lights, c);
    }
    
    //Create and add components for field three
    private void Field3(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 3. FIRE DOORS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA maintained = new PFNA("Maintained/Close Fully");
        c.gridy = 2;
        add(maintained, c);
        
        PFNA unapproved = new PFNA("Unapproved Open Devices");
        c.gridy = 3;
        add(unapproved, c);
        
        PFNA clear = new PFNA("Clear of obstructions");
        c.gridy = 4;
        add(clear, c);
    }
    
    //Create and add components for field four
    private void Field4(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 4. FIRE EXTINGUISHERS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA minimum = new PFNA("Minimum2A10BC");
        c.gridy = 2;
        add(minimum, c);
        
        PFNA maximum = new PFNA("Max of 75' travel dist.");
        c.gridy = 3;
        add(maximum, c);
        
        PFNA inspection = new PFNA("Annual Inspection");
        c.gridy = 4;
        add(inspection, c);
        
        PFNA access = new PFNA("Access");
        c.gridy = 5;
        add(access, c);
    }
    
    //Create and add components for field five
    private void Field5(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 5. ELECTRICAL ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA extCords = new PFNA("Extension Cords");
        c.gridy = 2;
        add(extCords, c);
        
        PFNA adapters = new PFNA("Multi Plug Adapters");
        c.gridy = 3;
        add(adapters, c);
        
        PFNA boxes = new PFNA("Open Boxes, Switches");
        c.gridy = 4;
        add(boxes, c);
        
        PFNA electricalPanel = new PFNA("Openings in Electrical Panel");
        c.gridy = 5;
        add(electricalPanel, c);
        
        PFNA clearance = new PFNA("36\" clearance from storage");
        c.gridy = 6;
        add(clearance, c);
    }
    
    //Create and add components for field six
    private void Field6(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 6. STORAGE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA housekeeping = new PFNA("Housekeeping");
        c.gridy = 2;
        add(housekeeping, c);
        
        PFNA ceiling = new PFNA("24\" below ceiling");
        c.gridy = 3;
        add(ceiling, c);
        
        PFNA sprinklers = new PFNA("18\" below sprinklers");
        c.gridy = 4;
        add(sprinklers, c);
        
        PFNA stairs = new PFNA("Uner stairs");
        c.gridy = 5;
        add(stairs, c);
        
        PFNA ignition = new PFNA("Close to ignition source");
        c.gridy = 6;
        add(ignition, c);
    }
    
    //Create and add components for field seven
    private void Field7(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 7. FLAMMABLE/COMBUSTABLE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        add(subtitle, c);
        
        PFNA placards = new PFNA("704 Placards");
        c.gridy = 2;
        add(placards, c);
        
        PFNA msds = new PFNA("MSDS on premises");
        c.gridy = 3;
        add(msds, c);
        
        PFNA signs = new PFNA("Non-smoking signs");
        c.gridy = 4;
        add(signs, c);
    }
    
    //Create and add components for field eight
    private void Field8(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field nine
    private void Field9(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field ten
    private void Field10(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field eleven
    private void Field11(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field twelve
    private void Field12(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field thirteen
    private void Field13(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field fourteen
    private void Field14(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field fifteen
    private void Field15(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field sixteen
    private void Field16(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field seventeen
    private void Field17(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
    
    //Create and add components for field eighteen
    private void Field18(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        
    }
}
