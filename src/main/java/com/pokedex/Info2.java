    package com.pokedex;

public class Info2 {
    
    private final int gender; // (gender/8) izango da: 8/8 emakumea beti, 0/8 gizona beti, -1/8 genderless
    private final String colour;
    private final String shape;
    private final String habitat;

    public Info2(int gender, String colour, String shape, String habitat) {
        this.gender = gender;
        this.colour = colour;
        this.shape = shape;
        this.habitat = habitat;
    }

    public int getGender() {
        return gender;
    }

    public String getColour() {
        return colour;
    }

    public String getShape() {
        return shape;
    }

    public String getHabitat() {
        return habitat;
    }
    
}
