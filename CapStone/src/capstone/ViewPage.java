/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;



/**
 *
 * @author ccallen0504
 */
public class ViewPage extends JPanel {
    private final int width;
    private final int height;
    private final JToolBar toolBar;
    
    private NavigationButton forward;
    private NavigationButton backward;
    
    private GUI mainPanel; 
    
    public ViewPage(int width, int height){
        this.width = width;
        this.height = height;
        toolBar = new JToolBar();
        init();
    }
    
    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        toolBar.setBorderPainted(true);
        toolBar.setLayout(new FlowLayout());
        
        forward = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));
        
        backward = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));
        
        toolBar.add(backward);
        toolBar.add(forward);
        
        add(toolBar);
        
        add(mainPanel);
        
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        ViewPage page = new ViewPage(Util.getScreenDimension().width, Util.getScreenDimension().height);
        
        frame.add(page);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        
        frame.requestFocus();
    }
}
