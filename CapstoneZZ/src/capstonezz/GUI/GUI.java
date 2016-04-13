package capstonezz.GUI;

import capstonezz.Threading.SearchTask;
import capstonezz.Util;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 9, 2016
 */

public class GUI extends JPanel implements ActionListener {
    private final ButtonGroup quadrants = new ButtonGroup();
    
    public final JButton initiateSearch;
    private final int width;
    private final int height;
    public final SearchBox number;
    public final SearchBox address;
    private JCheckBox caseSensitive;
    public final JProgressBar loadingBar;
    private final SearchResults searchresults;
    
    public GUI(Color color, int parentWidth, int parentHeight, SearchResults results){
        super(new GridBagLayout());
        width = parentWidth;
        height = parentHeight;
        searchresults = results;
        loadingBar = new JProgressBar();
        
        address = new SearchBox("Address", 30, 5, false);
        number = new SearchBox("Number", 30, 5, true);
        initiateSearch = new JButton("SEARCH");
        init(color);
    }
    
    private void init(Color color){
        setBackground(color);
        loadingBar.setBackground(getBackground().brighter());
        loadingBar.setIndeterminate(true);
        GridBagConstraints c = new GridBagConstraints();
        
        JRadioButton NW = new JRadioButton("NW");
        JRadioButton NE = new JRadioButton("NE");
        JRadioButton SW = new JRadioButton("SW");
        JRadioButton SE = new JRadioButton("SE");
        
        NW.setBackground(getBackground());
        NE.setBackground(getBackground());
        SW.setBackground(getBackground());
        SE.setBackground(getBackground());
        
        quadrants.add(NW);
        quadrants.add(NE);
        quadrants.add(SW);
        quadrants.add(SE);
        
        c.anchor = GridBagConstraints.CENTER;
        
        c.gridy = 3;
        c.gridx = 1;
        c.weightx = 0;
        c.weighty = 0;
        add(NW, c);
        
        c.gridx = 2;
        c.weightx = 0;
        add(NE, c);
        
        c.gridx = 3;
        c.weightx = 0;
        add(SW, c);
        
        c.gridx = 4;
        c.weightx = 0;
        add(SE, c);
        
        c = new GridBagConstraints();
        
        address.setPreferredSize(new Dimension(SearchBox.BOXWIDTH, SearchBox.BOXHEIGHT));
        c.gridx = 1;
        c.gridy = 4;
        c.weightx = 0;
        c.weighty = .3;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTH;
        
        address.addActionListener((ActionEvent e) ->{
           initiateSearch.doClick();
        });
        
        add(address, c);
        
        c = new GridBagConstraints();
        
        caseSensitive = new JCheckBox("Case-Sensitive");
        caseSensitive.setBackground(getBackground());
        c.gridx = 1;
        c.gridy = 5;
        c.weightx = 0;
        c.weighty = .3;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTH;
        add(caseSensitive, c);
        
        c = new GridBagConstraints();
        
        c.gridx = 1;
        c.gridy = 6;
        c.weightx = 0;
        c.weighty = .1;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTH;
        

        number.setPreferredSize(new Dimension(SearchBox.BOXWIDTH, SearchBox.BOXHEIGHT));
        
        number.addActionListener((ActionEvent e) ->{
           initiateSearch.doClick();
        });
        
        add(number, c);
       
        BufferedImage searchImg = Util.scaledBuffered(Util.getImage(getClass()
                       .getResource("/MagnifyingGlass.png")),
                NavigationButton.getButtonWidth(width), 
                NavigationButton.getButtonHeight(height));
        
        ImageIcon searchIco = new ImageIcon(searchImg);
        
        c = new GridBagConstraints();
        
        c.gridx = 1;
        c.gridy = 7;
        c.weightx = 0;
        c.weighty = .3;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTH;
        
        initiateSearch.setIcon((Icon) searchIco);
        initiateSearch.setFocusPainted(false);
        initiateSearch.setBorderPainted(false);
        initiateSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        initiateSearch.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                initiateSearch.setBorderPainted(true);
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                initiateSearch.setBorderPainted(false);
                repaint();
            }
            
        });
        initiateSearch.setContentAreaFilled(false);
        
        initiateSearch.addActionListener(this);
        add(initiateSearch, c);
        
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 8;
        c.weighty = 0;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.SOUTH;
        
        loadingBar.setVisible(false);
        loadingBar.setEnabled(false);
        add(loadingBar, c);
    }
        
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(getBackground().darker());
        g2d.fillRect(0, getHeight() - 15, width, 15);
    }
    public ButtonGroup getQuadrants(){
        return quadrants;
    }
    
    public boolean isCaseSensitive(){
        return caseSensitive.isSelected();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        displayLoadingBar(true);
        new SearchTask(searchresults, this, address.getText(), number.getText(), caseSensitive.isSelected());
    }
    
        
    public void displayLoadingBar(boolean which){
        if(which){
            loadingBar.setVisible(true);
            loadingBar.setEnabled(true);
            revalidate();
        } else {
            loadingBar.setVisible(false);
            loadingBar.setEnabled(false);
            revalidate();
        }
    }
    
}
