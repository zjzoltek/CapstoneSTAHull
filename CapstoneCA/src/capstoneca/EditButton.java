/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneca;

import capstonezz.Util;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ccallen0504
 */
public class EditButton extends JButton {
    
     
    private final int realWidth;
    private final int realHeight;
    
    public EditButton(int width, int height){
        super();
        realWidth = width;
        realHeight = height;
        init(width, height);
    }
    
    // creats the image of the button
    private void init(int width, int height){
        setSize(width, height);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(true);
        
        BufferedImage homeImg = Util.scaledBuffered(Util.getImage(getClass()
                .getResource("/EditButton.png")), this.getWidth(), this.getHeight());
        
        ImageIcon ico = new ImageIcon(homeImg);
        setIcon((Icon) ico);
         
    }
    
    //gets the height and width of the screen
    
    public int getTrueWidth(){
        return realWidth;
    }
    
    public int getTrueHeight(){
        return realHeight;
    }
}
    

