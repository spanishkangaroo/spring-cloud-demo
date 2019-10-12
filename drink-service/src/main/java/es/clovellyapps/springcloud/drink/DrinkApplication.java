package es.clovellyapps.springcloud.drink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DrinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkApplication.class, args);
	}
}
