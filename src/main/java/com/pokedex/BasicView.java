package com.pokedex;
 
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class BasicView {
     
    private String text = "/irudiak/pokemon/1.png";
 
    public String getText() {
        return text;
    }
    public void setText(String num) {
        this.text = "/irudiak/pokemon/"+num+".png";
    }
}