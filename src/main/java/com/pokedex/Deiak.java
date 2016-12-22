/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;

import com.pokedex.db.*;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Eka
 */

public class Deiak {

    private SessionFactory sf = null;
    private Session session;
    
    private static Deiak instance = null;

    protected Deiak() {
        hasieratu();
    }
    
    public static Deiak getInstance() {
        if(instance == null) {
            instance = new Deiak();
        }
        return instance;
    }

    private void hasieratu() {

        Configuration conf = new Configuration().configure();

        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        sf = conf.buildSessionFactory(sr);

        session = sf.openSession();
        session.beginTransaction();

    }   

    public String getPokeIzena(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getIdentifier();
    }

    public String getPokeGen(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getGeneration_id().getIdentifier();
    }

    public int getPokeWeight(int i) {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, i);
        return fro.getWeight();
    }

    public int getPokeHeight(int i) {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, i);
        return fro.getHeight();
    }

    public String getPokeColour(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getColor_id().getIdentifier();
    }

    public String getPokeShape(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getShape_id().getIdentifier();
    }

    public int getPokeGender(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getGender_rate();
    }

    public String getPokeHabitat(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getHabitat_id().getIdentifier();
    }

    public int getPokeCaptureRate(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getCapture_rate();
    }

    public int getPokeHappiness(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getBase_happiness();
    }

    public int getPokeBaseExp(int i) {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, i);
        return fro.getBase_experience();
    }

    public int getPokeHatch(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getHatch_counter();
    }

    public String getPokeGrowthRate(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getGrowth_rate_id().getIdentifier();
    }

    public int getPokeBaby(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getIs_baby();
    }

    public String getPokeEgg(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);

        String eggs = "";

        Iterator<Db_egg_groups> ema = fro.getEgg_group_id().iterator();

        while (ema.hasNext()) {
            eggs = eggs + ema.next().getIdentifier() + " ";
        }

        return eggs;
    }

    /*
    
    public String getPokeType1(int i) {

    }

    public String getPokeType2(int i) {

    }                                               
    
    public String getPokeEvolution(int i) {
        
    }   
    
    public int getPokeHP(int i) {

    }
    
    public String getPokeAttack(int i) {
        
    }
    
    public String getPokeDefense(int i) {
        
    }
    
    public String getPokeSpeed(int i) {
        
    }
    
    public String getPokeSpAtk(int i) {
        
    }
    
    public String getPokeSpDef(int i) {
        
    }
    
    public String getPokeLocations(int i) {
        
    }    

     */
    public static void main(String[] args) {
        Deiak froManager = new Deiak();

        System.out.println("Yee");
        System.out.println(froManager.getPokeBaby(177));

        System.exit(0);

    }
}
