/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokedex;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Eka
 */
@ManagedBean
@SessionScoped
public class Erabiltzailea {

    private String izena;
    private String pasahitza;

    public String getIzena() {
        return this.izena;
    }

    public void setIzena(String i) {
        this.izena = i;
    }

    public String getPasahitza() {
        return this.pasahitza;
    }

    public void setPasahitza(String p) {
        this.pasahitza = p;
    }

    public String todo() {
        return this.izena + ", " + this.pasahitza;
    }

    // METODO PARA LOGEARSE ( SI TE LOGEAS VAS A LA ZERRENDA )
    
    public void logeatu() throws IOException {
        FacesContext context1 = FacesContext.getCurrentInstance();
        FacesMessage message;
        boolean logeatuta;
        String aux = "/pokemonZerrenda.xhtml";
        if (izena != null && izena.equals("admin") && pasahitza.equals("administratzailea")) {//faltan las buenas llamadas a la datu base.
            logeatuta = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ongi Etorri", izena);
            saioaGorde(izena);
        } else {// si no cumples con los requisitos a fregar, mensage de error y a correr.
            logeatuta = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Logeatzerakoan errorea", "Erabiltzaile izena edo pasahitza txarto idatzita daude");
        }
        context1.addMessage(null, message);

        if (!logeatuta) {// si fallas vuelta al login
            //aux = "logIn.xhtml";
            context1.getExternalContext().redirect(context1.getExternalContext().getRequestContextPath() + "/logIn.xhtml");
        } else {// si haciertas, se te borra lo que escribiste para que al entrar otra vez no aparezca
            izena = null;
            pasahitza = null;
        }
        
        context1.getExternalContext().redirect(context1.getExternalContext().getRequestContextPath() + aux);
//        return aux; // si lo haces bien vas a la zerrenda una vez logeado y sino pues al login a volver
        // a intentarlo.
    }
    
    // ERREGISTRATZEKO METODOA ( CAMBIA EN LOS MENSAJES QUE SE PONEN EN PANTALLA )
    // SI TE REGISTRAS VAS A LA ZERRENDA DIRECTAMENTE SALTANDOTE EL LOGIN
    
        public String erregistratu() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message;
        boolean erregistratuta;
        String aux = "pokemonZerrenda.xhtml";
        if (izena != null && pasahitza != null && pasahitza.length()> 6) {
            erregistratuta = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Ongi Etorri", izena);
            saioaGorde(izena);
            //aqui va donde se mete en la data base el izena y la pasahitza
        } else {
            erregistratuta = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Errorea Erregistratzerakoan", "Erabiltzaile izena edo pasahitza txarto idatzita daude");
        }
        FacesContext.getCurrentInstance().addMessage(null, message);

        if (!erregistratuta) {
            aux = "signUp.html";
        }
        else{
            izena = null;
            pasahitza = null;
        }
        return aux;
    }

        //METODOS DE LA SESSION CASEROS DEL TIO EKA
        
    public void saioaGorde(String p) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("user", p);
    }

    public String getSaioa() {
        FacesContext context = FacesContext.getCurrentInstance();
        String aux;
        if (context.getExternalContext().getSessionMap().get("user")==null) {
            aux = "Anonimoa";
        } 
        else {
            aux = (String) context.getExternalContext().getSessionMap().get("user");
        }
        return aux;
    }

    public String saioaItxi() {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
           return "pokemonZerrenda.xhtml";
       
     
    }
}
