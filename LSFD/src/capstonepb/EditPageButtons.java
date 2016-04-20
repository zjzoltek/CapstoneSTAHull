/*
 * creates buttons save, save and exit, and cancel
 * Phillip Bledsoe
 * 041216
 */
package capstonepb;



//expensive imports
import java.awt.Cursor; //import for cursor
import javax.swing.AbstractButton; //import for abstract buttons
import javax.swing.JButton;  //import for buttons
import javax.swing.ImageIcon; //import for icons
//random gap in imports idk why
import java.awt.event.KeyEvent; //import for event hadlers


public class EditPageButtons extends JButton {
    //enum for which button is being created
    public static enum ButtonType { SAVE, CANCEL, AND }
    
    private final int realWidth;
    private final int realHeight;
    
    public EditPageButtons(ButtonType type, int width, int height){
        super();//calls the super class of JButton
        realWidth = width; //sets realWidth to width parameter
        realHeight = height; //sets realHeight to height parameter
        init(type, width, height); //calls init method with type, width, and height parameters as parameters
    }
    
    //init method
    private void init(ButtonType type, int width, int height) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setSize(width, height); //sets button size to width and height parameters
        setContentAreaFilled(false); //unfills buttons (I don't like this but whatever)
        
        //switch statement for which button is needed
        switch(type){
            case SAVE: //save button case
                ImageIcon saveIcon = createImageIcon("/save-icon.png"); //floppy save icon
                setText("Save"); //set text save on button
                setIcon(saveIcon); //set save icon on button
                setVerticalTextPosition(AbstractButton.CENTER); //center text vertically
                setHorizontalTextPosition(AbstractButton.LEADING); //left alighn text
                setMnemonic(KeyEvent.VK_S); //mnemonic key S
                break; //end save button case
            case AND: //save and exit button case
                ImageIcon andIcon = createImageIcon("/&icon1.png");//ampersand icon
                setText("Save and Exit");//set save and exit text on button
                setIcon(andIcon); //set & icon on button
                setVerticalTextPosition(AbstractButton.CENTER); //center text vertically
                setHorizontalTextPosition(AbstractButton.LEADING); //left align text
                setMnemonic(KeyEvent.VK_X); //mnemonic key X
                break; //end save and exit button case
            case CANCEL: //cancel button case
                ImageIcon cancelIcon = createImageIcon("/cancel-icon.png"); //red X cancel icon
                setText("Cancel"); //set text cancel on button
                setIcon(cancelIcon);  //set cancel icon on button
                setMnemonic(KeyEvent.VK_C); //mnemonic key C
                break; //end cancel button case
        }
    }
    //error halding for image icon being found
    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
