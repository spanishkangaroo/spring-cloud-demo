package es.clovellyapps.springcloud.drink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.clovellyapps.springcloud.drink.service.DrinkService;

@RestController
public class DrinkController {
	
	@Autowired
	private DrinkService drinkService;
	
	@GetMapping(path="/drink/{type}")
	public String getDrink(@PathVariable("type") String personType) {
		return drinkService.getDrinkDetail(personType);
	}

}
