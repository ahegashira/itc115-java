package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		// Write a method called printPowersOfN that accepts a base and an exponent as arguments and
		// prints each power of the base from base 0 (1) up to that maximum power, inclusive.
		// ie:
		// printPowersOfN(4, 3); --> 1 4 16 64
		// printPowersOfN(5, 6); --> 1 5 25 125 625 3125 15625
		// printPowersOfN(-2, 8); --> 1 -2 4 -8 16 -32 64 -128 256
		
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
	}
	
	public static void printPowersOfN(int baseNum, int maxExponent) {
		for (int i = 0; i <= maxExponent; i++) {
			System.out.print((int) Math.pow(baseNum, i) + " ");
		}
		System.out.println();		
	}
}
