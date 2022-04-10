/**
 * 
 */
package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.currdeno.NoteCount;
import com.greatlearning.currdeno.QuickSort;

/**
 * @author aravind
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			
			System.out.println("\n Enter the size of currency denominations: ");
			
			int size = scn.nextInt(); // get the Array size
			int notes[] = new int[size]; // set the array size
			
			System.out.println("\n Enter the currency denominations value: ");
			
			for(int i=0; i<size; i++) {
				
				notes[i] = scn.nextInt(); // set the elements to its position one by one
			}
			
			System.out.println("\n Enter the amount you want to pay: ");
			
			int amt = scn.nextInt(); // get amount
			
			
			QuickSort quickSort = new QuickSort();
			quickSort.quickSort(notes, 0, notes.length-1); // perform sorting the array
			
			NoteCount noteCount = new NoteCount();
			noteCount.noteCounterImplementation(notes, amt); // get count and print the output
			
		}
		
		
		
	}

}
