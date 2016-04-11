/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone.GUI;

/**
 *
 * @author ACLeavitt0612
 * 04/05/2016
 * 
 */


import javax.swing.*;

public class CapstoneAL {

    /**
     * @param args the command line arguments
     */
    
    
   CapstoneAL(){
       
        JFrame frame = new JFrame();
        int width = 400;
        int height = 400;
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes frame
        
        width = frame.getWidth();
        height = frame.getWidth();
        
        HomeScreen homeScreen = new HomeScreen(width, height); // creates new homescreen panel
        
        frame.add(homeScreen); // adds homeScreen to the frame
        
        
        frame.setVisible(true); // makes frame visible
   }
    
    public static void main(String[] args) {
        
        new CapstoneAL();
        
    }
    
}
