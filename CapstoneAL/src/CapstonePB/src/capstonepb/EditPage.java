/*
 * Program for edit page, creates toolbar, implements buttons, will allow editing of documents
 * Phillip Bledsoe
 * 041216
 */
//package for program
package capstonepb;


//imports
import java.awt.Color;//used to set color of buttons
//layouts
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;//import for buttons
import javax.swing.JFrame;//import for frame
import javax.swing.JPanel;
import javax.swing.JToolBar;//import for toolbar




public class EditPage extends JPanel
{
    private final int height;//height of pane
    private final int width;//width of pane
    
    private final JToolBar toolBar;//setting a toolbar
    
    private final JButton cancelButton = new EditPageButtons(EditPageButtons.ButtonType.CANCEL,
            Util.getScreenDimension().width, Util.getScreenDimension().height);//creates an instance of the cancel button
    
    private final JButton andButton = new EditPageButtons(EditPageButtons.ButtonType.AND,
            Util.getScreenDimension().width, Util.getScreenDimension().height);//creates an instance of the save and exit button
     
    private final JButton saveButton = new EditPageButtons(EditPageButtons.ButtonType.SAVE,
            Util.getScreenDimension().width, Util.getScreenDimension().height);//creates an instance of the save button
    
    public EditPage(int width, int height)//constructor method
    {
        this.width = width;//set width to the value used as parameter for constructor
        this.height = height;//set height to the value used as parameter for constructor
        
        toolBar = new JToolBar(JToolBar.HORIZONTAL);//create instance of toolbar as horizontal
        
        init();//call init method to set up toolbar
    }
    
    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//set toolbar horizontal
        setBackground(Color.GRAY.brighter());//sets color of toolbar
        toolBar.setLayout(new FlowLayout());//sets toolbar as flowlayout
        toolBar.setBorderPainted(false);//sets borderd paint off
        toolBar.add(cancelButton);//adds cancel button
        toolBar.add(andButton);//adds save and exit buttons
        toolBar.add(saveButton);//adds save button
        
        add(toolBar);//add the toolbar
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();//creates new frame for stuff to go on
        EditPage page = new EditPage(Util.getScreenDimension().width, 
                Util.getScreenDimension().height);
        //calls constructor with width and height of the screen demensions
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //default screen to exit the program when closed
        
        frame.setSize(Util.getScreenDimension());
        //set frame to screen demension
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //set frame to max size of screen
        frame.setContentPane(page);
        //add edit page constuctor to the pane
        frame.setVisible(true);
        //frame is visible
        frame.requestFocus();
        
        
        
    }
}
