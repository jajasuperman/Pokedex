package com.pokedex;

public class Pokemon {
    private final String id;
    private final String izena;
    
    public Pokemon(String pId, String pIzena) {
        this.id = pId;
        this.izena = pIzena;
    }
    
    public String getId() {
        return id;
    }
    public String getIzena() {
        return izena;
    }  
}
