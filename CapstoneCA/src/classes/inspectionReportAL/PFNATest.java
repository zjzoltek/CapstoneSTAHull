/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PFNATest {
    
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        InspectionReport inspectionReport = new InspectionReport();
        PFNA pfna = new PFNA("Generic Text Here"); 
        
        frame.add(inspectionReport, BorderLayout.PAGE_START);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
