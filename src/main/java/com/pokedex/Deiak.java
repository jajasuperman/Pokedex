package com.pokedex;

import com.pokedex.db.*;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@ManagedBean
public class Deiak {

    private SessionFactory sf = null;
    private Session session;

    public int id = 1;

    private static Deiak instance = null;

    protected Deiak() {
        hasieratu();
    }

    public static Deiak getInstance() {
        if (instance == null) {
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

    public String getPokeGen() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getGeneration_id().getIdentifier();
    }

    public int getPokeWeight() {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, id);
        return fro.getWeight();
    }

    public int getPokeHeight() {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, id);
        return fro.getHeight();
    }

    public String getPokeColour() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getColor_id().getIdentifier();
    }

    public String getPokeShape() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getShape_id().getIdentifier();
    }

    public int getPokeGender() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getGender_rate();
    }

    public String getPokeHabitat() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        Db_pokemon_habitats habitat = fro.getHabitat_id();
        if (habitat == null) {
            return "-";
        }
        return habitat.getIdentifier();
    }

    public int getPokeCaptureRate() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getCapture_rate();
    }

    public int getPokeHappiness() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getBase_happiness();
    }

    public int getPokeBaseExp() {
        Db_pokemon fro = (Db_pokemon) session.load(Db_pokemon.class, id);
        return fro.getBase_experience();
    }

    public int getPokeHatch() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getHatch_counter();
    }

    public String getPokeGrowthRate() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getGrowth_rate_id().getIdentifier();
    }

    public int getPokeBaby() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        return fro.getIs_baby();
    }

    public String getPokeEgg() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);

        String eggs = "";

        Iterator<Db_egg_groups> ema = fro.getEgg_group_id().iterator();

        while (ema.hasNext()) {
            eggs = eggs + ema.next().getIdentifier() + " ";
        }

        return eggs;
    }

    public String getPokeEvolution() {
        Db_pokemon_species fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, id);
        int aux, ken, max;
        String evo = "";
        aux = fro.getEvolution_chain_id();
        //begirada bat eman pls;
        switch (id) {
            case 1:
                ken = 0;
                max = 2;
                break;
            case 2:
                ken = 1;
                max = 2;
                break;
            case 720:
                ken = 2;
                max = 1;
                break;
            case 721:
                ken = 2;
                max = 0;
                break;
            default:
                ken = 2;
                max = 2;
                break;
        }
        for (int i = (id - ken); i <= (id + max); i++) {
            fro = (Db_pokemon_species) session.load(Db_pokemon_species.class, i);
            if (fro.getEvolution_chain_id() == aux) {
                evo = evo + " " + fro.getIdentifier() + " ";
            }
        }

        return evo;
    }

    public String getPokeType1() {
        Db_pokemon_types fro = (Db_pokemon_types) Deiak.getInstance().session.load(Db_pokemon_types.class, new Db_pokemon_types_PK(id, 1));
        return fro.getType_id().getIdentifier();
    }

    public int getPokeHP() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 1));
        return fro.getBase_stat();
    }

    public int getPokeAttack() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 2));
        return fro.getBase_stat();
    }

    public int getPokeDefense() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 3));
        return fro.getBase_stat();
    }

    public int getPokeSpeed() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 4));
        return fro.getBase_stat();
    }

    public int getPokeSpAtk() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 5));
        return fro.getBase_stat();
    }

    public int getPokeSpDef() {
        Db_pokemon_stats fro = (Db_pokemon_stats) Deiak.getInstance().session.load(Db_pokemon_stats.class, new Db_pokemon_stats_PK(id, 6));
        return fro.getBase_stat();
    }
    
    public static void main(String[] args) {

        Deiak.getInstance();

        System.out.println("Yee");

        System.exit(0);

    }
}
