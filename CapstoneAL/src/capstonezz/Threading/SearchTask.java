package capstonezz.Threading;

import capstonezz.GUI.GUI;
import capstonezz.GUI.ResultElement;
import capstonezz.GUI.SearchResults;
import capstonezz.SearchTestTool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 10, 2016
 */

public class SearchTask implements Runnable {
    private final SearchResults searchresults;
    private final String address;
    private final String number;
    private final boolean caseSensitive;
    private final GUI gui;
    private final ExecutorService pool;
    
    public SearchTask(SearchResults searchresults, GUI gui, String address, String number, boolean caseSensitive){
        this.searchresults = searchresults;
        this.address = address;
        this.number = number;
        this.caseSensitive = caseSensitive;
        this.gui = gui;
        pool = Executors.newSingleThreadExecutor();
        pool.execute(this);
    }
    
    @Override
    public void run() {
        searchresults.removeAll();
        searchresults.clearResults();
        searchresults.validate();
        
        
        SearchTestTool test = new SearchTestTool();
        
        String addressText = address.toLowerCase();
        String numberText = number;
        
        String name;
        String address;
        String age;
        
        if("".equals(numberText) && "".equals(addressText)){}
        else if(!"".equals(addressText) && (numberText.equals("") || numberText.equalsIgnoreCase("number"))){
            HashMap<Integer, ArrayList<Object>> results = test.getPerson(addressText, caseSensitive);
            if(results == null){
                searchresults.addResults(
                        new ResultElement(
                                "No results found in the database", "Sorry :(", 
                                searchresults.getBackground()));
            } else {
                ArrayList<ResultElement> elements = new ArrayList<>();
                
                for(int i = 0; i < results.size(); i++){
                    name = (String)results.get(i).get(0);
                    age = String.valueOf(results.get(i).get(1));
                    address = (String)results.get(i).get(2);
                    elements.add(new ResultElement(name,
                    String.format("%s YRS OLD | %s", age, address), searchresults.getBackground()));
                }
                searchresults.addResults(elements);
            }
        } else if(
                (!"".equals(numberText) && !numberText.equalsIgnoreCase("number")) 
                && !"".equals(addressText)){
            
            HashMap<Integer, ArrayList<Object>> results = test.getPerson(addressText, Integer.parseInt(numberText));
            
            if(results == null){
                searchresults.addResults(
                        new ResultElement(
                                "No results found in the database", "Sorry :(", 
                                searchresults.getBackground()));
                
            } else {
                ArrayList<ResultElement> elements = new ArrayList<>();
                
                for(int i = 0; i < results.size(); i++){
                    name = (String)results.get(i).get(0);
                    age = String.valueOf(results.get(i).get(1));
                    address = (String)results.get(i).get(2);
                    elements.add(new ResultElement(name,
                    String.format("%s YRS OLD | %s", age, address), searchresults.getBackground()));
                }
                searchresults.addResults(elements);
            }
        }
        gui.displayLoadingBar(false);
        searchresults.revalidate();
    }
}

