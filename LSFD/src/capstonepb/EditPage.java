/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;
import capstoneal.InspectionReport.InspectionReport;
import capstonezz.DisabledPanel;
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

    public final JButton cancelButton;

    public final JButton andButton;

    public final JButton saveButton;
    private final String display;
    private final InspectionReport ir;
    
    public EditPage(int width, int height, String display, InspectionReport ir)
    {
        this.display = display;
        this.width = width;
        this.height = height;

        toolBar = new JToolBar(JToolBar.HORIZONTAL);

        cancelButton = new EditPageButtons(EditPageButtons.ButtonType.CANCEL,
            width, height);

        andButton = new EditPageButtons(EditPageButtons.ButtonType.AND,
            width, height);

        saveButton = new EditPageButtons(EditPageButtons.ButtonType.SAVE,
            width, height);
        
        this.ir = ir;
    }

    public void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.GRAY.brighter());
        toolBar.setLayout(new FlowLayout());
        toolBar.setBorderPainted(false);
        toolBar.add(cancelButton);
        toolBar.add(andButton);
        toolBar.add(saveButton);

        add(toolBar);
        add(ir);
        
        DisabledPanel.enable(ir);
    }

}