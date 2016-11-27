/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;

/**
 *
 * @author ADN
 */
public class Stats {
    
    private int hp;
    private int atk;
    private int def;
    private int spAt;
    private int spDe;
    private int spd;
   
    public Stats(int pHp, int pAtk, int pDef, int pSpAt, int pSpDe, int pSpd){
        this.hp = pHp;
        this.atk = pAtk;
        this.def = pDef;
        this.spAt = pSpAt;
        this.spDe = pSpDe;
        this.spd = pSpd;
    }
   

    public int total(){
        return this.hp + this.atk + this.def + this.spAt + this.spDe + this.spd;
    }
    
}