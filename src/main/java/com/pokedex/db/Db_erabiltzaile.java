/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex.db;

/**
 *
 * @author ADN
 */
public class Db_erabiltzaile {
    
    private String izena;
    private String pasahitza;

    public Db_erabiltzaile() {
    }

    public Db_erabiltzaile(String izena, String pasahitza) {
        this.izena = izena;
        this.pasahitza = pasahitza;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getPasahitza() {
        return pasahitza;
    }

    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }

}