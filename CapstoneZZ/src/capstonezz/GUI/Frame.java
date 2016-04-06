package capstonezz.GUI;

import javax.swing.JFrame;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 6, 2016
 */

public class Frame {
    public final int width;
    public final int height;
    
    public JFrame frame;
    
    public Frame(){
        frame = new JFrame();
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        width = frame.getWidth();
        height = frame.getHeight();
    }
    
    public Frame(String title){
        frame = new JFrame(title);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        width = frame.getWidth();
        height = frame.getHeight();
    }
    
    public void show(){
        frame.setVisible(true);
    }
    
    public void hide(){
        frame.setVisible(false);
    }
    
}
