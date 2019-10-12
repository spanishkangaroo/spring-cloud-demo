package es.clovellyapps.springcloud.craftman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.clovellyapps.springcloud.craftman.feign.DrinkService;

@Service
public class CraftmanService {
	
	@Autowired
	private DrinkService drinkService;
	
	public String getDrink() {
		return drinkService.getDrink("craftman");
	}
}
