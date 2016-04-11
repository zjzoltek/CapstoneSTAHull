package capstonezz.GUI;

import capstonezz.Util;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 6, 2016
 */

public class NavigationButton extends JButton {
    public static enum NavigationType { BACK, FORWARD }
    
    public static final int NAVBUTTON_OFFSET = 20;
    public static final int NAVHEIGHT_DIVISOR = 10;
    public static final int NAVWIDTH_DIVISOR = 20;
    
    private final int realWidth;
    private final int realHeight;
    
    public NavigationButton(NavigationType type, int width, int height){
        super();
        realWidth = width;
        realHeight = height;
        init(type, width, height);
    }
    
    
    private void init(NavigationType type, int width, int height){
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setSize(width, height);
        setFocusPainted(true);
        setContentAreaFilled(false);
        setBorderPainted(true);
        
        switch(type){
            case BACK:
                BufferedImage backImg = Util.scaledBuffered(Util.getImage(getClass()
                       .getResource("/BackButton.png")), this.getWidth(),
                       this.getHeight());
                ImageIcon backIco = new ImageIcon(backImg);
                setIcon((Icon) backIco);
                break;
                
            case FORWARD:
                BufferedImage forwardImg = Util.scaledBuffered(Util.getImage(getClass()
                        .getResource("/ForwardButton.png")), this.getWidth(),
                        this.getHeight());

                ImageIcon forwardIco = new ImageIcon(forwardImg);
                setIcon((Icon) forwardIco);
                break;
        }
         
    }
    
    public int getTrueWidth(){
        return realWidth;
    }
    
    public int getTrueHeight(){
        return realHeight;
    }
    
    public static int getButtonWidth(int width){
        return width / NAVWIDTH_DIVISOR - NAVBUTTON_OFFSET;
    }
    
    public static int getButtonHeight(int height){
        return height / NAVHEIGHT_DIVISOR - NAVBUTTON_OFFSET;
    }
    
}
