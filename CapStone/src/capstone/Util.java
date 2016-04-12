/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author ccallen0504
 */
public class Util {
        
    public static BufferedImage getImage(String subFolder, String nameWithExtension)
    {
        try {
            if(subFolder != null)
                return(ImageIO.read(new File("/" + subFolder + "/" + nameWithExtension)));
            else
                return(ImageIO.read(new File("/" + nameWithExtension)));
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static BufferedImage getImage(URL url){
        try {
            return(ImageIO.read(url));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static BufferedImage scaledBuffered(BufferedImage arg, double scale)
    {
        Image toConvert = arg.getScaledInstance(
                    (int)(arg.getWidth() * scale), 
                    (int)(arg.getHeight() * scale), Image.SCALE_DEFAULT);
            
        BufferedImage toReturn = new BufferedImage(toConvert.getWidth(null),
        toConvert.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics g = toReturn.getGraphics();
        g.drawImage(toConvert, 0, 0, null);
        g.dispose();

        return toReturn;
    }
    
    public static BufferedImage scaledBuffered(BufferedImage arg, int width, int height){
        Image toConvert = arg.getScaledInstance(
                    width, height, Image.SCALE_SMOOTH);
         
        BufferedImage toReturn = new BufferedImage(toConvert.getWidth(null),
        toConvert.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics g = toReturn.getGraphics();
        g.drawImage(toConvert, 0, 0, null);
        g.dispose();

        return toReturn;
    }
    
    public static Dimension getScreenDimension(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int screenWidth = tk.getScreenSize().width;
        int screenHeight = tk.getScreenSize().height;
        return new Dimension(screenWidth, screenHeight);
        
    }
    
    
}
