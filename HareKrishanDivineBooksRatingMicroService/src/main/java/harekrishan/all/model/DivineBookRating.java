package harekrishan.all.model;

public class DivineBookRating {
	
	int bookId;
	int rating;
	
	public DivineBookRating() {
		super();
	}
	public DivineBookRating(int bookId, int rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "DivineBookRating [bookId=" + bookId + ", rating=" + rating + "]";
	}
	
	
	
	
	

}
