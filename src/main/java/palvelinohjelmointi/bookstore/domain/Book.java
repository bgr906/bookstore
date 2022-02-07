package palvelinohjelmointi.bookstore.domain;

public class Book {
	
	private String title;
	private String author;
	private int year;
	private String isbn;
	private double price;
	
	// kostruktorit
	// parametriton konstruktori
	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.year = 0;
		this.isbn = null;
		this.price = 0.0;
	}
	
	// parametrillinen konstruktori
	public Book(String title, String author, int year, String isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}

	// setterit
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// getterit
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	// toString
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", year=" 
				+ year + ", isbn=" + isbn + ", price=" + price;
	}	
}