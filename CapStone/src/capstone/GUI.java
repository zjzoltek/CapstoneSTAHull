/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone;


import capstone.Util;
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
 *
 * @author ccallen0504
 */
public class GUI extends JPanel implements ActionListener {
    private final ButtonGroup quadrants = new ButtonGroup();
    
    public JButton initiateSearch;
    private final int width;
    private final int height;

    private JCheckBox caseSensitive;
    private final JProgressBar loadingBar;

    
    public GUI(Color color, int parentWidth, int parentHeight){
        super(new GridBagLayout());
        width = parentWidth;
        height = parentHeight;
        loadingBar = new JProgressBar();
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
        
        initiateSearch = new JButton("SEARCH", (Icon) searchIco);
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