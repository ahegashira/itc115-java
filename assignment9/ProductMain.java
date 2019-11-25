// Assignment 9
// Design a class for a generic product:
// From the client app create instance of 2-3 different products and use the toString method to display their data.
// By Hiro Egashira on 11/25/2019

package generic;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) throws NumberFormatException {
		ArrayList<Product> lumber = new ArrayList<Product>();
		lumber.add(new Product("POP4400", "4/4 Poplar", "Hit & Miss, Random Width", 1.80, 2200));
		lumber.add(new Product("WAL4400", "4/4 Walnut", "Hit & Miss, Random Width", 4.80, 4700));
		lumber.add(new Product("MPL4400", "4/4 White Maple", "Hit & Miss, Random Width", 4.40, 9530));
		
		for (Product i : lumber) {
			System.out.print(i);

		}
	}

}	
