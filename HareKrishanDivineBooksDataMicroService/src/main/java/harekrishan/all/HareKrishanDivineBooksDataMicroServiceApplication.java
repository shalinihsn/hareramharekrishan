package harekrishan.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HareKrishanDivineBooksDataMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HareKrishanDivineBooksDataMicroServiceApplication.class, args);
	}

}
