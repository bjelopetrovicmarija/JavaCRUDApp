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
public class StavkaProfakture {

    private Profaktura profaktura;
    private int rbStavke;
    private int kolicina;
    private Artikal artikal;
    private JedinicaMere jedinicaMere;

    public StavkaProfakture() {
    }

    public StavkaProfakture(Profaktura profaktura, int rbStavke, int kolicina, Artikal artikal, JedinicaMere jedinicaMere) {
        this.profaktura = profaktura;
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

    public Profaktura getProfaktura() {
        return profaktura;
    }

    public void setProfaktura(Profaktura profaktura) {
        this.profaktura = profaktura;
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
