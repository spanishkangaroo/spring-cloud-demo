package es.clovellyapps.springcloud.craftman.feign;

import org.springframework.stereotype.Component;

@Component
public class DrinkFallbackService implements DrinkService {

	@Override
	public String getDrink(String petType) {
		return "drink not available for craftman";
	}

}
