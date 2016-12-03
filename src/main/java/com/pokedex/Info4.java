package com.pokedex;

public class Info4 {
    
    private final String egg;
    private final boolean baby; // 0 false (ez da baby) , 1 true (baby da)
    private final int hatch; // hatch counter
    private final String growth; // growth rate

    public Info4(String egg, boolean baby, int hatch, String growth) {
        this.egg = egg;
        this.baby = baby;
        this.hatch = hatch;
        this.growth = growth;
    }

    public String getEgg() {
        return egg;
    }

    public boolean isBaby() {
        return baby;
    }

    public int getHatch() {
        return hatch;
    }

    public String getGrowth() {
        return growth;
    }
    
    
}
