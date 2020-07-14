package harekrishan.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HareKrishanDivineBooksServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HareKrishanDivineBooksServerApplication.class, args);
	}

}
