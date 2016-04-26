package capstonezz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 10, 2016
 */

public class SearchTestTool {
   public final ArrayList<String> addresses;
   public final ArrayList<String> names;
   public final ArrayList<Integer> ages;
   
   public SearchTestTool(){
       addresses = new ArrayList<>();
       names = new ArrayList<>();
       ages = new ArrayList<>();
       init();
   }
   
   private void init(){
       BufferedReader reader;
       
       String ageFilePath = "/SearchTest/Ages.txt";
       String addressFilePath = "/SearchTest/Addresses.txt";
       String nameFilePath = "/SearchTest/Names.txt";
       
       try {
            reader = new BufferedReader(
                   new InputStreamReader((getClass().getResourceAsStream(ageFilePath))));
           
            reader.lines().forEach(l -> {
               ages.add(new Integer(l));
            });
           
            reader = new BufferedReader(new InputStreamReader((getClass().getResourceAsStream(addressFilePath))));
           
            while(reader.readLine() != null){
                String first = reader.readLine();
                String second = reader.readLine();
                
                if(first == null || second == null)
                    break;
                
                addresses.add(second.concat(", " + first));
            }

           
            reader = new BufferedReader(new InputStreamReader((getClass().getResourceAsStream(nameFilePath))));
           
            reader.lines().forEach(l -> {
               l = l.trim();
               names.add(l);
            });
           
            reader.close();
       } catch(IOException ex){
           throw new RuntimeException(ex);
       }
   }
   
   
    public HashMap<Integer, ArrayList<Object>> getPerson(String name, boolean caseSensitive){
        ArrayList<Integer> indices = new ArrayList<>();
        
        boolean oneMatch = false;
        int caught = 0;
        Pattern p;
        
        if(!caseSensitive) p = Pattern.compile(name + ".*", Pattern.CASE_INSENSITIVE);
        else p = Pattern.compile(name + ".*");

        for(int i = 0; i < names.size(); i++){
            if(p.matcher(names.get(i)).matches()){
                oneMatch = true;
                indices.add(i);
                caught++;
            }
        }

        if(!oneMatch){
            return null;
        }
       
        HashMap<Integer, ArrayList<Object>> toReturn = new HashMap<>();
        
        for(int i = 0; i < caught; i++){
            ArrayList<Object> list = new ArrayList<>();
            list.add(names.get(indices.get(i)));
            list.add(ages.get(indices.get(i)));
            list.add(addresses.get(indices.get(i)));
            
            toReturn.put(i, list);
        }
        
        return toReturn;
    }
    
    public HashMap<Integer, ArrayList<Object>> getPerson(String name, int age){
        ArrayList<Integer> indices = new ArrayList<>();
        
        boolean oneMatch = false;
        int caught = 0;
        Pattern p = Pattern.compile(name + ".*", Pattern.CASE_INSENSITIVE);

        for(int i = 0; i < names.size(); i++){
            if(p.matcher(names.get(i)).matches()){
               if(ages.get(i) == age){
                    oneMatch = true;
                    indices.add(i);
                    caught++;
               }
            }
        }

        if(!oneMatch){
            return null;
        }
       
        HashMap<Integer, ArrayList<Object>> toReturn = new HashMap<>();
        
        for(int i = 0; i < caught; i++){
            ArrayList<Object> list = new ArrayList<>();
            list.add(names.get(indices.get(i)));
            list.add(ages.get(indices.get(i)));
            list.add(addresses.get(indices.get(i)));
            
            toReturn.put(i, list);
        }
        
        return toReturn;
    }

}
