/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;




/**
 *
 * @author pebledsoe1231
 */
public class EditPage extends JPanel
{
    int width;
    public EditPage(int width)
    {
        this.width = width;
    }
    
    /*@Override
    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.DARK_GRAY);
    g2d.fillRect(0,0,width,150);
    }*/
    
   /* public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
 
    public void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }}}*/
    
    
    public static void main(String[] args){
        JFrame frame1 = new JFrame();
        frame1.setLayout(new GridBagLayout());
         GridBagConstraints c = new GridBagConstraints();
    
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int width = (int)tk.getScreenSize().getWidth();
        int height = (int)tk.getScreenSize().getHeight();
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        EditPage page = new EditPage(width);
        frame1.add(page);
        
        
        frame1.setVisible(true);
        Buttons newContentPane = new Buttons();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame1.setContentPane(newContentPane);
        frame1.setSize(new Dimension(width, height));
        //g2d.fillRect(0,0,width, 150);
        Buttons buttons = new Buttons();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                buttons.createAndShowGUI(); 
            }
        });
        
   }
}
