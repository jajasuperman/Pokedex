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

    public void setId(int pId) {
        this.id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        this.name = pName;
    }

}
