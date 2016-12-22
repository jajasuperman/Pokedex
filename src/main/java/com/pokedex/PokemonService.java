/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pokemonService", eager = true)
@ApplicationScoped
public class PokemonService {

    private List<Pokemon> pokemons;

    @PostConstruct
    public void init() {
        pokemons = new ArrayList<>();

        for (int i = 0; i < 721; i++) {
            String izena = Deiak.getInstance().getPokeIzena(i + 1);
            izena = izena.substring(0, 1).toUpperCase() + izena.substring(1);
            pokemons.add(new Pokemon(i, izena));
        }
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

}
