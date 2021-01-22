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
public class Porudzbina {

    private int porudzbinaID;
    private String nacinPorudzbine;
    private String informacijeOPorudzbini;
    private NacinIsporuke nacinIsporuke;
    private Datum datum;
    private Placanje placanje;
    private Dobavljac dobavljac;
    private Kupac kupac;
    private ArrayList<StavkaPorudzbine> listaStavki;
    private double ukupanIznos;
    private Valuta valuta;

    public Porudzbina() {
    }

    public Porudzbina(int porudzbinaID, String nacinPorudzbine, String informacijeOPorudzbini, NacinIsporuke nacinIsporuke, Datum datum, Placanje placanje, Dobavljac dobavljac, Kupac kupac, ArrayList<StavkaPorudzbine> listaStavki, double ukupanIznos, Valuta valuta) {
        this.porudzbinaID = porudzbinaID;
        this.nacinPorudzbine = nacinPorudzbine;
        this.informacijeOPorudzbini = informacijeOPorudzbini;
        this.nacinIsporuke = nacinIsporuke;
        this.datum = datum;
        this.placanje = placanje;
        this.dobavljac = dobavljac;
        this.kupac = kupac;
        this.listaStavki = listaStavki;
        this.ukupanIznos = ukupanIznos;
        this.valuta = valuta;
    }

    public int getPorudzbinaID() {
        return porudzbinaID;
    }

    public void setPorudzbinaID(int porudzbinaID) {
        this.porudzbinaID = porudzbinaID;
    }

    public String getNacinPorudzbine() {
        return nacinPorudzbine;
    }

    public void setNacinPorudzbine(String nacinPorudzbine) {
        this.nacinPorudzbine = nacinPorudzbine;
    }

    public String getInformacijeOPorudzbini() {
        return informacijeOPorudzbini;
    }

    public void setInformacijeOPorudzbini(String informacijeOPorudzbini) {
        this.informacijeOPorudzbini = informacijeOPorudzbini;
    }

    public NacinIsporuke getNacinIsporuke() {
        return nacinIsporuke;
    }

    public void setNacinIsporuke(NacinIsporuke nacinIsporuke) {
        this.nacinIsporuke = nacinIsporuke;
    }

    public Datum getDatum() {
        return datum;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public Placanje getPlacanje() {
        return placanje;
    }

    public void setPlacanje(Placanje placanje) {
        this.placanje = placanje;
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

    public ArrayList<StavkaPorudzbine> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaPorudzbine> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

}
