package harekrishan.all.model;

public class DivineBooksDetail {
	
	int bookId;
	String bookName;
	String bookDescription;
	
	
	public DivineBooksDetail() {
		super();
	}
	public DivineBooksDetail(int id, String name, String description) {
     bookId=id;
     bookName=name;
     bookDescription=description;
	}
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
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	@Override
	public String toString() {
		return "DivineBooksDetail [bookId=" + bookId + ", bookName=" + bookName + ", bookDescription=" + bookDescription
				+ "]";
	}
	
	

}
