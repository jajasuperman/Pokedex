/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex.db;

import java.io.Serializable;

/**
 *
 * @author Eneko
 */
public class Db_pokemon_types_PK implements Serializable {

    protected int pokemon_id;
    protected int slot;

    public Db_pokemon_types_PK() {
    }

    public Db_pokemon_types_PK(int pokemon_id, int slot) {
        this.pokemon_id = pokemon_id;
        this.slot = slot;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return o instanceof Db_pokemon_types_PK;
    }

    @Override
    public int hashCode() {
        return pokemon_id;
    }
}
