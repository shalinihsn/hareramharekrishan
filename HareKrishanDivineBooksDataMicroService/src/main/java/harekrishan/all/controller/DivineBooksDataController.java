package harekrishan.all.controller;

import java.util.ArrayList;
import java.util.List;

import harekrishan.all.model.DivineBooksDetail;
import harekrishan.all.model.HareKrishanMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DivineBooksDataController {

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate hareKrishanRestTemplate;



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

		
		return new DivineBooksDetail(bookId,"Bhagvad Geeta","Guide Friend Philospher for Human Race");
		*/

		String bookIdStr= Integer.toString(bookId);
		System.out.println(bookIdStr);
		System.out.println("https://api.themoviedb.org/3/movie/"+bookIdStr+"?api_key="+apiKey);
		DivineBooksDetail hareKrishanBookData= hareKrishanRestTemplate.getForObject("https://api.themoviedb.org/3/movie/"+bookIdStr+"?api_key="+apiKey,DivineBooksDetail.class);
		//HareKrishanMovie hareKrishanBookData= hareKrishanRestTemplate.getForObject("https://api.themoviedb.org/3/movie/"+bookIdStr+"?api_key="+apiKey,HareKrishanMovie.class);
		//HareKrishanBookData hareKrishanBookData2 = new HareKrishanBookData("3","Bhagwad Geeta");
		//hareKrishanBookData.setId(hareKrishanBookData.getId());
		//hareKrishanBookData.setBookName(hareKrishanBookData.getTitle());
		System.out.println("harekrishan get book details "+hareKrishanBookData);
		/*DivineBooksDetail divineBooksDetail = new DivineBooksDetail();

		divineBooksDetail.setBookId(Integer.toString(bookId));
		divineBooksDetail.setBookDescription(hareKrishanBookData.getOverview());
		divineBooksDetail.setBookName(hareKrishanBookData.getTitle());*/
		//DivineBooksDetail divineBooksDetail = new DivineBooksDetail();

		hareKrishanBookData.setBookId(bookIdStr);
		/*divineBooksDetail.setBookDescription(hareKrishanBookData.getOverview());
		divineBooksDetail.setBookName(hareKrishanBookData.getTitle());*/
		/*hareKrishanBookData.setBookId(bookIdStr);
		hareKrishanBookData.setBookName(hareKrishanBookData.getBookName());
		hareKrishanBookData.setBookDescription(hareKrishanBookData.getBookDescription());*/
		return hareKrishanBookData;
	}

}
