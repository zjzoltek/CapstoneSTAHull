package capstonezz.GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResults extends JPanel {
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
        Frame frame = new Frame();
        
        frame.frame.add(page);
        frame.frame.setVisible(true);
    }

}
