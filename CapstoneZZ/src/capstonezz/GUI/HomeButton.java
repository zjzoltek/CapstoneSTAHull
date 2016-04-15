package capstonezz.GUI;

import capstonezz.Util;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 8, 2016
 */

public class HomeButton extends JButton {
    private final int realWidth;
    private final int realHeight;
    
    public HomeButton(int width, int height){
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
         
    }
    
    public int getTrueWidth(){
        return realWidth;
    }
    
    public int getTrueHeight(){
        return realHeight;
    }
}
