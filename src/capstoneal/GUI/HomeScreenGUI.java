package capstoneal.GUI;

import capstonezz.CapstoneConstants;
import capstonezz.Util;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 29, 2016
 */

public class HomeScreenGUI extends JPanel {
    private final Search search;
    
    public HomeScreenGUI(){
        super(new GridBagLayout());
        search = new Search(); // create an instance of Search
        init();
    }
    
    private void init(){
        setBackground(CapstoneConstants.PANEL_BG);
        GridBagConstraints c = new GridBagConstraints();
        BufferedImage LOGO = Util.scaledBuffered(Util.getImage(getClass().getResource("/logo.png")), 1);
        ImageIcon icon = new ImageIcon(LOGO);
        
        JLabel iconL = new JLabel(icon);
        
        c.insets = new Insets(0,0,100,0);
        c.gridx = 0;
        c.gridy = 0;
        
        add(iconL, c);
        c.fill = GridBagConstraints.BOTH;
        c.gridy = 2;
        
        add(search, c);
        
    }
    
    public Search getSearch(){
        return search;
    }
}
