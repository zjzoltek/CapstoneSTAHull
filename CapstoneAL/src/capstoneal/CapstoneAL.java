/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneal;

/**
 *
 * @author ACLeavitt0612
 */

import java.awt.*;
import javax.swing.*;

public class CapstoneAL extends JFrame{

    /**
     * @param args the command line arguments
     */
    
   CapstoneAL(){
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets default close operation
        
        HomeScreen homeScreen = new HomeScreen(); // creates new homescreen panel
        
        add(homeScreen); // adds homeScreen to the frame
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes frame
        setVisible(true); // makes frame visible
   }
    
    public static void main(String[] args) {
        
        new CapstoneAL();
        
    }
    
}
