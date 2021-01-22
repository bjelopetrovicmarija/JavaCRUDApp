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
public class StavkaFakture {

    private Faktura faktura;
    private int rbStavke;
    private int kolicina;
    private Artikal artikal;
    private JedinicaMere jedinicaMere;

    public StavkaFakture() {
    }

    public StavkaFakture(Faktura faktura, int rbStavke, int kolicina, Artikal artikal, JedinicaMere jedinicaMere) {
        this.faktura = faktura;
        this.rbStavke = rbStavke;
        this.kolicina = kolicina;
        this.artikal = artikal;
        this.jedinicaMere = jedinicaMere;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

}
