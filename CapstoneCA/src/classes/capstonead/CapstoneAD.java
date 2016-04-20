/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonead;
import javax.swing.*;
import java.awt.BorderLayout;

/**
 *
 * @author awdobson1129
 */
public class CapstoneAD{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CommentsInspection panel = new CommentsInspection(); // new panel
        frame.add(panel); // print panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make it close when you hit the red X in the corner
        frame.setVisible(true); // make it visible
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // make the screen big
    }
    
}
