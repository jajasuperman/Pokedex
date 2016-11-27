package com.pokedex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class SelectOneListBoxBean {

    public List<Pokemon> pokeList;
    public String selectedPokemon;

    public SelectOneListBoxBean() {
        this.pokeList = new ArrayList<Pokemon>();
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
        return Integer.toString(Integer.parseInt(selectedPokemon));
    }

    public void setSelectedPokemon(String pSelectedPokemon) {
        for (Pokemon aux : pokeList) {
            if (aux.toString().equals(pSelectedPokemon)) {
                this.selectedPokemon = String.valueOf(aux.getId());
                break;
            }
        }
    }

    public String submitTraining() {
        return "selectedTraining";
    }
}
