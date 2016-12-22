/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;

import com.pokedex.db.Db_pokemon_species;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Set;

/**
 *
 * @author Eka
 */
@ManagedBean
public class Deiak {

    private SessionFactory sf = null;
    private Session session;

    public Deiak() {
        hasieratu();
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

    /*
    public String getPokeType1(int i) {

    }

    public String getPokeType2(int i) {

    }
    
    public String getPokeGen(int i) {
        
    }
    
    public String getPokeWeight(int i) {
        
    }
    
    public String getPokeHeight(int i) {
        
    }
    
    public String getPokeGender(int i) {
        
    }
    
    public String getPokeColour(int i) {
        
    }
    
    public String getPokeShape(int i) {
        
    }
    
    public String getPokeHabitat(int i) {
        
    }
    
    public String getPokeCapture(int i) {
        
    }
    
    public String getPokeHappiness(int i) {
        
    }
    
    public String getPokeBaseExp(int i) {
        
    }   
    
    public String getPokeBaby(int i) {
        
    }
    
    public String getPokeHatch(int i) {
        
    }
    
    public String getPokeGrowthRate(int i) {
        
    }
    
    public String getPokeEvolution(int i) {
        
    }
    
    public String getPokeHP(int i) {
        
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
    public String getPokeEgg(int i) {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
        return fro.getEgg_group_id().toString();
    }

    public static void main(String[] args) {
        Deiak froManager = new Deiak();

        System.out.println(froManager.getPokeEgg(1));

        System.exit(0);

    }
}
