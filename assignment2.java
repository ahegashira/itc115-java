package Chapter2;

public class ex3 {

	public static void main(String[] args) {
		// Write a function to compute the first 12 Fibonacci numbers.
		int a = 0;
		int b = 0;
		int c = 1;
		for (int k = 0; k < 12; k++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}
}
