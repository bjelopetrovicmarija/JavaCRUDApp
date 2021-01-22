/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Dobavljac {

    private int dobavljacID;
    private String nazivDobavljaca;
    private String pib;
    private String telefon;
    private String fax;
    private String mail;
    private TekuciRacun tekuciRacun;
    private Delatnost delatnost;
    private Mesto mesto;
    private Ulica ulica;
    private Adresa adresa;
    private ArrayList<Katalog> listaKataloga;
    private String brojRacuna;

    public Dobavljac() {
    }

    public Dobavljac(int dobavljacID, String nazivDobavljaca, String pib, String telefon, String fax, String mail, TekuciRacun tekuciRacun, Delatnost delatnost, Mesto mesto, Ulica ulica, Adresa adresa, ArrayList<Katalog> listaKataloga, String brojRacuna) {
        this.dobavljacID = dobavljacID;
        this.nazivDobavljaca = nazivDobavljaca;
        this.pib = pib;
        this.telefon = telefon;
        this.fax = fax;
        this.mail = mail;
        this.tekuciRacun = tekuciRacun;
        this.delatnost = delatnost;
        this.mesto = mesto;
        this.ulica = ulica;
        this.adresa = adresa;
        this.listaKataloga = listaKataloga;
        this.brojRacuna = brojRacuna;
        
    }

   

    public int getDobavljacID() {
        return dobavljacID;
    }

    public void setDobavljacID(int dobavljacID) {
        this.dobavljacID = dobavljacID;
    }

    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    public void setNazivDobavljaca(String nazivDobavljaca) {
        this.nazivDobavljaca = nazivDobavljaca;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public TekuciRacun getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(TekuciRacun tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    public Delatnost getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(Delatnost delatnost) {
        this.delatnost = delatnost;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Ulica getUlica() {
        return ulica;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return nazivDobavljaca;
    }

    public ArrayList<Katalog> getListaKataloga() {
        return listaKataloga;
    }

    public void setListaKataloga(ArrayList<Katalog> listaKataloga) {
        this.listaKataloga = listaKataloga;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dobavljac other = (Dobavljac) obj;
        if (this.dobavljacID != other.dobavljacID) {
            return false;
        }
        return true;
    }
    
    
    
    

 

}
