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
 * @since Apr 15, 2016
 */

public class DateField extends JFormattedTextField {
    private final char separator;
    
    public DateField(char separator){
        super();
        this.separator = separator;
        init();
    }
    
    private void init(){
        setFormatterFactory(new DefaultFormatterFactory(
        getMask("##" + separator + "##" + separator + "####"),
        getMask("##" + separator + "##" + separator + "####"),
        getMask("##" + separator + "##" + separator + "####")));
    
    }
    
    private MaskFormatter getMask(String arg){
        try{
            return new MaskFormatter(arg);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }
}
