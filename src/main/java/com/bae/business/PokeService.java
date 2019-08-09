package com.bae.business;

public interface PokeService {
	public String findPokemonByName(int memberId, String pokemon);

	public String findPokemonById(int memberId, int pokeId);

}
