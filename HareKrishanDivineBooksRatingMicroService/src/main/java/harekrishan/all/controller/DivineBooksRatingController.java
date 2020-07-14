package harekrishan.all.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harekrishan.all.model.DivineBookRating;
import harekrishan.all.model.DivineBooksUserRating;

@RestController
public class DivineBooksRatingController {
	
	
	@RequestMapping("/HareKrishan/divinebooksuserrating/{userId}")
	public DivineBooksUserRating getDivineBooksUserRating(@PathVariable int userId)
	{
		DivineBooksUserRating userRating= new DivineBooksUserRating();
		/*
		 * list.add(new DivineBooksUserRating(userId, new DivineBookRating(1,5)));
		 * list.add(new DivineBooksUserRating(userId, new DivineBookRating(2,5)));
		 * list.add(new DivineBooksUserRating(userId, new DivineBookRating(3,5)));
		 * list.add(new DivineBooksUserRating(userId, new DivineBookRatin,5)));
		 */
		List<DivineBookRating> list = new ArrayList<DivineBookRating>();
		list.add(new DivineBookRating(1,5));
		list.add(new DivineBookRating(2,5));
		list.add(new DivineBookRating(3,5));
		list.add(new DivineBookRating(4,5));
		userRating.setDivineBookRating(list);
		return userRating;
		
	}
}
