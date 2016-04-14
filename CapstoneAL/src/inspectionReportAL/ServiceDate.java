/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 */

import javax.swing.*;
import java.awt.*;

public class ServiceDate extends JPanel{
    //text fields
    private JTextField month = new JTextField("MM");
    private JTextField day = new JTextField("DD");
    private JTextField year = new JTextField("YYYY");
    //labels
    private JLabel divider = new JLabel("/");
    private JLabel label;
    //layout
    private FlowLayout layout = new FlowLayout();
    
    ServiceDate(String lableText){
        setLayout(layout); // set layout of panel
        
        label = new JLabel(lableText); // set text of jlabel
        
        //add components to the panel
        add(month);
        add(divider);
        add(day);
        add(divider);
        add(year);
        add(label);
    }
    
    ServiceDate(){
        setLayout(layout); // set layout of panel
        
        label = new JLabel("Date of Last Service"); // set text of jlabel
        
        //add components to the panel
        add(month);
        add(divider);
        add(day);
        add(divider);
        add(year);
        add(label);
    }
    
}
