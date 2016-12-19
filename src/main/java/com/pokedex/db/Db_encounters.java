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
public class Db_encounters {
    
    private int id;
    private int version_id;
    private int location_area_id;
    private int encounter_slot_id;
    private int pokemon_id;
    private int min_level;
    private int max_level;

    public Db_encounters(int id, int version_id, int location_area_id, int encounter_slot_id, int pokemon_id, int min_level, int max_level) {
        this.id = id;
        this.version_id = version_id;
        this.location_area_id = location_area_id;
        this.encounter_slot_id = encounter_slot_id;
        this.pokemon_id = pokemon_id;
        this.min_level = min_level;
        this.max_level = max_level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion_id() {
        return version_id;
    }

    public void setVersion_id(int version_id) {
        this.version_id = version_id;
    }

    public int getLocation_area_id() {
        return location_area_id;
    }

    public void setLocation_area_id(int location_area_id) {
        this.location_area_id = location_area_id;
    }

    public int getEncounter_slot_id() {
        return encounter_slot_id;
    }

    public void setEncounter_slot_id(int encounter_slot_id) {
        this.encounter_slot_id = encounter_slot_id;
    }

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public int getMin_level() {
        return min_level;
    }

    public void setMin_level(int min_level) {
        this.min_level = min_level;
    }

    public int getMax_level() {
        return max_level;
    }

    public void setMax_level(int max_level) {
        this.max_level = max_level;
    }

}