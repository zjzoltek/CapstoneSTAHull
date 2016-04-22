package capstonezz.InspectionReport;

import capstonezz.Util;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 16, 2016
 */

public class PhoneNumberBox extends JFormattedTextField {
    
    public PhoneNumberBox(int columns){
        super();
        init(columns);
    }
    
    private void init(int columns){
        setColumns(columns);
        setFocusLostBehavior(JFormattedTextField.PERSIST);
        setFormatterFactory(new DefaultFormatterFactory(
        getMask("(###)-###-####"),
        getMask("(###)-###-####"),
        getMask("### ### ####")));
    }
    
    private MaskFormatter getMask(String arg){
        try{
            return new MaskFormatter(arg);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args){
           JFrame frame = new JFrame();
           EmergencyContact date = new EmergencyContact("Name", "Contact Type", "Number", "Type of Phone");
           frame.add(date);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           frame.setSize(Util.getScreenDimension());
           frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

           frame.setVisible(true);
    }
}
