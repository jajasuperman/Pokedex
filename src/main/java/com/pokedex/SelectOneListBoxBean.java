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

        for (int i = 1; i <= 721; i++) {
            this.pokeList.add(new Pokemon(i, Deiak.getInstance().getPokeIzena(i)));
        }
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
        if (selectedPokemon == null) {
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
