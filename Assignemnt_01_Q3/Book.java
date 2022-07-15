
public class Book {
	
	private String bookTitle;
	private double bookPrice;
	private String bookDisc;
	
	
	public Book(String bookTitle, double bookPrice) {

		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
//		this.bookDisc = bookDisc;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getBookDisc() {
		return bookDisc;
	}


	public void setBookDisc(String bookDisc) {
		this.bookDisc = bookDisc;
	}

}
