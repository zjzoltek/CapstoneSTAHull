/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone;

import capstonezz.Util;
import java.awt.Cursor;
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
    private Home homeButton;
    private EditButton editButton;
    
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
        
        homeButton = new Home(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));
        
        editButton = new EditButton(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));
        
        editButton.setBorderPainted(true);
        editButton.setFocusPainted(true);
        editButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        homeButton.setBorderPainted(true);
        homeButton.setFocusPainted(true);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        toolBar.setLayout(new FlowLayout());
        toolBar.add(backward);
        toolBar.add(forward);
        toolBar.add(homeButton);
        toolBar.add(editButton);
        
        add(toolBar);
        
        
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        ViewPage page = new ViewPage(Util.getScreenDimension().width, Util.getScreenDimension().height);
        
        frame.add(page);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(page);
        frame.setVisible(true);
        
        frame.requestFocus();
    }
}
