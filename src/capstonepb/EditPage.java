/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;
import capstonezz.GUI.NavigationButton;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
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

    private final JButton cancelButton;

    private final JButton andButton;

    private final JButton saveButton;
    
    public EditPage(int width, int height, String display)
    {
        this.width = width;
        this.height = height;

        toolBar = new JToolBar(JToolBar.HORIZONTAL);

        cancelButton = new EditPageButtons(EditPageButtons.ButtonType.CANCEL,
            NavigationButton.getButtonWidth(width), NavigationButton.getButtonHeight(height));

        andButton = new EditPageButtons(EditPageButtons.ButtonType.AND,
            NavigationButton.getButtonWidth(width), NavigationButton.getButtonHeight(height));

        saveButton = new EditPageButtons(EditPageButtons.ButtonType.SAVE,
            NavigationButton.getButtonWidth(width), NavigationButton.getButtonHeight(height));
        
        
        init();
    }
    
    public JButton getCancelButton(){
        return cancelButton;
    }
    
    public JButton getAndButton(){
        return andButton;
    }
    
    public JButton getSaveButton(){
        return saveButton;
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
    
    
}