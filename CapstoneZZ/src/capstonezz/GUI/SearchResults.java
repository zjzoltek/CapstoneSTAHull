package capstonezz.GUI;

import capstonezz.Input.KeyInput;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResults extends BasicPage {
    private GridBagConstraints c;
    
    public SearchResults(){
        super(new GridBagLayout());
        init();
    }
    
    private void init(){
        c = new GridBagConstraints();
        
        JSeparator seppy = new JSeparator();

        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridheight = 3;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 1;
      
        add(seppy, c);
    }
    
    
    public static void main(String[] args){
        SearchResults page = new SearchResults();
        
        JFrame frame = new JFrame("Search Results");
        frame.addKeyListener(new KeyInput());
        frame.add(page);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
}
