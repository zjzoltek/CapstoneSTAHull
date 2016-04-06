package capstonezz.GUI;

import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 6, 2016
 */

public abstract class BasicPage extends JPanel implements KeyListener {
    private int width;
    private int height;
    
    public JFrame frame;
    
    public BasicPage(){
        frame = new JFrame();
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        width = frame.getWidth();
        height = frame.getHeight();
    }
    
    public void getWidth(int width){
        this.width = width;
    }
    
    public void getHeight(int height){
        this.height = height;
    }
}
