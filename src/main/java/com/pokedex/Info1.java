package com.pokedex;

public class Info1 {
    
    private final String type1;
    private final String type2;
    private final int generation;
    private final int weight;
    private final int height;

    public Info1(String type1, String type2, int generation, int weight, int height) {
        this.type1 = type1;
        this.type2 = type2;
        this.generation = generation;
        this.weight = weight;
        this.height = height;
    }   

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getGeneration() {
        return generation;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
        
}
