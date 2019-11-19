// From Building Java Programs 4th Edition
// Chapter 7, Exercise 4
// Solution by Hiro Egashira on 11/17/2019

// Write a static method named isSorted that accepts an array of doubles as a parameter and
// returns true if the list is sorted in an increasing order and false otherwise.

package chapter7;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// Write a static method named isSorted that accepts an array of doubles as a parameter and
		// returns true if the list is sorted in an increasing order and false otherwise.
		
		double[] data1 = {16.1, 12.3, 22.2, 14.4};
		double[] data2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] data3 = {42.0};
		double[] data4 = {42.0, 27.0};
		double[] data5 = {1.5, 4.3, 7.0, 19.5, 7.8};
		
		
		if (isSorted(data1) == true) {
			System.out.println(Arrays.toString(data1) + " is sorted.");
		}	
		else {
			System.out.println(Arrays.toString(data1) + " is NOT sorted.");
		}
	
		if (isSorted(data2) == true) {
			System.out.println(Arrays.toString(data2) + " is sorted.");
		}	
		else {
			System.out.println(Arrays.toString(data2) + " is NOT sorted.");
		}
		
		if (isSorted(data3) == true) {
			System.out.println(Arrays.toString(data3) + " is sorted.");
		}	
		else {
			System.out.println(Arrays.toString(data3) + " is NOT sorted.");
		}
		
		if (isSorted(data4) == true) {
			System.out.println(Arrays.toString(data4) + " is sorted.");
		}	
		else {
			System.out.println(Arrays.toString(data4) + " is NOT sorted.");
		}
		
		if (isSorted(data5) == true) {
			System.out.println(Arrays.toString(data5) + " is sorted.");
		}	
		else {
			System.out.println(Arrays.toString(data5) + " is NOT sorted.");
		}
	}
	
	public static boolean isSorted(double[] newArr) {
		for (int i = 0; i < newArr.length - 1; i++) {
			if (newArr[i] > newArr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
