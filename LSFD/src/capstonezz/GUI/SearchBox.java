package capstonezz.GUI;

import capstonezz.NumberDocument;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 7, 2016
 */

public class SearchBox extends JTextField implements MouseListener, FocusListener{
    private boolean clearOnClick = false;
    private boolean clearOnFocus = false;
    private boolean highlightOnClick = false;
    private final boolean numbersOnly;
    
    private Color focusLostColor = Color.WHITE.darker();
    private Color focusGainedColor = Color.WHITE;
    
    private int roundness = 15;
    private int unfocusedFontType = Font.BOLD;
    private int unfocusedDefaultTextFontType = Font.BOLD + Font.ITALIC;
    private final int stroke;
    
    private String initialText;
    
    public static int BOXWIDTH = 30;
    public static int BOXHEIGHT = 30;
    
    public SearchBox(String initialText, int size, int strokeSize, boolean numbersOnly){
        super(initialText, size);
        this.initialText = initialText;
        this.numbersOnly = numbersOnly;
        stroke = strokeSize;
        init();
    }
    
    public SearchBox(int size, int strokeSize, boolean numbersOnly){
        super(size);
        this.numbersOnly = numbersOnly;
        stroke = strokeSize;
        init();
    }
    
    private void init(){
        if(numbersOnly){
            ((AbstractDocument)getDocument()).setDocumentFilter(new NumberDocument());
        }
        setMargin(new Insets(1,5,1,0));
        setFont(getFont().deriveFont(unfocusedDefaultTextFontType, getColumns() - 10));
        setOpaque(false);
        addFocusListener(this);
        addMouseListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        setFont(getFont().deriveFont(Font.PLAIN));
        repaint();
        if(clearOnFocus || getText().equals(initialText)){
            setText("");
        } else {
            selectAll();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        repaint();
        if(clearOnClick && !hasFocus() || getText().equals(initialText)){
            setText("");
        } else {
            if(hasFocus()){
            } else {
                if(highlightOnClick) selectAll();
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
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getForeground());
        g2d.setStroke(new BasicStroke(stroke, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundness, roundness);
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        setBackground(focusLostColor);
        if(getText().trim().equals("")) {
            if(numbersOnly) ((AbstractDocument)getDocument()).setDocumentFilter(null);
            setText(initialText);
            if(numbersOnly) ((AbstractDocument)getDocument()).setDocumentFilter(new NumberDocument());
        }
        
        if(getText().trim().equalsIgnoreCase(initialText)){
            setFont(getFont().deriveFont(unfocusedDefaultTextFontType));
        } else {
            setFont(getFont().deriveFont(unfocusedFontType));
        }
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
    
    public void setSelectOnClick(boolean select){
        highlightOnClick = select;
    }
    
    public void setUnfocusedFontType(int fontType){
        unfocusedFontType = fontType;
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
    
    public void setUnfocusedDefaultTextType(int type){
        unfocusedDefaultTextFontType = type;
    }
    
    public int getUnfocusedDefaultTextType(){
        return unfocusedDefaultTextFontType;
    }
    
    public boolean isPopulatedNoNull(){
        return getText() != null && !getText().equals("") && !getText().equals(initialText);
    }
    
    public boolean isPopulated(){
        return !getText().equals("") && !getText().equals(initialText);
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
