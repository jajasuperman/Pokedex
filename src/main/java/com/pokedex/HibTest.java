/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

import com.pokedex.db.*;
/**
 *
 * @author ADN
 */
public class HibTest {
    
    private SessionFactory sf = null;

    public HibTest() {
        hasieratu();
    }

    private void hasieratu() {
        
        Configuration conf = new Configuration().configure();

        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        sf = conf.buildSessionFactory(sr);

    }

    private void persistDb_pokemon_habitats() {
        Db_pokemon_habitats fro = new Db_pokemon_habitats(10,"GG");
        
        Session session = sf.openSession();

        session.beginTransaction();

        session.save(fro);

        session.getTransaction().commit();
        
        session.close();

        sf.close();
    }

    private void findDb_pokemon_habitats(int i) {

        Session session = sf.openSession();

        session.beginTransaction();

        Db_pokemon_habitats fro = (Db_pokemon_habitats) session.load(Db_pokemon_habitats.class, i);

        System.out.println("Pokemon habitat:" + fro.getIdentifier());

        session.getTransaction().commit();
        
        session.close();

        sf.close();

    }

    private void findAll() {

        Session session = sf.openSession();

        session.beginTransaction();

        List<Db_pokemon_habitats> fros = session.createQuery("from Db_pokemon_habitats").list();

        session.getTransaction().commit();

        System.out.println("All pokemon habitats: " + fros);
        
        session.close();

        sf.close();

    }
    
    private void gg(int i) {

        //hasieratu
        Session session = sf.openSession();

        session.beginTransaction();

        //egin nahi duguna
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);

        System.out.println("Pokemon species: " + fro.getHabitat_id().getIdentifier() + " !!!!!!!!!!!!!");

        session.getTransaction().commit();
        
        //itxi
        session.close();

        sf.close();

    }

    public static void main(String[] args) {
        HibTest froManager = new HibTest();

//        froManager.persistDb_pokemon_habitats();

//        froManager.findDb_pokemon_habitats(8);

//        froManager.findAll();

        froManager.gg(52);
        
        System.exit(0);

    }
}