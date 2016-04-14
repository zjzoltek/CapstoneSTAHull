/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.dobson.sorting.ch.pkg19;

/**
 *
 * @author awdobson1129
 */
import java.security.SecureRandom;
import java.util.Arrays;
/**
 *
 * @author awdobson1129
 */
public class insertionSorting{

    public static void insertionSort(int[] data)
    {
        
        for (int next = 1; next < data.length; next++) // create for loop to run threw the array
        {
            int insert = data[next]; // get the varriable in the array
            int moveItem = next; // set moveItem equal to next 
             
            while(moveItem > 0 && data[moveItem -1] > insert) // while in the for loop and running threw the array
            {
                data[moveItem] = data[moveItem - 1]; // move the pointer one spot to the left
                moveItem--;// decrement moveItem to eventually exit the while loop
            }
             
            data[moveItem] = insert; // put the number in its place
            printPass(data, next, moveItem); // call printPass
        }
    }
    
    public static void printPass(int[] data, int pass, int index)
    {
        System.out.printf("after pass %2d: ", pass); // print out after pass
     
        for (int i = 0; i < index; i++) // for loop print out what line it is
            System.out.printf("%d ", data[i]); // print out the array 
        System.out.printf("%d*", data[index]); // print out the pointer
        
        for (int i = index + 1; i < data.length; i++) // for loop to print rest of array
            System.out.printf("%d ", data[i]); // print out the rest of the array
        
        System.out.printf("%n               "); // print out a new line and spaces to under line the proper integer in the array
        
        for (int i = 0; i <= pass; i++) // for loop to print under line
            System.out.print("-- "); // print under line
        System.out.println(); // create a new line
        
        System.out.printf("There was %d passes made %n", pass); // print number of passes
    }
}
