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

        pokeList = new ArrayList<>();

        for (int i = 1; i <= 151; i++) {
            String izena = Deiak.getInstance().getPokeIzena(i);
            izena = izena.substring(0, 1).toUpperCase() + izena.substring(1);
            this.pokeList.add(new Pokemon(i, izena));
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
        
        Deiak.getInstance().id = Integer.parseInt(selectedPokemon);
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
    public String getHabitat() {
        return Deiak.getInstance().getPokeHabitat();
    }
    
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
        if(baby == 0) {
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
    
    //EVOLUTION
    
    public String getEvolutions(){
        return Deiak.getInstance().getPokeEvolution();
    }
}
