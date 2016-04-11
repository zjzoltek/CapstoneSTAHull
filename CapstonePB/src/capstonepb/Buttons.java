/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//thank you oracle
package capstonepb;





import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class Buttons extends JPanel
                        implements ActionListener {
    protected JButton b1, b2, b3;

    public Buttons() {
        ImageIcon leftButtonIcon = createImageIcon("save-icon.png");
        ImageIcon middleButtonIcon = createImageIcon("&icon1.png");
        ImageIcon rightButtonIcon = createImageIcon("cancel-icon.png");

        b1 = new JButton("Save", leftButtonIcon);
        
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
        b1.setMnemonic(KeyEvent.VK_S);
        //b1.setActionCommand("disable");

        b2 = new JButton("Save                    Exit", middleButtonIcon);
        b2.setVerticalTextPosition(AbstractButton.CENTER);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_X);

        b3 = new JButton("Cancel", rightButtonIcon);
        
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b3.setMnemonic(KeyEvent.VK_C);
        //b3.setActionCommand("enable");
        b3.setEnabled(true);

        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b3.addActionListener(this);

        b1.setToolTipText("Click this button to disable the middle button.");
        b2.setToolTipText("This middle button does nothing when you click it.");
        b3.setToolTipText("Click this button to enable the middle button.");

        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
    }
  
     public void actionPerformed(ActionEvent e) {
    if ("cancel".equals(e.getActionCommand())) {
    b2.setEnabled(true);
    b1.setEnabled(true);
    b3.setEnabled(true);
    } else {
    b2.setEnabled(true);
    b1.setEnabled(true);
    b3.setEnabled(true);
    }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Buttons.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        

        //Display the window.
        
       // frame.setVisible(true);
        
    }

   
}

