// From Building Java Programs 4th Edition
// Chapter 7, Exercise 4
// Solution by Hiro Egashira on 11/17/2019

// Write a static method named isSorted that accepts an array of doubles as a parameter and
// returns true if the list is sorted in an increasing order and false otherwise.

package chapter 8;

public class Ex04 {

  public void main(String[] args) {
  
  
  }

  public boolean isSorted(double[] newArr) {
	
    for (int i = 0; i <= newArr.length - 2; i++) {
			if (newArr[i] >= newArr[i + 1]) {
				return false;
			}
		}
		return true;
	}
  
}
