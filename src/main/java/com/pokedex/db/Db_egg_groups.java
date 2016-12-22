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
public class Db_egg_groups {
    
    private int id;
    private String identifier;
    private Set<Db_pokemon_species> species_id;

    public Db_egg_groups() {
    }

    public Db_egg_groups(int id, String identifier, Set<Db_pokemon_species> pokemon_species_id) {
        this.id = id;
        this.identifier = identifier;
        this.species_id = pokemon_species_id;
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

    public Set<Db_pokemon_species> getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Set<Db_pokemon_species> pokemon_species_id) {
        this.species_id = pokemon_species_id;
    }

}