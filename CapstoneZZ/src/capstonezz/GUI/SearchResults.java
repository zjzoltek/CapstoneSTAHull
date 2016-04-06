package capstonezz.GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 5, 2016
 */

public class SearchResults extends JPanel {
    private GridBagConstraints c;
    
    private JButton backButton;
    private JButton forwardButton;
    private JSeparator seppy;
    
    public SearchResults(){
        super(new GridBagLayout());
        init();
    }
    
    private void init(){
        c = new GridBagConstraints();
        
        ImageIcon back = new ImageIcon(getClass().getResource("/BackButton.png"));
        ImageIcon forward = new ImageIcon(getClass().getResource("/ForwardButton.png"));
        
        backButton = new JButton((Icon)back);
        forwardButton = new JButton((Icon)forward);
        
        c.gridx = 0;
        c.gridy = 0;
        
        add(backButton, c);
        
        /*c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridheight = 3;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 1;
        
        add(seppy, c);*/
    }
    
    
    public static void main(String[] args){
        SearchResults page = new SearchResults();
        JFrame frame = new JFrame();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width = (int)tk.getScreenSize().getWidth();
        int height = (int)tk.getScreenSize().getHeight();
        
        frame.setSize(new Dimension(width, height));
        
        frame.add(page);
        
        frame.setResizable(false);
        frame.setVisible(true);
        
    }

}
