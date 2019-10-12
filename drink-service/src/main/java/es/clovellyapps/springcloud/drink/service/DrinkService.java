package es.clovellyapps.springcloud.drink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.clovellyapps.springcloud.drink.repo.DrinkRepository;

@Service
public class DrinkService {
	
	@Autowired
	private DrinkRepository drinkRepository;

	public String getDrinkDetail(String personType) {
		return drinkRepository.getDrinkForPerson(personType);
	}
}
