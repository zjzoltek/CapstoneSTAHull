/**
 * NumberedFieldTest:
 * @author Lucas Hall
 * @version Apr 18, 2016
 */

package capstonelh;

import javax.swing.JFrame;


public class NumberedFieldTest 
{
    static final int ARRAY_SIZE = 1;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        NumberedField[] fields = new NumberedField[ARRAY_SIZE];
        
        for(int i = 0; i < ARRAY_SIZE; i++)
        {
            fields[i] = new NumberedField(i+1);
            frame.add(fields[i]);
        }
        
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

}
