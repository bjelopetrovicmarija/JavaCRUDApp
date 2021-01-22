/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dell
 */
public class StavkaKataloga {

    private int stavkaID;
    private int rbStavke;
    private Artikal artikal;
    private JedinicaMere jedinicaMere;
    private String nazivDobavljaca;
    private Katalog katalog;
    private String status;

    public StavkaKataloga() {
    }

    public StavkaKataloga(int stavkaID, int rbStavke, Artikal artikal, JedinicaMere jedinicaMere, String nazivDobavljaca, Katalog katalog, String status) {
        this.stavkaID = stavkaID;
        this.rbStavke = rbStavke;
        this.artikal = artikal;
        this.jedinicaMere = jedinicaMere;
        this.nazivDobavljaca = nazivDobavljaca;
        this.katalog = katalog;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStavkaID() {
        return stavkaID;
    }

    public void setStavkaID(int stavkaID) {
        this.stavkaID = stavkaID;
    }

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    public void setNazivDobavljaca(String nazivDobavljaca) {
        this.nazivDobavljaca = nazivDobavljaca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StavkaKataloga other = (StavkaKataloga) obj;
        if (this.stavkaID != other.stavkaID) {
            return false;
        }
        return true;
    }

    public Katalog getKatalog() {
        return katalog;
    }

    public void setKatalog(Katalog katalog) {
        this.katalog = katalog;
    }

}
