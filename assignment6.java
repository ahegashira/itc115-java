// Building Java Programs 4th Edition
// Chapter 6, Exercise 1
// Solution by Hiro Egashira on 11/09/2019
// requires file 'boysGirls.txt' to run

// Write a method called boyGirl that accepts a Scanner that is reading its input from a file containing a series of 
// names followed by integers. The names alternate between boys' names and girls' names. Your method should compute
// the absolute difference between the sum of the boys' integers and the sum of the girls' integers. The input could 
// end with either a boy or a girl; you may not assume that it contains an even number of names.

package chapter6;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ex01 {

	public static void main(String[] args) throws FileNotFoundException {
		File bg = new File("boysgirls.txt");
		System.out.println("Exists: " + bg.exists()); //test to be sure file is properly placed
		Scanner scan = new Scanner(new File("boysgirls.txt"));
		boyGirl(scan);
		scan.close();
	}
	
	public static void boyGirl(Scanner input) throws FileNotFoundException {
		// initialize variables
		int numBoyName = 0;
		int sumBoy = 0;
		int numGirlName = 0;
		int sumGirl = 0;
		int counter = 0;
		int boyGirlDiff;
		
		// read file with while loop
		while (input.hasNext()) {
			String data = input.next();
			if (counter % 2 == 0) {
				numBoyName++;
				sumBoy += input.nextInt();
			} else {
				numGirlName++;
				sumGirl += input.nextInt();
			}
			counter++;
		}
		
		// get difference between sumBoy and sumGirl totals
		boyGirlDiff = Math.abs(sumBoy - sumGirl);
		
		//print results
		System.out.println(numBoyName + " boys, " + numGirlName + " girls.");
		System.out.println("The boys' sum is " + sumBoy + " and the girls' sum is " + sumGirl);
		System.out.println("The difference is " + boyGirlDiff);
	}
}
