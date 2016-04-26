/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactInfoSection;

import javax.swing.JFrame;

/**
 *
 * @author ccallen0504
 */
public class BusinessTest {
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Business Text = new Business("");

        
        frame.add(Text);
        frame.setSize(1600, 1000);
        frame.setVisible(true);
    }
    
}
