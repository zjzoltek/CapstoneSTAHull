/*
 * This class uses JPanel to assemble the componenets of the homescreen
 */
package capstoneal.GUI;

/**
 *
 * @author acleavitt0612
 * 04/06/2016
 * 
 */

import capstonezz.CapstoneConstants;
import capstonezz.GUI.NavigationButton;
import capstonezz.Linker;
import capstonezz.NavigationModel;
import capstonezz.Util;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class HomeScreen extends JPanel implements NavigationModel{
    private final NotificationBar notificationBar;
    
    private final NavigationButton backButton; // creates back button
    private final NavigationButton forwardButton; // creates forward button
    private final JButton newAddressButton; // creates New Address button
    private final JToolBar toolBar = new JToolBar();
    private final HomeScreenGUI hsGUI;
    
    public static final String LINK_NAME = "HOMESCREEN";
   
    public HomeScreen(int width, int height){
        setBackground(CapstoneConstants.PANEL_BG);
        notificationBar = new NotificationBar(); // create an instance of NotificationBar
        hsGUI = new HomeScreenGUI();
        setLayout(new BorderLayout()); // sets layout to border layout
        // add the components to the screen
        toolBar.setBorderPainted(false);
        toolBar.setLayout(new FlowLayout());
        
        //getting dimensions for buttons
        int screenWidth = Util.getScreenDimension().width;
        int screenHeight = Util.getScreenDimension().height;
        
        //creating back button
        backButton = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(screenWidth), 
        NavigationButton.getButtonHeight(screenHeight));
        
        //creating forward button
        forwardButton = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(screenWidth),
        NavigationButton.getButtonHeight(screenHeight)); 
        
        newAddressButton = new JButton(new ImageIcon(Util.scaledBuffered(Util.getImage(getClass().getResource("/newDoc.png")), backButton.getWidth(),
                backButton.getHeight())));
        
        newAddressButton.setContentAreaFilled(false);
        
        newAddressButton.addActionListener((ActionEvent e) -> {
           Linker.getLinker().createView("new" + String.valueOf(Math.random() * Math.random()));
        });
        
        toolBar.add(backButton);
        toolBar.add(newAddressButton);
        toolBar.add(forwardButton);
        
        add(toolBar, BorderLayout.NORTH);
        add(hsGUI, BorderLayout.CENTER);
        add(notificationBar, BorderLayout.SOUTH);
        //add(notificationBar, BorderLayout.SOUTH);
    } // end of constructor

    @Override
    public JButton getBackButton() {
        return backButton;
    }

    @Override
    public JButton getForwardButton() {
        return forwardButton;
    }

    @Override
    public Component getHomeButton() {
        return null;
    }
    
    public Search getSearch(){
        return hsGUI.getSearch();
    }
    
} // end of class
