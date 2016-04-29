package capstonezz.InspectionReport;

import java.awt.FlowLayout;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 15, 2016
 */

public class DateField extends JPanel {
    public static final int US = 1;
    public static final int EU = 2;
    
    private final char separator;
    
    private final JLabel label;
    private final JFormattedTextField dateField;
    
    public DateField(char separator, String label){
        super(new FlowLayout());
        this.separator = separator;
        this.label = new JLabel(" " + label);
        dateField = getDateField();
        init();
    }
    
    private void init(){
        add(dateField);
        add(label);
    }
    
    private JFormattedTextField getDateField(){
        JFormattedTextField toReturn = new JFormattedTextField();
        toReturn.setColumns(6);
        toReturn.setFocusLostBehavior(JFormattedTextField.PERSIST);
        toReturn.setFormatterFactory(new DefaultFormatterFactory(
        getMask("##" + separator + "##" + separator + "####"),
        getMask("##" + separator + "##" + separator + "####"),
        getMask("##" + separator + "##" + separator + "####")));
        
        return toReturn;
    }
    
    public Date getDate(int format){
        int firstSep;
        int lastSep;
        int day;
        int month;
        int year;
        String value;
        
        switch(format){
            case US:
                value = dateField.getText();
                firstSep = value.indexOf(separator);
                lastSep = value.lastIndexOf(separator);

                day = Integer.parseInt(value.substring(firstSep+1, lastSep));
                month = Integer.parseInt(value.substring(0, firstSep));
                year = Integer.parseInt(value.substring(lastSep+1));
                
                return new Date(year, month, day);
            case EU:
                value = dateField.getText();
                firstSep = value.indexOf(separator);
                lastSep = value.lastIndexOf(separator);

                day = Integer.parseInt(value.substring(firstSep+1, lastSep));
                month = Integer.parseInt(value.substring(0, firstSep));
                year = Integer.parseInt(value.substring(lastSep+1));
                
                return new Date(year, month, day);
            default:
                value = dateField.getText();
                firstSep = value.indexOf(separator);
                lastSep = value.lastIndexOf(separator);

                day = Integer.parseInt(value.substring(firstSep+1, lastSep));
                month = Integer.parseInt(value.substring(0, firstSep));
                year = Integer.parseInt(value.substring(lastSep+1));
                
                return new Date(year, month, day);
        }
        
    }
    private MaskFormatter getMask(String arg){
        try{
            return new MaskFormatter(arg);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }
}
