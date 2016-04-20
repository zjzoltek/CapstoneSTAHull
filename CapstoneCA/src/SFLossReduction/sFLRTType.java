/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFLossReduction;

/**
 *
 * @author ccallen0504
 */

import javax.swing.*;

public class sFLRTType {
    
    //Title
    
    
    //making the check boxes 
    // row one
    private final JCheckBox cB1 = new JCheckBox(" Occupancy ");
    private final JCheckBox cB2 = new JCheckBox(" Life Safety ");
    private final JCheckBox cB3 = new JCheckBox(" Sprinkler ");
    private final JCheckBox cB4 = new JCheckBox(" Hazardous Materials Permint ");
    //limiting the activity so they can't check both off
    JRadioButton semi = new JRadioButton("Semi - Annual ");
    JRadioButton annual = new JRadioButton("Annual");
    
    // row two
    private final JCheckBox cB5 = new JCheckBox(" Complaint ");
    private final JCheckBox cB6 = new JCheckBox(" Explosive Storage ");
    private final JCheckBox cB7 = new JCheckBox(" UST ");
    private final JCheckBox cB8 = new JCheckBox(" Post-Incident ");
    private final JCheckBox cB9 = new JCheckBox(" Open Burning ");
    private final JCheckBox cB10 = new JCheckBox(" Other ");
    
    JPanel panel = new JPanel();
    
    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    
    
           
}
