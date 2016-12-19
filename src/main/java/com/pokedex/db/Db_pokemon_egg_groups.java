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
public class Db_pokemon_egg_groups {
    
    private int species_id;
    private int egg_group_id;

    public Db_pokemon_egg_groups(int species_id, int egg_group_id) {
        this.species_id = species_id;
        this.egg_group_id = egg_group_id;
    }


    public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

    public int getEgg_group_id() {
        return egg_group_id;
    }

    public void setEgg_group_id(int egg_group_id) {
        this.egg_group_id = egg_group_id;
    }

}