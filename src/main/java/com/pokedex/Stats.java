package com.pokedex;

public class Stats {
    
    private final int hp;
    private final int atk;
    private final int def;
    private final int spAt;
    private final int spDe;
    private final int spd;

    public Stats(int hp, int atk, int def, int spAt, int spDe, int spd) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAt = spAt;
        this.spDe = spDe;
        this.spd = spd;
    }     

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpAt() {
        return spAt;
    }

    public int getSpDe() {
        return spDe;
    }

    public int getSpd() {
        return spd;
    }         

    public int total(){
        return this.hp + this.atk + this.def + this.spAt + this.spDe + this.spd;
    }
    
}