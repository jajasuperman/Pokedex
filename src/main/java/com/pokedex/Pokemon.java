package com.pokedex;

public class Pokemon {

    private int id;
    private String name;
    
    public Pokemon() {}

    public Pokemon(int pId, String pName) {
        this.id = pId;
        this.name = pName;
    }

    public int getId() {
        return id;
    }   

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
