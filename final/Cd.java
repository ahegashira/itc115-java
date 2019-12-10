package library;

import java.text.NumberFormat;

public class Cd implements Item {
	public String title;
	public String authName;
	public String publisher;
	public int isbn;
	public double lateFine = 0.50;

	public Cd(String title1, String authName1, String publisher1, int isbn1) {
		this.title = title1;
		this.authName = authName1;
		this.publisher = publisher1;
		this.isbn = isbn1;	}

	public String getPriceFormatted(double lateFine) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(lateFine);
		return formattedPrice;
	}
		
	@Override
	public String toString() {
		return "We hope you enjoyed " + title +
			"\nBy: " + authName +
			"\nPublisher: " + publisher +
			"\nISBN: " + isbn + 
			"\nIf this item is returned late, the fee is " + getPriceFormatted(lateFine) + " per day." + 
			"\n\n\n";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getLateFine() {
		return lateFine;
	}

	public void setLateFine(double lateFine) {
		this.lateFine = lateFine;
	}

	@Override
	public String title() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String authName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String publisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int isbn() {
		// TODO Auto-generated method stub
		return 0;
	}
}
