package capstonezz.GUI;

import capstonezz.Threading.SearchTask;
import capstonezz.Util;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 9, 2016
 */

public class SearchResultsGUI extends JPanel implements ActionListener {
    private final JButton initiateSearch;
    private final int width;
    private final int height;
    private final SearchBox number;
    private final SearchBox address;
    private final JProgressBar loadingBar;
    private final SearchResults searchresults;
    
    private final JLabel addressLabel;
    private final JLabel numberLabel;
    
    public SearchResultsGUI(Color color, int parentWidth, int parentHeight, SearchResults results){
        super(new GridBagLayout());
        width = parentWidth;
        height = parentHeight;
        searchresults = results;
        loadingBar = new JProgressBar();
        
        address = new SearchBox("", 30, 5, false);
        number = new SearchBox("", 30, 5, true);
        
        addressLabel = new JLabel("Address Search");
        numberLabel = new JLabel("PFA # Search");
        
        addressLabel.setFont(addressLabel.getFont().deriveFont(Font.ITALIC + Font.PLAIN, 24));
        numberLabel.setFont(numberLabel.getFont().deriveFont(Font.ITALIC + Font.PLAIN, 24f));
        initiateSearch = new JButton();
        init(color);
    }
    
    private void init(Color color){
        setBackground(color);
        loadingBar.setBackground(getBackground().brighter());
        loadingBar.setIndeterminate(true);
        GridBagConstraints c = new GridBagConstraints();
        
        c.anchor = GridBagConstraints.CENTER;
        
        c = new GridBagConstraints();
        
        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 1;
        c.weighty = .1;
        c.gridwidth = 3;
        
        add(addressLabel, c);
        
        c = new GridBagConstraints();
        
        address.setPreferredSize(new Dimension(SearchBox.BOXWIDTH, SearchBox.BOXHEIGHT));
        c.gridx = 1;
        c.gridy = 4;
        c.weightx = 0;
        c.weighty = .1;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.NORTH;
        
        address.addActionListener((ActionEvent e) ->{
           initiateSearch.doClick();
        });
        
        add(address, c);
        
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 5;
        c.weightx = 1;
        c.weighty = .1;
        c.gridwidth = 3;
        
        add(numberLabel, c);
        
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        displayLoadingBar(true);
        new SearchTask(searchresults, this, address.getText(), number.getText());
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
    
    public SearchBox getAddressBox(){
        return address;
    }
    
    public SearchBox getNumberBox(){
        return number;
    }
    
    public JButton getInitiateSearchButton(){
        return initiateSearch;
    }
    
}
