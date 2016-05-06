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
public class Home extends JButton {
    private final int realWidth;
    private final int realHeight;
    
    public Home(int width, int height){
        super();
        realWidth = width;
        realHeight = height;
        init(width, height);
    }
    
    
    private void init(int width, int height){
        setSize(width, height);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(true);
        
 
        BufferedImage homeImg = Util.scaledBuffered(Util.getImage(getClass()
                .getResource("/HomeButton.png")), this.getWidth(), this.getHeight());
        
        ImageIcon ico = new ImageIcon(homeImg);
        setIcon((Icon) ico);
        setToolTipText("Go Home");
         
    }
    
    public int getTrueWidth(){
        return realWidth;
    }
    
    public int getTrueHeight(){
        return realHeight;
    }
}

