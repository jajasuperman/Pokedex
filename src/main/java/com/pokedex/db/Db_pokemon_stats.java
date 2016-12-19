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
public class Db_pokemon_stats {
        
    private int pokemon_id;
    private int stat_id;
    private int base_stat;

    public Db_pokemon_stats(int pokemon_id, int stat_id, int base_stat) {
        this.pokemon_id = pokemon_id;
        this.stat_id = stat_id;
        this.base_stat = base_stat;
    }

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public int getStat_id() {
        return stat_id;
    }

    public void setStat_id(int stat_id) {
        this.stat_id = stat_id;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

}