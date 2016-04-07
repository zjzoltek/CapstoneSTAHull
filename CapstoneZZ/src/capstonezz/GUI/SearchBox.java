package capstonezz.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 7, 2016
 */

public class SearchBox extends JTextField implements MouseListener, FocusListener{
    private boolean clearOnClick = false;
    private boolean clearOnFocus = false;
    
    private Color focusLostColor = Color.WHITE.darker();
    private Color focusGainedColor = Color.WHITE;
    
    private int roundness = 15;
    
    public static int BOXWIDTH = 30;
    public static int BOXHEIGHT = 30;
    
    public SearchBox(String initialText, int size){
        super(initialText, size);
        init();
    }
    
    public SearchBox(int size){
        super(size);
        init();
    }
    
    private void init(){
        setFont(new Font("Times New Roman", Font.PLAIN, getColumns() - 10));
        setOpaque(false);
        addFocusListener(this);
        addMouseListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        repaint();
        if(clearOnFocus){
            setText("");
        } else {
            selectAll();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        repaint();
        if(clearOnClick && !hasFocus()){
            setText("");
        } else {
            if(hasFocus()){
                return;
            } else {
                selectAll();
            }
        }
    }
    
    public void clearOnFocus(boolean clear){
        clearOnFocus = clear;
    }
    
    public void clearOnClick(boolean clear){
        clearOnClick = clear;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        if(hasFocus()){
            g.setColor(focusGainedColor);
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundness, roundness);
        }
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundness, roundness);
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        e.getComponent().setBackground(focusLostColor);
        repaint();
    }
    
    public void setFocusLostColor(Color c){
        focusLostColor = c;
    }
    
    public void setFocusGainedColor(Color c){
        focusGainedColor = c;
    }
    
    public void setRoundness(int roundness){
        this.roundness = roundness;
    }
    
    public int getRoundness(){
        return roundness;
    }
    
    public Color getFocusGainedColor(){
        return focusGainedColor;
    }
    
    public Color getFocusLostColor(){
        return focusLostColor;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
