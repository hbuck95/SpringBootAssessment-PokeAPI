package com.bae.business;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeServiceImpl implements PokeService {
	private RestTemplate template;

	private static final String POKE_API = "https://pokeapi.co/api/v2/pokemon/";

	public PokeServiceImpl(RestTemplate template) {
		this.template = template;
	}

	@Override
	public String findPokemonByName(int memberId, String pokemon) {
		ResponseEntity<String> pokeString = template.exchange(POKE_API + pokemon, HttpMethod.GET, null, String.class);
		return pokeString.getBody();
	}

	@Override
	public String findPokemonById(int memberId, int pokeId) {
		ResponseEntity<String> pokeString = template.exchange(POKE_API + pokeId, HttpMethod.GET, null, String.class);
		return pokeString.getBody();
	}

}
