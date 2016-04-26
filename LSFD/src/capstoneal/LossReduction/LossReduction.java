/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal.LossReduction;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author awdobson1129
 */
public class LossReduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create the frame
        LossReductionForm panel = new LossReductionForm(); // new panel
        frame.add(panel); // print panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make it close when you hit the red X in the corner
        frame.setVisible(true); // make it visible
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // make the screen big
    }
    
}
