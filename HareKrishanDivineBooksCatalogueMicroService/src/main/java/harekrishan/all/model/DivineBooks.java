package harekrishan.all.model;

public class DivineBooks {
	
	public DivineBooks(int bookId, String bookName, String bookDescription, int rating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.rating = rating;
	}
	int bookId;
	String bookName;
	String bookDescription;
	int rating;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "DivineBooks [bookId=" + bookId + ", bookName=" + bookName + ", rating=" + rating + "]";
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

}
