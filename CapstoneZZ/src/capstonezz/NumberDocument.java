package capstonezz;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 10, 2016
 */

public class NumberDocument extends DocumentFilter{
    @Override
    public void insertString(DocumentFilter.FilterBypass fp,
            int offset, String string, AttributeSet aset) 
    {
        int len = string.length();
        boolean isValid = true;
        
        for(int i = 0; i < len; i++){
            if(!Character.isDigit(string.charAt(i))){
                isValid = false;
                break;
            }
        }
        
        if(isValid){
            try {
                super.insertString(fp, offset, string, aset);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    @Override
    public void replace(DocumentFilter.FilterBypass fp,
            int offset, int length, String string, AttributeSet aset) 
    {
        int len = string.length();
        boolean isValid = true;
        
        for(int i = 0; i < len; i++){
            if(!Character.isDigit(string.charAt(i))){
                isValid = false;
                break;
            }
        }
        
        if(isValid){
            try {
                super.replace(fp, offset, length, string, aset);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
