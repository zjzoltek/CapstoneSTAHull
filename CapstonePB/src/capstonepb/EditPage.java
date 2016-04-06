/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;



/**
 *
 * @author pebledsoe1231
 */
public class EditPage extends JComponent
{
    int width1;
    public void editPage (int width)
    {
        width1 = width;
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(0,0,width1,500);//width1);
    }
}
