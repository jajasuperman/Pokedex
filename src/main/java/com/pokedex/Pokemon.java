package com.pokedex;

public class Pokemon {

    private int pokId;
    private String pokIzena;

    public Pokemon(int pPokId, String pPokIzena) {
        this.pokId = pPokId;
        this.pokIzena = pPokIzena;
    }

    public int getPokId() {
        return pokId;
    }

    public void setPokId(int pPokId) {
        this.pokId = pPokId;
    }

    public String getPokIzena() {
        return pokIzena;
    }

    public void setPokIzena(String pPokIzena) {
        this.pokIzena = pPokIzena;
    }

}
