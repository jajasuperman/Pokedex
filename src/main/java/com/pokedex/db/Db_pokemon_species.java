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
public class Db_pokemon_species {
            
    private int id;
    private String identifier;
    private int generation_id;
    private Integer evolves_from_species_id;
    private int evolution_chain_id;
    private int color_id;
    private Db_pokemon_shapes shape_id;
    private Db_pokemon_habitats habitat_id;
    private int gender_rate;
    private int capture_rate;
    private int base_happiness;
    private int is_baby;
    private int hatch_counter;
    private int growth_rate_id;

    public Db_pokemon_species() {
    }

    public Db_pokemon_species(int id, String identifier, int generation_id, int evolves_from_species_id, int evolution_chain_id, int color_id, Db_pokemon_shapes shape_id, Db_pokemon_habitats habitat_id, int gender_rate, int capture_rate, int base_happiness, int is_baby, int hatch_counter, int growth_rate_id) {
        this.id = id;
        this.identifier = identifier;
        this.generation_id = generation_id;
        this.evolves_from_species_id = evolves_from_species_id;
        this.evolution_chain_id = evolution_chain_id;
        this.color_id = color_id;
        this.shape_id = shape_id;
        this.habitat_id = habitat_id;
        this.gender_rate = gender_rate;
        this.capture_rate = capture_rate;
        this.base_happiness = base_happiness;
        this.is_baby = is_baby;
        this.hatch_counter = hatch_counter;
        this.growth_rate_id = growth_rate_id;
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

    public int getGeneration_id() {
        return generation_id;
    }

    public void setGeneration_id(int generation_id) {
        this.generation_id = generation_id;
    }

    public Integer getEvolves_from_species_id() {
        return evolves_from_species_id;
    }

    public void setEvolves_from_species_id(Integer evolves_from_species_id) {
        this.evolves_from_species_id = evolves_from_species_id;
    }

    public int getEvolution_chain_id() {
        return evolution_chain_id;
    }

    public void setEvolution_chain_id(int evolution_chain_id) {
        this.evolution_chain_id = evolution_chain_id;
    }

    public int getColor_id() {
        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public Db_pokemon_shapes getShape_id() {
        return shape_id;
    }

    public void setShape_id(Db_pokemon_shapes shape_id) {
        this.shape_id = shape_id;
    }

    public Db_pokemon_habitats getHabitat_id() {
        return habitat_id;
    }

    public void setHabitat_id(Db_pokemon_habitats habitat_id) {
        this.habitat_id = habitat_id;
    }

    public int getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(int gender_rate) {
        this.gender_rate = gender_rate;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public int getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(int base_happiness) {
        this.base_happiness = base_happiness;
    }

    public int getIs_baby() {
        return is_baby;
    }

    public void setIs_baby(int is_baby) {
        this.is_baby = is_baby;
    }

    public int getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(int hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public int getGrowth_rate_id() {
        return growth_rate_id;
    }

    public void setGrowth_rate_id(int growth_rate_id) {
        this.growth_rate_id = growth_rate_id;
    }

}