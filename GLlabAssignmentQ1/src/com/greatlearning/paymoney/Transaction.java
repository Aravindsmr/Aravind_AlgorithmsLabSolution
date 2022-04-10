/**
 * 
 */
package com.greatlearning.paymoney;

import java.util.Scanner;

/**
 * @author aravind
 *
 */
public class Transaction {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {

			System.out.println("\n Please enter the size of transaction array: ");

			int size = scn.nextInt(); // get size of the array
			int arr[] = new int[size]; // set size of the array

			System.out.println("\n Please enter the value of array: ");

			int i;

			// apply elements into the array
			for (i = 0; i < size; i++) {
				arr[i] = scn.nextInt();
			}

			System.out.println("\n Enter the total number of targets that need to be achieved: ");

			int trgtNo = scn.nextInt(); // get the size of target

			while (trgtNo-- != 0) {

				int flag = 0;
				int trgtVal;
				int sum = 0;

				System.out.println("\n Enter the value of target: ");

				trgtVal = scn.nextInt(); // get the target value

				for (i = 0; i < size; i++) { // perform condition to check if target achieved

					sum += arr[i];

					if (sum >= trgtVal) {

						System.out.println("\n Target achieved after: " + (i + 1) + " transactions"); // print the
																										// position to
																										// the console
						flag = 1;
						break;

					}

				}

				if (flag == 0) {

					System.out.println("\n Given target is not achieved");
				}
			}

		}

	}

}
