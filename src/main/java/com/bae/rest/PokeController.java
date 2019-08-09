package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.business.PokeService;

@RestController
@RequestMapping("/poke")
public class PokeController {
	private PokeService service;

	@Autowired
	public PokeController(PokeService service) {
		this.service = service;
	}

	@GetMapping("/findbyname/{memberId}/{name}")
	public String findPokemonByName(@PathVariable("memberId") int memberId, @PathVariable("name") String pokemon) {
		return service.findPokemonByName(memberId, pokemon);
	}

	@GetMapping("/findbyid/{memberId}/{id}")
	public String findPokemonById(@PathVariable("memberId") int memberId, @PathVariable("id") int id) {
		return service.findPokemonById(memberId, id);
	}

}
