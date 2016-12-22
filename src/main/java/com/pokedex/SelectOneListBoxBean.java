package com.pokedex;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SelectOneListBoxBean {

    private Pokemon pokemon;
    private List<Pokemon> pokemons;

    @ManagedProperty("#{pokemonService}")
    private PokemonService service;

    @PostConstruct
    public void init() {
        pokemons = service.getPokemons();
    }

    public Pokemon getPokemon() {
        if(pokemon != null) {
            Deiak.getInstance().id = pokemon.getId()+1;
        }
        
        return pokemon;        
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;        
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setService(PokemonService service) {
        this.service = service;
    }

    /* INFO 1 */
    public String getWeight() {
        return Integer.toString(Deiak.getInstance().getPokeWeight());
    }

    public String getHeight() {
        return Integer.toString(Deiak.getInstance().getPokeHeight());
    }

    public String getGen() {
        return Deiak.getInstance().getPokeGen();
    }

    /* INFO 2 */
    public String getGender() {
        return Integer.toString(Deiak.getInstance().getPokeGender());
    }

    public String getColour() {
        return Deiak.getInstance().getPokeColour();
    }

    public String getShape() {
        return Deiak.getInstance().getPokeShape();
    }
/*
    public String getHabitat() {
        String habitat = Deiak.getInstance().getPokeHabitat();
        if(habitat == null) {
            return "";
        }
        return habitat;
    }*/

    /* INFO 3*/
    public String getCaptureRate() {
        return Integer.toString(Deiak.getInstance().getPokeCaptureRate());
    }

    public String getHappiness() {
        return Integer.toString(Deiak.getInstance().getPokeHappiness());
    }

    public String getBaseExp() {
        return Integer.toString(Deiak.getInstance().getPokeBaseExp());
    }

    /* INFO 4 */
    public String getEgg() {
        return Deiak.getInstance().getPokeEgg();
    }

    public String getBaby() {
        int baby = Deiak.getInstance().getPokeBaby();
        if (baby == 0) {
            return "No";
        }
        return "Yes";
    }

    public String getHatch() {
        return Integer.toString(Deiak.getInstance().getPokeHatch());
    }

    public String getGrowRate() {
        return Deiak.getInstance().getPokeGrowthRate();
    }
}
