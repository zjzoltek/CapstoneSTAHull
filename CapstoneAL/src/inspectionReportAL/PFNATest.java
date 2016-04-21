/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectionReportAL;

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
        frame.add(inspectionReport, BorderLayout.CENTER);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
