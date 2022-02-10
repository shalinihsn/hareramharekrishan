package harekrishan.all.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import harekrishan.all.model.DivineBooks;
import harekrishan.all.model.DivineBooksDetail;
import harekrishan.all.model.DivineBooksUserRating;

@RestController
public class DivineBooksCatalogueController {
	
	@Autowired
	RestTemplate restTemplate;

	Logger logger = LoggerFactory.getLogger(DivineBooksCatalogueController.class);
	
	@RequestMapping("/HareKrishan/{userId}")
	public List<DivineBooks> getDivineBooksDataByUserId(@PathVariable  int userId) {
		logger.debug("HareKrishan Logger in debug");
		
		DivineBooksUserRating userRating = restTemplate.getForObject("http://HareKrishanDivineBooks-rating-microservice/HareKrishan/divinebooksuserrating/"+userId,
				DivineBooksUserRating.class);
		
		//List<DivineBooksDetail>  booksDetails= (List<DivineBooksDetail>) restTemplate.getForObject("http://localhost:8083//HareKrishan/divinebooksuserrating/"+id,DivineBooksDetail.class ); 


		return userRating.getDivineBookRating().stream().map(
				rating->{
					DivineBooksDetail bookDetail = restTemplate.getForObject("http://HareKrishanDivineBooks-data-microservice/HareKrishan/divinebooksdetail/"+
					rating.getBookId(), DivineBooksDetail.class);
                    System.out.println("Harekrishan book details"+bookDetail);
			
			return new DivineBooks(Integer.parseInt(bookDetail.getBookId()),bookDetail.getBookName(),bookDetail.getBookDescription(),rating.getRating());
			
		}).collect(Collectors.toList());
		
	}

}
