/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//thank you oracle
package capstonepb;





import java.awt.Cursor;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;

/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class EditPageButtons extends JButton {
    
    public static enum ButtonType { SAVE, CANCEL, AND }
    
    private final int realWidth;
    private final int realHeight;
    
    public EditPageButtons(ButtonType type, int width, int height){
        super();
        realWidth = width;
        realHeight = height;
        init(type, width, height);
    }
    
    private void init(ButtonType type, int width, int height) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setSize(width, height);
        setFocusPainted(true);
        setContentAreaFilled(false);
        setBorderPainted(true);
        
        switch(type){
            case SAVE:
                ImageIcon saveIcon = createImageIcon("/save-icon.png");
                setText("Save");
                setIcon(saveIcon);
                setVerticalTextPosition(AbstractButton.CENTER);
                setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
                setMnemonic(KeyEvent.VK_S);
                break;
            case AND:
                ImageIcon andIcon = createImageIcon("/&icon1.png");
                setText("Save and Exit");
                setIcon(andIcon);
                setVerticalTextPosition(AbstractButton.CENTER);
                setHorizontalTextPosition(AbstractButton.LEADING);
                setMnemonic(KeyEvent.VK_X);
                break;
            case CANCEL:
                ImageIcon cancelIcon = createImageIcon("/cancel-icon.png");
                setIcon(cancelIcon);
                setText("Cancel");
                setMnemonic(KeyEvent.VK_C);
                break;
        }
    }
    
    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
