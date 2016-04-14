/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.dobson.ch.pkg19.searching;

import javax.swing.JOptionPane;

/**
 *
 * @author awdobson1129
 */
public class Searching
{
public static int binarySearch(int[] data, int key)
    {
        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value -1 if not found
        int searchCounter = 0; // counter for number of iterations
        
        do // loop for search elements 
        {
            System.out.print(remainingElements(data, low, high)); // print array
            for(int i = 0; i < middle; i++) // for loop
                System.out.print("   "); // move to the middle
            System.out.print(" * "); // place the star in the middle where you compare your input to the array
            if ( key == data[middle]){ // checks if the key is the middle element
                location = middle; // sets location to the middle element
            } // end of if statement
            else if(key < data[middle]){ // checks if the key is less than the middle element
                high = middle - 1; // reduces searched area to less than middle
            } // end of else if statement
            else  
                low = middle + 1; // searches above the middle
            
            middle = (low + high + 1) / 2; // creates new middle value
            
            searchCounter++; // increments counter
        } while ((low <= high) && (location == -1)); // checks if search area is still valid
        // end of do while loop
        
        
        /**/JOptionPane.showMessageDialog(null, String.format("Iterations before found: %d%n", searchCounter)); // outputs iterations
        return location;
    }
 
       
    private static String remainingElements(int[] data, int low, int high)
    {
        StringBuilder temporary = new StringBuilder(); // create a temporarry array to change when printing
        
        for(int i = 0; i < low; i++)
            temporary.append("   "); // cover up the part of the array that you dont need to search
        
        for(int i = low; i < high; i++)
            temporary.append(" " + data[i]); //print array
        
        return String.format("%s%n", temporary); // pprint the appended array
    }
}