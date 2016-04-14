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
  
        /*
        //String comments = JLabel("Comments: ");
        String date = JOptionPane.showInputDialog("Date: ");
        String name = JOptionPane.showInputDialog("What is your name? ");
        
        String COMMENTS = String.format("Comments: %s", comments);
        String DATE = String.format("Date: %s", date);
        String INSPECTOR = String.format("Inspector: %s", name);
        
        JOptionPane.showMessageDialog(null, COMMENTS);
        JOptionPane.showMessageDialog(null, DATE);
        JOptionPane.showMessageDialog(null, INSPECTOR);
        */
        
        
        JFrame frame = new JFrame();
        
        CommentsInspection panel = new CommentsInspection();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
