/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.dobson.ch.pkg19.searching;

import java.security.SecureRandom;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author awdobson1129
 */
public class AndrewDobsonCH19Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a scanner
        SecureRandom generator = new SecureRandom(); // create a random number generator
        int[] data = new int[15]; // create an array that holds 15 numbers
        for (int i = 0; i < data.length; i++) // for loop
            data[i] = 10 + generator.nextInt(90); // populate the array
        
        Arrays.sort(data); // soe the array
        System.out.printf("%s%n%n", Arrays.toString(data)); // print the array
        
        int searchInt = Integer.parseInt(JOptionPane.showInputDialog(String.format("Please enter an integer value (-1 to quit)"))); // ask for input 
 
        
        while(searchInt != -1) // while not -1
        {
            int location = binarySearch(data, searchInt); //serarch the array for the input
            
            if (location == -1) // if not found
                System.out.printf("%d was not found.%n%n", searchInt); // print that it was not found
            else //else
                System.out.printf("%d was found in posistion %d%n%n", searchInt, location); // print input and location
            
            searchInt = Integer.parseInt(JOptionPane.showInputDialog(String.format("Please enter an integer value (-1 to quit)"))); // ask for new input
        }
    }
}
