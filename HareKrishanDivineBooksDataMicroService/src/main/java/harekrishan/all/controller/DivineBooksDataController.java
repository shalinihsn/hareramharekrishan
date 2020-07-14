package harekrishan.all.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harekrishan.all.model.DivineBooksDetail;


@RestController
public class DivineBooksDataController {
	
	@RequestMapping("HareKrishan/divinebooksdetail/{bookId}")
	public DivineBooksDetail getDivineBooksDetail(@PathVariable int bookId)
	{
		/*
		 * List<DivineBooksDetail> list = new ArrayList<DivineBooksDetail>();
		 * 
		 * list.add(new
		 * DivineBooksDetail(1,"Bhagvad Geeta","Guide Friend Philospher for Human Race")
		 * ); list.add(new DivineBooksDetail(2, "Ramayan",
		 * "Teaches one to lead life of sacrifices for others and in one's limits"));
		 * list.add(new DivineBooksDetail(3, "Upanishads", "Home of divine knowledge"));
		 * list.add(new DivineBooksDetail(4, "Vedas",
		 * "The divine knowledge of Santana Dharma")); return list;
		 */
		
		return new DivineBooksDetail(bookId,"Bhagvad Geeta","Guide Friend Philospher for Human Race");
	}

}
