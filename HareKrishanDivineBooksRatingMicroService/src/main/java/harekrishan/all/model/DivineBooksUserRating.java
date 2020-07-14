package harekrishan.all.model;

import java.util.List;

public class DivineBooksUserRating {
	
	int userId;
	List<DivineBookRating> divineBookRating;
	public DivineBooksUserRating(int userId, List<DivineBookRating> divineBookRating) {
		super();
		this.userId = userId;
		this.divineBookRating = divineBookRating;
	}
	public DivineBooksUserRating() {
	
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<DivineBookRating> getDivineBookRating() {
		return divineBookRating;
	}
	public void setDivineBookRating(List<DivineBookRating> divineBookRating) {
		this.divineBookRating = divineBookRating;
	}
	@Override
	public String toString() {
		return "DivineBooksUserRating [userId=" + userId + ", divineBookRating=" + divineBookRating + "]";
	}
	
	
	
	

}
