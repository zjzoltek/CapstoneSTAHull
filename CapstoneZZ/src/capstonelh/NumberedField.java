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
import javax.swing.JRadioButton;


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
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 0;
        
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        c.fill = GridBagConstraints.NONE;
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
        title.setText(" 8. COMPRESSED GASES ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA secured = new PFNA("Secured");
        c.gridy = 2;
        add(secured, c);
    }
    
    //Create and add components for field nine
    private void Field9(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 9. SPRAY FINISHING OPERATION ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA extinguisher = new PFNA("Minimum 4A40BC fire extinguisher within 30'");
        c.gridy = 2;
        add(extinguisher, c);
        
        PFNA sprayBooth = new PFNA("Approved spray booth");
        c.gridy = 3;
        add(sprayBooth, c);
        
        PFNA autoExt = new PFNA("Auto extinguishing system Inspected Annually");
        c.gridy = 4;
        add(autoExt, c);
        
        PFNA warningSigns = new PFNA("Welding/hotwork warning signs and No Smoking signs");
        c.gridy = 5;
        add(warningSigns, c);
        
    }
    
    //Create and add components for field ten
    private void Field10(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 10. SPRINKLER/STANDPIPE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        c.gridy = 2;
        PFNA service = new PFNA("Annual Service");
        add(service, c);
        
        c.gridy = 3;
        //date of last service here
        
        c.gridy = 4;
        PFNA access = new PFNA("Access");
        add(access, c);
        
        PFNA standpipe = new PFNA("Standpipe sticker on door");
        c.gridy = 5;
        add(standpipe, c);
        
        PFNA sprinklerRoom = new PFNA("Sprinkler room identified");
        c.gridy = 6;
        add(sprinklerRoom, c);
        
        //riser location here
        c.gridy = 7;
        
    }
    
    //Create and add components for field eleven
    private void Field11(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 11. HOOD EXT. SYSTEM ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA service = new PFNA("Service within 6 months");
        c.gridy = 2;
        add(service, c);
        
        //last service date here
        c.gridy = 3;
        
        PFNA access = new PFNA("Access to remote pull");
        c.gridy = 4;
        add(access, c);
        
        PFNA clean = new PFNA("Clean");
        c.gridy = 5;
        add(clean, c);
        
        PFNA extinguisher = new PFNA("\"K\" Class extinguisher");
        c.gridy = 6;
        add(extinguisher, c);
        
        PFNA nozzle = new PFNA("Nozzle Condition");
        c.gridy = 7;
        add(nozzle, c);
        
        PFNA filters = new PFNA("Filters in place");
        c.gridy = 8;
        add(filters, c);
    }
    
    //Create and add components for field twelve
    private void Field12(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 12. OCCUPANT LOAD ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA posted = new PFNA("Posted in places of assembly");
        c.gridy = 2;
        add(posted, c);
    }
    
    //Create and add components for field thirteen
    private void Field13(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 13. ADDRESS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA visible = new PFNA("Visible & legible");
        c.gridy = 2;
        add(visible, c);
    }
    
    //Create and add components for field fourteen
    private void Field14(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 14. FIRE DEPT. ACCESS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA maint = new PFNA("Maint/Lubrication");
        c.gridy = 2;
        add(maint, c);
        
        PFNA boxKeys = new PFNA("Knox box keys current");
        c.gridy = 3;
        add(boxKeys, c);
        
        //Knox box location here
    }
    
    //Create and add components for field fifteen
    private void Field15(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 15. FIRE DEPT. CONNECTION ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA caps = new PFNA("FDC caps in place");
        c.gridy = 2;
        add(caps, c);
        
        PFNA identified = new PFNA("FDC identified");
        c.gridy = 3;
        add(identified, c);
        
        PFNA access = new PFNA("FDC access is uobstructed");
        c.gridy = 4;
        add(access, c);
        
        //FDC location here
    }
    
    //Create and add components for field sixteen
    private void Field16(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 16. ELEVATOR ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA keys = new PFNA("Override Keys On-Site");
        c.gridy = 2;
        add(keys, c);
    }
    
    //Create and add components for field seventeen
    private void Field17(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 17. PROPANE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        PFNA placards = new PFNA("704 Placards");
        c.gridy = 2;
        add(placards, c);
        
        PFNA permit = new PFNA("Permit on site");
        c.gridy = 3;
        add(permit, c);
        
        PFNA bollards = new PFNA("Impact bollards");
        c.gridy = 4;
        add(bollards, c);
    }
    
    //Create and add components for field eighteen
    private void Field18(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 18. OTHER ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        add(subtitle, c);
        
        JRadioButton button = new JRadioButton("Other Violations Noted", false);
        c.gridy = 4;
        add(button, c);
    }
}
