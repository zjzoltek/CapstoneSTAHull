/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.dobson.sorting.ch.pkg19;

import static andrew.dobson.sorting.ch.pkg19.insertionSorting.insertionSort;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author awdobson1129
 */
public class AndrewDobsonSortingCH19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom(); // create random number generator
        
        int data [] = new int[15]; // create an array of fifteen spaces
        for (int i = 0; i < data.length; i++) // run threw the array
            data[i] = 10 + generator.nextInt(90); // give it a random number in each space from 0 to 90 and add ten to it
        
        System.out.printf("Unsorted array: %n%s%n%n", Arrays.toString(data)); // print the unsorted array
        insertionSort(data);// call insertion sort
        System.out.printf("Sorted array: %n%s%n%n", Arrays.toString(data)); // print the sorted array
    }
}

