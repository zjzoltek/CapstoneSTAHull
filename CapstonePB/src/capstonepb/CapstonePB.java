/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author pebledsoe1231
 */
public class CapstonePB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create frame for Shapes2Jpanel
        JFrame frame = new JFrame("Edit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EditPage edit = new EditPage();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        edit.editPage(frame.getWidth());        
        frame.getContentPane().add(edit);
        
        
        frame.setVisible(true);
        
        
        
        
    }
    
}
