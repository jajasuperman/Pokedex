/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex.db;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author ADN
 */

@Entity
@IdClass(Db_pokemon_stats_PK.class)
public class Db_pokemon_types implements Serializable{
    
    @Id
    private int pokemon_id;
    private Db_types type_id;
    @Id
    private int slot;

    public Db_pokemon_types() {
    }

    public Db_pokemon_types(int pokemon_id, Db_types type_id, int slot) {
        this.pokemon_id = pokemon_id;
        this.type_id = type_id;
        this.slot = slot;
    }

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public Db_types getType_id() {
        return type_id;
    }

    public void setType_id(Db_types type_id) {
        this.type_id = type_id;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

}