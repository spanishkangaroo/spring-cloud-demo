package es.clovellyapps.springcloud.drink.repo;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DrinkRepository {
	
	private HashMap<String, String> drinkStore = new HashMap<>();
	public static final String craftman_drink = "beer";
	public static final String craftman = "craftman";
	
	@PostConstruct
	public void init() {
		synchronized (drinkStore) {
			drinkStore.clear();
			drinkStore.put(craftman, craftman_drink);
		}
	}
	
	public String getDrinkForPerson(String personType) {
		return drinkStore.get(personType);
	}
	
}
