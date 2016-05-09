/**
 * NumberedField: 
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import capstoneal.InspectionReport.PFNA;
import capstonepb.locationgui.LocationDropDown;
import capstonezz.InspectionReport.DateField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IRSection extends JPanel{
    public IRSection(int field)
    {
        super(new BorderLayout());
        //Constraints to be used
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        
       
        //Create title and set font and border
        JLabel title = new JLabel();
        title.setFont(getFont().deriveFont(16f));
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //Create subtitle and set font
        JLabel subtitle = new JLabel("   P    F   NA");
        subtitle.setFont(getFont().deriveFont(14f));
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        //Create whichever component is called for by the constructor.
        switch(field)
        {
            //Pass to a function to construct the JPanel
            case 1:
                Field1(panel, title, subtitle, c);
                break;
            case 2:
                Field2(panel, title, subtitle, c);
                break;
            case 3:
                Field3(panel, title, subtitle, c);
                break;
            case 4:
                Field4(panel, title, subtitle, c);
                break;
            case 5:
                Field5(panel, title, subtitle, c);
                break;
            case 6:
                Field6(panel, title, subtitle, c);
                break;
            case 7:
                Field7(panel, title, subtitle, c);
                break;
            case 8:
                Field8(panel, title, subtitle, c);
                break;
            case 9:
                Field9(panel, title, subtitle, c);
                break;
            case 10:
                Field10(panel, title, subtitle, c);
                break;
            case 11:
                Field11(panel, title, subtitle, c);
                break;
            case 12:
                Field12(panel, title, subtitle, c);
                break;
            case 13:
                Field13(panel, title, subtitle, c);
                break;
            case 14:
                Field14(panel, title, subtitle, c);
                break;
            case 15:
                Field15(panel, title, subtitle, c);
                break;
            case 16:
                Field16(panel, title, subtitle, c);
                break;
            case 17:
                Field17(panel, title, subtitle, c);
                break;
            case 18:
                Field18(panel, title, subtitle, c);
                break;
            default:
                break;
        }
    }

    //Create and panel.add components for field one
    private void Field1(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 1. EXIT DOORS/EXIT WAYS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);

        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);

        PFNA obstruction = new PFNA("Obstruction");
        obstruction.setName("100");
        c.gridy = 2;
        panel.add(obstruction, c);

        PFNA locks = new PFNA("Locks/Panic Hardware");
        locks.setName("101");
        c.gridy = 3;
        panel.add(locks, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field two
    private void Field2(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 2. EXIT SIGNS/EMERGENCY LIGHTS ");
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA exitSigns = new PFNA("Exit Signs Illuminated");
        exitSigns.setName("110");
        c.gridy = 2;
        panel.add(exitSigns, c);
        
        PFNA lights = new PFNA("Emer. Lights Working");
        lights.setName("111");
        c.gridy = 3;
        panel.add(lights, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field three
    private void Field3(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 3. FIRE DOORS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA maintained = new PFNA("Maintained/Close Fully");
        maintained.setName("120");
        c.gridy = 2;
        panel.add(maintained, c);
        
        PFNA unapproved = new PFNA("Unapproved Open Devices");
        unapproved.setName("121");
        c.gridy = 3;
        panel.add(unapproved, c);
        
        PFNA clear = new PFNA("Clear of obstructions");
        clear.setName("122");
        c.gridy = 4;
        panel.add(clear, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field four
    private void Field4(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 4. FIRE EXTINGUISHERS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA minimum = new PFNA("Minimum 2A10BC");
        minimum.setName("130");
        c.gridy = 2;
        panel.add(minimum, c);
        
        PFNA maximum = new PFNA("Max of 75' travel dist.");
        maximum.setName("131");
        c.gridy = 3;
        panel.add(maximum, c);
        
        PFNA inspection = new PFNA("Annual Inspection");
        inspection.setName("132");
        c.gridy = 4;
        panel.add(inspection, c);
        
        PFNA access = new PFNA("Access");
        access.setName("133");
        c.gridy = 5;
        panel.add(access, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field five
    private void Field5(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 5. ELECTRICAL ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA extCords = new PFNA("Extension Cords");
        extCords.setName("140");
        c.gridy = 2;
        panel.add(extCords, c);
        
        PFNA adapters = new PFNA("Multi Plug Adapters");
        adapters.setName("141");
        c.gridy = 3;
        panel.add(adapters, c);
        
        PFNA boxes = new PFNA("Open Boxes, Switches");
        boxes.setName("142");
        c.gridy = 4;
        panel.add(boxes, c);
        
        PFNA electricalPanel = new PFNA("Openings in Electrical Panel");
        electricalPanel.setName("143");
        c.gridy = 5;
        panel.add(electricalPanel, c);
        
        PFNA clearance = new PFNA("36\" clearance from storage");
        clearance.setName("144");
        c.gridy = 6;
        panel.add(clearance, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field six
    private void Field6(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 6. STORAGE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA housekeeping = new PFNA("Housekeeping");
        housekeeping.setName("150");
        c.gridy = 2;
        panel.add(housekeeping, c);
        
        PFNA ceiling = new PFNA("24\" below ceiling");
        ceiling.setName("151");
        c.gridy = 3;
        panel.add(ceiling, c);
        
        PFNA sprinklers = new PFNA("18\" below sprinklers");
        sprinklers.setName("152");
        c.gridy = 4;
        panel.add(sprinklers, c);
        
        PFNA stairs = new PFNA("Uner stairs");
        stairs.setName("153");
        c.gridy = 5;
        panel.add(stairs, c);
        
        PFNA ignition = new PFNA("Close to ignition source");
        ignition.setName("154");
        c.gridy = 6;
        panel.add(ignition, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field seven
    private void Field7(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 7. FLAMMABLE/COMBUSTABLE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA placards = new PFNA("704 Placards");
        placards.setName("160");
        c.gridy = 2;
        panel.add(placards, c);
        
        PFNA msds = new PFNA("MSDS on premises");
        msds.setName("161");
        c.gridy = 3;
        panel.add(msds, c);
        
        PFNA signs = new PFNA("Non-smoking signs");
        signs.setName("162");
        c.gridy = 4;
        panel.add(signs, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field eight
    private void Field8(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 8. COMPRESSED GASES ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA secured = new PFNA("Secured");
        secured.setName("170");
        c.gridy = 2;
        panel.add(secured, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field nine
    private void Field9(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 9. SPRAY FINISHING OPERATION ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA extinguisher = new PFNA("Minimum 4A40BC fire extinguisher within 30'");
        extinguisher.setName("180");
        c.gridy = 2;
        panel.add(extinguisher, c);
        
        PFNA sprayBooth = new PFNA("Approved spray booth");
        sprayBooth.setName("181");
        c.gridy = 3;
        panel.add(sprayBooth, c);
        
        PFNA autoExt = new PFNA("Auto extinguishing system Inspected Annually");
        autoExt.setName("182");
        c.gridy = 4;
        panel.add(autoExt, c);
        
        PFNA warningSigns = new PFNA("Welding/hotwork warning signs and No Smoking signs");
        warningSigns.setName("183");
        c.gridy = 5;
        panel.add(warningSigns, c);
        
        add(panel, BorderLayout.CENTER);
        
    }
    
    //Create and panel.add components for field ten
    private void Field10(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        final DateField dateField = new DateField('.', "Date of last service");
        final LocationDropDown riserLocation = new LocationDropDown("Riser Location", "");
        
        title.setText(" 10. SPRINKLER/STANDPIPE ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        c.gridy = 2;
        PFNA service = new PFNA("Annual Service");
        service.setName("190");
        panel.add(service, c);
        
        c.gridy = 3;
        dateField.setName("191");
        panel.add(dateField, c);
        
        c.gridy = 4;
        PFNA access = new PFNA("Access");
        access.setName("192");
        panel.add(access, c);
        
        PFNA standpipe = new PFNA("Standpipe sticker on door");
        standpipe.setName("193");
        c.gridy = 5;
        panel.add(standpipe, c);
        
        PFNA sprinklerRoom = new PFNA("Sprinkler room identified");
        sprinklerRoom.setName("194");
        c.gridy = 6;
        panel.add(sprinklerRoom, c);
        
        c.gridy = 7;
        riserLocation.setName("195");
        panel.add(riserLocation, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field eleven
    private void Field11(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        final DateField lastService = new DateField('.', "Last service date");
        
        title.setText(" 11. HOOD EXT. SYSTEM ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA service = new PFNA("Service within 6 months");
        service.setName("200");
        c.gridy = 2;
        panel.add(service, c);
        
        c.gridy = 3;
        lastService.setName("201");
        panel.add(lastService, c);
        
        PFNA access = new PFNA("Access to remote pull");
        access.setName("202");
        c.gridy = 4;
        panel.add(access, c);
        
        PFNA clean = new PFNA("Clean");
        clean.setName("203");
        c.gridy = 5;
        panel.add(clean, c);
        
        PFNA extinguisher = new PFNA("\"K\" Class extinguisher");
        extinguisher.setName("204");
        c.gridy = 6;
        panel.add(extinguisher, c);
        
        PFNA nozzle = new PFNA("Nozzle Condition");
        nozzle.setName("205");
        c.gridy = 7;
        panel.add(nozzle, c);
        
        PFNA filters = new PFNA("Filters in place");
        filters.setName("206");
        c.gridy = 8;
        panel.add(filters, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field twelve
    private void Field12(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 12. OCCUPANT LOAD ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA posted = new PFNA("Posted in places of assembly");
        posted.setName("210");
        c.gridy = 2;
        panel.add(posted, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field thirteen
    private void Field13(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 13. ADDRESS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA visible = new PFNA("Visible & legible");
        visible.setName("220");
        c.gridy = 2;
        panel.add(visible, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field fourteen
    private void Field14(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        final LocationDropDown knox = new LocationDropDown("KnoxBox Location", "");
        
        title.setText(" 14. FIRE DEPT. ACCESS ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA maint = new PFNA("Maint/Lubrication");
        maint.setName("230");
        c.gridy = 2;
        panel.add(maint, c);
        
        PFNA boxKeys = new PFNA("Knox box keys current");
        boxKeys.setName("231");
        c.gridy = 3;
        panel.add(boxKeys, c);
        
        knox.setName("232");
        c.gridy = 5;
        panel.add(knox, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field fifteen
    private void Field15(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        final LocationDropDown fdc = new LocationDropDown("FDC Location", "");
        
        title.setText(" 15. FIRE DEPT. CONNECTION ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA caps = new PFNA("FDC caps in place");
        caps.setName("240");
        c.gridy = 2;
        panel.add(caps, c);
        
        PFNA identified = new PFNA("FDC identified");
        identified.setName("241");
        c.gridy = 3;
        panel.add(identified, c);
        
        PFNA access = new PFNA("FDC access is unobstructed");
        access.setName("242");
        c.gridy = 4;
        panel.add(access, c);
        
        fdc.setName("243");
        c.gridy = 5;
        panel.add(fdc, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field sixteen
    private void Field16(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 16. ELEVATOR ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA keys = new PFNA("Override Keys On-Site");
        keys.setName("250");
        c.gridy = 2;
        panel.add(keys, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field seventeen
    private void Field17(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 17. PROPANE ");
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        PFNA placards = new PFNA("704 Placards");
        placards.setName("260");
        c.gridy = 2;
        panel.add(placards, c);
        
        PFNA permit = new PFNA("Permit on site");
        permit.setName("261");
        c.gridy = 3;
        panel.add(permit, c);
        
        PFNA bollards = new PFNA("Impact bollards");
        bollards.setName("262");
        c.gridy = 4;
        panel.add(bollards, c);
        
        add(panel, BorderLayout.CENTER);
    }
    
    //Create and panel.add components for field eighteen
    private void Field18(JPanel panel, JLabel title, JLabel subtitle, GridBagConstraints c)
    {
        title.setText(" 18. OTHER ");
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(title, c);
        
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(subtitle, c);
        
        JCheckBox button = new JCheckBox("Other Violations Noted - Use box below", false);
        button.setName("270");
        c.gridy = 4;
        panel.add(button, c);
        
        add(panel, BorderLayout.CENTER);
    }
}