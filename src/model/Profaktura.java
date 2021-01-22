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
public class Profaktura {

    private int brojProfakture;
    private double osnovica;
    private double iznosPDV;
    private double ukupanIznos;
    private Datum datumProfakture;
    private Porudzbina porudzbina;
    private Dobavljac dobavljac;
    private Kupac kupac;
    private Procenat stopaPDV;
    private ArrayList<StavkaProfakture> listaStavki;
    private String status;

    public Profaktura() {
    }

    public Profaktura(int brojProfakture, double osnovica, double iznosPDV, double ukupanIznos, Datum datumProfakture, Porudzbina porudzbina, Dobavljac dobavljac, Kupac kupac, Procenat stopaPDV, ArrayList<StavkaProfakture> listaStavki, String status) {
        this.brojProfakture = brojProfakture;
        this.osnovica = osnovica;
        this.iznosPDV = iznosPDV;
        this.ukupanIznos = ukupanIznos;
        this.datumProfakture = datumProfakture;
        this.porudzbina = porudzbina;
        this.dobavljac = dobavljac;
        this.kupac = kupac;
        this.stopaPDV = stopaPDV;
        this.listaStavki = listaStavki;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBrojProfakture() {
        return brojProfakture;
    }

    public void setBrojProfakture(int brojProfakture) {
        this.brojProfakture = brojProfakture;
    }

    public double getOsnovica() {
        return osnovica;
    }

    public void setOsnovica(double osnovica) {
        this.osnovica = osnovica;
    }

    public double getIznosPDV() {
        return iznosPDV;
    }

    public void setIznosPDV(double iznosPDV) {
        this.iznosPDV = iznosPDV;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public Datum getDatumProfakture() {
        return datumProfakture;
    }

    public void setDatumProfakture(Datum datumProfakture) {
        this.datumProfakture = datumProfakture;
    }

    public Porudzbina getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Porudzbina porudzbina) {
        this.porudzbina = porudzbina;
    }

    public Dobavljac getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(Dobavljac dobavljac) {
        this.dobavljac = dobavljac;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public ArrayList<StavkaProfakture> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaProfakture> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public Procenat getStopaPDV() {
        return stopaPDV;
    }

    public void setStopaPDV(Procenat stopaPDV) {
        this.stopaPDV = stopaPDV;
    }

}
