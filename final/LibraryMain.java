package library;

public class LibraryMain {

	public static void main(String[] args) {
		String title = "Building Java Programs";
		String authName = "Reges & Stepp";
		String publisher = "Pearson";
		int isbn = 0134322762; 
		
		Book b1 = new Book(title, authName, publisher, isbn);
		title = b1.getTitle();
		authName = b1.getAuthName();
		publisher = b1.getPublisher();
		isbn = b1.getIsbn();
		System.out.print(b1.toString());
		
		String title1 = "#1 Album";
		String authName1 = "Some Guys";
		String publisher1 = "Producer Guy";
		int isbn1 = 0134332323;
		
		Cd m1 = new Cd(title1, authName1, publisher1, isbn1);
		title1 = b1.getTitle();
		authName1 = b1.getAuthName();
		publisher1 = b1.getPublisher();
		isbn1 = b1.getIsbn();
		System.out.print(m1.toString());

		
	}

}
