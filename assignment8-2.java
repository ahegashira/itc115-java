// From Building Java Programs 4th Edition
// Chapter 7, Exercise 11
// Solution by Hiro Egashira on 11/17/2019


// Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean
// value indicating whether or not the values in the array are unique (true for yes, false for no). The values 
// in the list are considered unique if there is no pair of values that are equal.

package chapter7;

import java.util.Arrays;

public class Ex11 {
  
  public static void main(String[] args) {
		int[] data1 = {16, 12, 22, 14, 18, 24, 22};
		int[] data2 = {1, 4, 7, 19, 25, 46};
		
		if (isUnique(data1) == true) {
			System.out.println("All are unique in " + Arrays.toString(data1));
		} 
		else {
			System.out.println("There are duplicates in " + Arrays.toString(data1));
		}
		
		if (isUnique(data2) == true) {
			System.out.println("All are unique in " + Arrays.toString(data2));
		} 
		else {
			System.out.println("There are duplicates in " + Arrays.toString(data2));
		}
	}

	public static boolean isUnique(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j]) {
					return false;
				}
			}
		}
	return true;
	}

}
