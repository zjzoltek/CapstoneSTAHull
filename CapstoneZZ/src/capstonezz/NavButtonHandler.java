package capstonezz;

import capstonezz.GUI.NavigationButton;
import java.util.ArrayList;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 12, 2016
 */

public class NavButtonHandler {
    public final ArrayList<NavigationButton> navigationButtons;
    
    public NavButtonHandler(){
        navigationButtons = new ArrayList<>();
    }
    
    public void addButton(NavigationButton button){
        navigationButtons.add(button);
    }
    
    public void setButtonsEnabled(boolean onOff){
        navigationButtons.forEach((b) -> {
            b.setEnabled(onOff);
        });
    }

}
