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
public class Db_generations {
    
    private int id;
    private Db_regions main_region_id;
    private String identifier;

    public Db_generations() {
    }

    public Db_generations(int id, Db_regions main_region_id, String identifier) {
        this.id = id;
        this.main_region_id = main_region_id;
        this.identifier = identifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Db_regions getMain_region_id() {
        return main_region_id;
    }

    public void setMain_region_id(Db_regions main_region_id) {
        this.main_region_id = main_region_id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}