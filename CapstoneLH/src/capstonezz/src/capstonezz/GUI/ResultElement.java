package capstonezz.GUI;

import capstonezz.Util;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 9, 2016
 */

public class ResultElement extends JTextPane implements MouseListener, ActionListener, FocusListener  {
    private final String title;
    private final String subtitle;
    
    private Color standardColor = Color.BLACK;
    private Color hoverColor = Color.BLUE;
    private Color activeColor = Color.BLACK;
    private final Color transparent = new Color(0,0,0,0);
    
    private boolean underlineVisible = true;
    
    private Border activeBorder;
    private Border hoverBorder;
    private Border standardBorder;
    
    public ResultElement(String title, String subtitle, Color background, Color foreground){
        this.title = title.toUpperCase();
        this.subtitle = subtitle;
        init(background, foreground);
    }
    public ResultElement(String title, String subtitle, Color background){
        this.title = title.toUpperCase();
        this.subtitle = subtitle;
        init(background);
    }
    
    private void init(Color bg, Color fg){
        addMouseListener(this);
        addFocusListener(this);
        
        if (underlineVisible) {
            activeBorder = new MatteBorder(0,0,1,0,activeColor);
            hoverBorder = new MatteBorder(0,0,1,0,hoverColor);
            standardBorder = new MatteBorder(0,0,1,0,transparent);
        } else {
            activeBorder = new MatteBorder(0,0,0,0,activeColor);
            hoverBorder = new MatteBorder(0,0,0,0,hoverColor);
            standardBorder = new MatteBorder(0,0,0,0,transparent);
        }
        
        int deltaFont = Util.getScreenDimension().width / 24 
                - Util.getScreenDimension().height / 20;
        
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setFont(getFont().deriveFont(Font.BOLD, (float)deltaFont));
        setBorder(standardBorder);
        setSelectedTextColor(Color.BLUE);
        setBackground(bg);
        setForeground(fg);
        setEditable(false);
        setText(String.format("%s%n", title));
        
        appendSubtitle(subtitle);
    }
    
    private void init(Color bg){
        addMouseListener(this);
        addFocusListener(this);
        
        if (underlineVisible) {
            activeBorder = new MatteBorder(0,0,1,0,activeColor);
            hoverBorder = new MatteBorder(0,0,1,0,hoverColor);
            standardBorder = new MatteBorder(0,0,1,0,transparent);
        } else {
            activeBorder = new MatteBorder(0,0,0,0,activeColor);
            hoverBorder = new MatteBorder(0,0,0,0,hoverColor);
            standardBorder = new MatteBorder(0,0,0,0,transparent);
        }
        
        int deltaFont = Util.getScreenDimension().width / 24 
                - Util.getScreenDimension().height / 20;
        
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setFont(getFont().deriveFont(Font.BOLD, (float)deltaFont));
        setBorder(standardBorder);
        setSelectedTextColor(Color.BLUE);
        setBackground(bg);
        setForeground(standardColor);
        setEditable(false);
        setText(String.format("%s%n", title));
        
        appendSubtitle(subtitle);
    }
    
    public void appendSubtitle(String msg, Color color){
        StyleContext sc = StyleContext.getDefaultStyleContext();
        
        AttributeSet asset = sc.addAttribute(SimpleAttributeSet.EMPTY, 
                StyleConstants.FontFamily, getFont().getFamily());
        
        
        asset = sc.addAttribute(asset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        asset = sc.addAttribute(asset, 
                StyleConstants.FontSize,
                getFont().getSize() / 2 + (getFont().getSize() / 3));
        
        asset = sc.addAttribute(asset, StyleConstants.Bold, false);
        asset = sc.addAttribute(asset, StyleConstants.Foreground, color);
        
        int len = getDocument().getLength();
        setCaretPosition(len);
        setCharacterAttributes(asset, false);
        StyledDocument doc = getStyledDocument();
        
        int offset = doc.getLength();
        
        try {
            doc.insertString(offset, msg, asset);
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void appendSubtitle(String msg){
        StyleContext sc = StyleContext.getDefaultStyleContext();
        
        AttributeSet asset = sc.addAttribute(SimpleAttributeSet.EMPTY, 
                StyleConstants.FontFamily, getFont().getFamily());
        
        
        asset = sc.addAttribute(asset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        asset = sc.addAttribute(asset, 
                StyleConstants.FontSize,
                getFont().getSize() / 2 + (getFont().getSize() / 3));
        
        asset = sc.addAttribute(asset, StyleConstants.Bold, false);
        
        int len = getDocument().getLength();
        setCaretPosition(len);
        setCharacterAttributes(asset, false);
        StyledDocument doc = getStyledDocument();
        
        int offset = doc.getLength();
        
        try {
            doc.insertString(offset, msg, asset);
        } catch (BadLocationException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void setActiveColor(Color active) {
        activeColor = active;
    }

    public void setHoverColor(Color hover) {
        hoverColor = hover;
    }

    public void setStandardColor(Color standard) {
        standardColor = standard;
    }

    public void setUnderlineVisible(boolean underlineVisible) {
        this.underlineVisible = underlineVisible;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBorder(standardBorder);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBorder(hoverBorder);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(hoverColor);
        setBorder(hoverBorder);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(standardColor);
        setBorder(standardBorder);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBorder(activeBorder);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        setForeground(standardColor);
        setBorder(standardBorder);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        setForeground(hoverColor);
        //setBorder(hoverBorder);
    }
    
}
