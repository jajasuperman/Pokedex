package com.pokedex;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SelectOneListBoxBean {

    public List<Pokemon> pokeList;
    public String selectedPokemon;

    public SelectOneListBoxBean() {
        
        selectedPokemon = null;
        
        this.pokeList = new ArrayList<>();
        this.pokeList.add(new Pokemon(1, "Bulbasaur"));
        this.pokeList.add(new Pokemon(2, "Ivysaur"));
        this.pokeList.add(new Pokemon(3, "Venusaur"));
        this.pokeList.add(new Pokemon(4, "Charmander"));
        this.pokeList.add(new Pokemon(5, "Charmeleon"));
        this.pokeList.add(new Pokemon(6, "Charizard"));
    }

    public List<Pokemon> getPokeList() {
        return pokeList;
    }

    public void setPokeList(List<Pokemon> pPokeList) {
        this.pokeList = pPokeList;
    }

    public String getSelectedPokemon() {
        return selectedPokemon;
    }

    public String getSelectedPokemonName() {
        if(selectedPokemon == null) {
            return "";
        }
        int select = Integer.parseInt(selectedPokemon) - 1;
        return pokeList.get(select).getName();
    }
   
    public void setSelectedPokemon(String pSelectedPokemon) {
        for (Pokemon aux : pokeList) {
            if (aux.toString().equals(pSelectedPokemon)) {
                this.selectedPokemon = String.valueOf(aux.getId());
                break;
            }
        }
    }
}
