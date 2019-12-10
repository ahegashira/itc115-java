package library;

import java.text.NumberFormat;

public class Library {
	public String item = "book";
	public String title = "BOOK TITLE";
	public double lateFine = 0.50;

	public String getPriceFormatted(double lateFine) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(lateFine);
		return formattedPrice;
	}
	
	@Override
	public String toString() {
		return "We hope you enjoy your " + item + "." +
				"\nTitle: " + title +
				"\nIf returned late, the fee is " + getPriceFormatted(lateFine) + " per day." +
				"\n\n\n";
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getLateFine() {
		return lateFine;
	}

	public void setLateFine(double lateFine) {
		this.lateFine = lateFine;
	}
	
	
}
