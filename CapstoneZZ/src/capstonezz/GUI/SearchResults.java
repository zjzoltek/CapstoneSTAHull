package capstonezz.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 9, 2016
 */

public class SearchResults extends JPanel {
    private final int width;
    private final int height;
    public static final int RESULTS_PER_PAGE = 5;
    private final ArrayList<ResultElement> results;
    
    public SearchResults(Color color, int parentWidth, int parentHeight){
        width = parentWidth;
        height = parentHeight;
        results = new ArrayList<>();
        init(color);
    }
    
    private void init(Color color){
        setBackground(color);
        setSize(new Dimension(getWidth() / 4, getHeight() / 4));
        setLayout(new GridBagLayout());
    }

    
    public void addResults(ResultElement...args){
        GridBagConstraints c;
        
        for(int i = 0; i < args.length; i++){
            results.add(args[i]);
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = i;
            c.anchor = GridBagConstraints.NORTHWEST;
            c.weightx = 1;
            c.weighty = (float)(1f / args.length);
            add(args[i], c);
        }
    }
    
    public void addResults(ArrayList<ResultElement> args){
        GridBagConstraints c;
         
        for(int i = 0; i < args.size(); i++){
            results.add(args.get(i));
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = i;
            c.anchor = GridBagConstraints.NORTHWEST;
            c.weightx = 1;
            c.weighty = (float)(1f / args.size());
            add(args.get(i), c);
        }
    }
    
    public void addResult(ResultElement arg){
        GridBagConstraints c = new GridBagConstraints();
         
        c.gridx = 0;
        c.gridy = results.size();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 1;
        c.weighty = (float)(1f / results.size());
        results.add(arg);
        add(arg, c);
    }
    
    public void clearResults(){
        results.clear();
    }
    
}
