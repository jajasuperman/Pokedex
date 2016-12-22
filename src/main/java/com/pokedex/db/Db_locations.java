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
public class Db_locations {
    
    private int id;
    private Db_regions region_id;
    private String identifier;

    public Db_locations() {
    }

    public Db_locations(int id, Db_regions region_id, String identifier) {
        this.id = id;
        this.region_id = region_id;
        this.identifier = identifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Db_regions getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Db_regions region_id) {
        this.region_id = region_id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}