/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;




/**
 *
 * @author pebledsoe1231
 */
public class EditPage extends JPanel
{
    private final int height;
    private final int width;
    
    private final JToolBar toolBar;
    
    private final JButton cancelButton = new EditPageButtons(EditPageButtons.ButtonType.CANCEL,
            Util.getScreenDimension().width, Util.getScreenDimension().height);
    
    private final JButton andButton = new EditPageButtons(EditPageButtons.ButtonType.AND,
            Util.getScreenDimension().width, Util.getScreenDimension().height);
     
    private final JButton saveButton = new EditPageButtons(EditPageButtons.ButtonType.SAVE,
            Util.getScreenDimension().width, Util.getScreenDimension().height);
    
    public EditPage(int width, int height)
    {
        this.width = width;
        this.height = height;
        
        toolBar = new JToolBar(JToolBar.HORIZONTAL);
        
        init();
    }
    
    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.GRAY.brighter());
        toolBar.setLayout(new FlowLayout());
        toolBar.setBorderPainted(false);
        toolBar.add(cancelButton);
        toolBar.add(andButton);
        toolBar.add(saveButton);
        
        add(toolBar);
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        EditPage page = new EditPage(Util.getScreenDimension().width, Util.getScreenDimension().height);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(page);
        
        frame.setVisible(true);
        
        frame.requestFocus();
        
        
        
    }
}
