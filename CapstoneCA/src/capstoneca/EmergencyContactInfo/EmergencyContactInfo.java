package capstoneca.EmergencyContactInfo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

/**
 *
 * @author ccallen0504
 */
public class EmergencyContactInfo extends JFrame {

    // simply makes the frame so programer would be able to see how things were going
    
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CreatesTextFields Text = new CreatesTextFields("text");

        
        frame.add(Text);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
}
