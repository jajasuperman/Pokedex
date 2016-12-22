/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex.db;

/**
 *
 * @author ADN
 */
public class Db_pokemon {
    
    private int id;
    private String identifier;
    private Db_pokemon_species species_id;
    private int height;
    private int weight;
    private int base_experience;

    public Db_pokemon() {
    }

    public Db_pokemon(int id, String identifier, Db_pokemon_species species_id, int height, int weight, int base_experience) {
        this.id = id;
        this.identifier = identifier;
        this.species_id = species_id;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
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

    public Db_pokemon_species getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Db_pokemon_species species_id) {
        this.species_id = species_id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

}