package harekrishan.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HareKrishanDivineBooksRatingMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HareKrishanDivineBooksRatingMicroServiceApplication.class, args);
	}

}
