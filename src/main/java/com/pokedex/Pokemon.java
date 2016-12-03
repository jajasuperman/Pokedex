package com.pokedex;

public class Pokemon {

    private int id;
    private String name;
    private Info1 info1;
    private Info2 info2;
    private Info3 info3;
    private Info4 info4;
    private Evolution evo;
    private Stats stats;
    private Location loc;

    public Pokemon(int pId, String pName) {
        this.id = pId;
        this.name = pName;
    }
    
    public Pokemon(int pId, String pName, Info1 pInfo1, Info2 pInfo2, Info3 pInfo3, Info4 pInfo4, Evolution pEvo, Stats pStats, Location pLoc){
        this.id = pId;
        this.name = pName;
        this.info1 = pInfo1;
        this.info2 = pInfo2;
        this.info3 = pInfo3;
        this.info4 = pInfo4;
        this.evo = pEvo;
        this.stats = pStats;
        this.loc = pLoc;
    }

    public int getId() {
        return id;
    }

    public Info1 getInfo1() {
        return info1;
    }

    public Info2 getInfo2() {
        return info2;
    }

    public Info3 getInfo3() {
        return info3;
    }

    public Info4 getInfo4() {
        return info4;
    }

    public Evolution getEvo() {
        return evo;
    }

    public Stats getStats() {
        return stats;
    }

    public Location getLoc() {
        return loc;
    }

    public String getName() {
        return name;
    }

}
