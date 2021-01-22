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
public class Artikal {

    private int artikalID;
    private String nazivArtikla;
    private String opisArtikla;
    private ArrayList<Cena> cene;
    private double aktuelnaCena;

    public int getArtikalID() {
        return artikalID;
    }

    public void setArtikalID(int artikalID) {
        this.artikalID = artikalID;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public String getOpisArtikla() {
        return opisArtikla;
    }

    public void setOpisArtikla(String opisArtikla) {
        this.opisArtikla = opisArtikla;
    }

    public ArrayList<Cena> getCene() {
        return cene;
    }

    public void setCene(ArrayList<Cena> cene) {
        this.cene = cene;
    }

    public Artikal() {
    }

    public Artikal(int artikalID, String nazivArtikla, String opisArtikla, ArrayList<Cena> cene, double aktuelnaCena) {
        this.artikalID = artikalID;
        this.nazivArtikla = nazivArtikla;
        this.opisArtikla = opisArtikla;
        this.cene = cene;
        this.aktuelnaCena = aktuelnaCena;
    }

    @Override
    public String toString() {
        return nazivArtikla;
    }

    public double getAktuelnaCena() {
        return aktuelnaCena;
    }

    public void setAktuelnaCena(double aktuelnaCena) {
        this.aktuelnaCena = aktuelnaCena;
    }

}
