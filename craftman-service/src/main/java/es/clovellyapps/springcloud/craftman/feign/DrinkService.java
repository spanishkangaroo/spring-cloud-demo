package es.clovellyapps.springcloud.craftman.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="drink-service", fallback=DrinkFallbackService.class)
public interface DrinkService {
	
	@GetMapping(path="/drink/{type}")
	public String getDrink(@PathVariable("type") String personType);
	
}
