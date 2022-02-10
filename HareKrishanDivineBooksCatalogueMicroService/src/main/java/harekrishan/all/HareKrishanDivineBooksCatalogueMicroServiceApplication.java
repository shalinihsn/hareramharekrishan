package harekrishan.all;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient

public class HareKrishanDivineBooksCatalogueMicroServiceApplication {

	static Logger logger= LoggerFactory.getLogger(HareKrishanDivineBooksCatalogueMicroServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HareKrishanDivineBooksCatalogueMicroServiceApplication.class, args);
		logger.debug("HareKrishan {}","Krishan");
		logger.debug("HareKrishan {},{} and {}",1,2,3);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
