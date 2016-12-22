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
public class Db_erabiltzaile {
    
    private String izena;
    private String pasahitza;
    private Set<Db_pokemon> pokemon;

    public Db_erabiltzaile() {
    }

    public Db_erabiltzaile(String izena, String pasahitza, Set<Db_pokemon> pokemon) {
        this.izena = izena;
        this.pasahitza = pasahitza;
        this.pokemon = pokemon;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

    public Set<Db_pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(Set<Db_pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    
}