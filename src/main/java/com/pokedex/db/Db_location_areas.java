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
public class Db_location_areas {
    
    private int id;
    private Db_locations location_id;
    private String identifier;

    public Db_location_areas() {
    }

    public Db_location_areas(int id, Db_locations location_id, String identifier) {
        this.id = id;
        this.location_id = location_id;
        this.identifier = identifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Db_locations getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Db_locations location_id) {
        this.location_id = location_id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}