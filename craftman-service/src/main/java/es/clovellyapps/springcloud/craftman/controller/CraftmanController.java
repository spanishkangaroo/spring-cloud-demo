package es.clovellyapps.springcloud.craftman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.clovellyapps.springcloud.craftman.service.CraftmanService;

@RestController
public class CraftmanController {
	
	@Autowired
	private CraftmanService craftmanService;

	@GetMapping(path="/craftman/language")
	public String getLanguage() {
		return "java";
	}
	
	@GetMapping(path="/craftman/drink")
	public String getDrink() {
		return craftmanService.getDrink();
	}
}
