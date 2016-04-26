/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneca;

import capstoneal.InspectionReport.InspectionReport;
import capstonepb.EditPage;
import capstonezz.DisabledPanel;
import capstonezz.GUI.NavigationButton;
import capstonezz.NavigationModel;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;



/**
 *
 * @author ccallen0504
 */
public class ViewPage extends JPanel implements NavigationModel {
    private final int width;
    private final int height;
    private final JToolBar toolBar;

    private NavigationButton forward;
    private NavigationButton backward;
    private Home homeButton;
    private EditButton editButton;

    private String displayString = "";
    
    private final InspectionReport ir;
    private final EditPage editPage;
    
    public final DisabledPanel panel;
    
    public ViewPage(int width, int height, String display){
        this.width = width;
        this.height = height;
        toolBar = new JToolBar();
        displayString = display;
        ir = new InspectionReport();
        panel = new DisabledPanel(this);
        editPage = new EditPage(width, height, display, ir);
        init();
    }

    private void init(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        toolBar.setBorderPainted(true);
        toolBar.setLayout(new FlowLayout());

        forward = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        backward = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        homeButton = new Home(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        editButton = new EditButton(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        editButton.setBorderPainted(true);
        editButton.setFocusPainted(true);
        editButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        homeButton.setBorderPainted(true);
        homeButton.setFocusPainted(true);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        toolBar.setLayout(new FlowLayout());
        toolBar.add(backward);
        toolBar.add(homeButton);
        toolBar.add(forward);
        toolBar.add(editButton);

        add(toolBar);
        
        add(ir);
        
        DisabledPanel.disable(ir);
    }

    @Override
    public JButton getBackButton() {
        return backward;
    }

    @Override
    public JButton getForwardButton() {
        return forward;
    }

    @Override
    public JButton getHomeButton() {
        return homeButton;
    }

    public JButton getEditButton(){
        return editButton;
    }

    public void change(String string){
        displayString = string;
    }

    public String getString(){
        return displayString;
    }
    
    public InspectionReport getIR(){
        return ir;
    }
    
    public DisabledPanel getDisabledPanel(){
        return panel;
    }
    
    public EditPage getEditPage(){
        return editPage;
    }
}