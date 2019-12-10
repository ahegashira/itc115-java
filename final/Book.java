package library;

import java.text.NumberFormat;

public class Book implements Item {
	public String title;
	public String authName;
	public String publisher;
	public int isbn;
	public double lateFine = 0.50;
	
	public Book(String title, String authName, String publisher, int isbn) {
		this.title = title;
		this.authName = authName;
		this.publisher = publisher;
		this.isbn = isbn;
	}

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
