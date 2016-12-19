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
public class Db_dittu{
    
    private String izena;
    private int pokemon;

    public Db_dittu(String izena, int pokemon) {
        this.izena = izena;
        this.pokemon = pokemon;
    }

    public String getIzena(){
            return izena;
    }

    public void setIzena(String izena){
            this.izena=izena;
    }

    public int getPokemon(){
            return pokemon;
    }

    public void setPokemon(int pokemon){
            this.pokemon=pokemon;
    }

}