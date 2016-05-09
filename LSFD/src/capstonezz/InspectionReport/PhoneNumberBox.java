package capstonezz.InspectionReport;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
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
        getMask("### ### ####"),
        getMask("### ### ####"),
        getMask("### ### ####")));
    }
    
    private MaskFormatter getMask(String arg){
        try{
            return new MaskFormatter(arg);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }

}
