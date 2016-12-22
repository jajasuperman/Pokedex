/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex.db;

import java.util.Set;

/**
 *
 * @author ADN
 */
public class Db_types {
        
    private int id;
    private String identifier;
    private Set<Db_pokemon> pokemon_id;

    public Db_types() {
    }

    public Db_types(int id, String identifier, Set<Db_pokemon> pokemon_id) {
        this.id = id;
        this.identifier = identifier;
        this.pokemon_id = pokemon_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Set<Db_pokemon> getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Set<Db_pokemon> pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

}