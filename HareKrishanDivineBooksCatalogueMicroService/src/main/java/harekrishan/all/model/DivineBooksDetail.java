package harekrishan.all.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/*
To directly bind your data to your custom types, you need to specify the variable name to be exactly the same as the key in the JSON document returned from the API.
In case your variable name and key in JSON doc do not match, you can use @JsonProperty annotation to specify the exact key of the JSON document.
 */
public class DivineBooksDetail {

	@JsonProperty("id")
	private String bookId;
	@JsonProperty("title")
	private String bookName;
	@JsonProperty("overview")
	private String bookDescription;



	/*public DivineBooksDetail() {
		super();
	}*/
	/*public DivineBooksDetail(String id, String name, String description) {
		this.bookId=id;
		this.bookName=name;
		this.bookDescription=description;
	}*/
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
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
