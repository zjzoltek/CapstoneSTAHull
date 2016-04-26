/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFLossReduction;

import javax.swing.JFrame;

/**
 *
 * @author ccallen0504
 */
public class sFLRTTypeTest {
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        sFLRTType panel = new sFLRTType();

        frame.add(panel);
        frame.setSize(1600, 1000);
        frame.setVisible(true);
    }
}
