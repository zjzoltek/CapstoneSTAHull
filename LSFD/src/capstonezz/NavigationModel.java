package capstonezz;

import java.awt.Component;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 12, 2016
 */

public interface NavigationModel {
    public Component getBackButton();
    public Component getForwardButton();
    public Component getHomeButton();
}
