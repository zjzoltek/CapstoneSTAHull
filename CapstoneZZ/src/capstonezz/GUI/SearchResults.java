package capstonezz.GUI;

import capstonezz.Util;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResults extends JPanel {
    private NavigationButton backButton;
    private NavigationButton forwardButton;
    private JButton homeButton;
    
    private final int screenWidth;
    private final int screenHeight;
    
    public SearchResults(){
        super(new GridBagLayout());
        
        screenWidth = Util.getScreenDimension().width;
        screenHeight = Util.getScreenDimension().height;
        
        init();
    }
    
    private void init(){
        setBackground(Color.GRAY.brighter());
        GridBagConstraints c = new GridBagConstraints();
        
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        screenWidth / NavigationButton.NAVWIDTH_DIVISOR - NavigationButton. NAVBUTTON_OFFSET, 
                screenHeight / NavigationButton.NAVHEIGHT_DIVISOR - NavigationButton.NAVBUTTON_OFFSET);
        
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = .1;
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton, c);
        
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        screenWidth / NavigationButton.NAVWIDTH_DIVISOR - NavigationButton. NAVBUTTON_OFFSET,
                screenHeight / NavigationButton.NAVHEIGHT_DIVISOR - NavigationButton.NAVBUTTON_OFFSET);
        
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        add(forwardButton, c);
        
        homeButton = new JButton("Home"); 
        
        homeButton.setFocusPainted(false);
        homeButton.setBackground(getBackground().darker());
        
        homeButton.setPreferredSize(new Dimension(Util.getScreenDimension().width / 12,
                backButton.getHeight() + 10));
        
        c.gridx = 2;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTH;
        
        add(homeButton, c);
        
        c = new GridBagConstraints();
        
        SearchBox address = new SearchBox("Address", 30);
        address.setPreferredSize(new Dimension(SearchBox.BOXWIDTH, SearchBox.BOXHEIGHT));
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0;
        c.weighty = .9;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTHWEST;
        
        
        add(address, c);
        
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0, backButton.getHeight(), Util.getScreenDimension().width, 15);
    }
    
    public static void main(String[] args){
        SearchResults page = new SearchResults();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(page);
        
        //frame.setResizable(false);
        frame.setVisible(true);
        
        frame.requestFocus();
        
    }

}
