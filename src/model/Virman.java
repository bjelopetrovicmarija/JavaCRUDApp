/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Virman {
    private int brojVirmana;
    private double iznos;
    private String svrhaUplate;
    private Placanje placanje;
    private Datum datumUplate;
    private Dobavljac dobavljac;
    private Kupac kupac;
    private Valuta valuta;
    private Profaktura profaktura;

    public Virman() {
    }

    public Virman(int brojVirmana, double iznos, String svrhaUplate, Placanje placanje, Datum datumUplate, Dobavljac dobavljac, Kupac kupac, Valuta valuta, Profaktura profaktura) {
        this.brojVirmana = brojVirmana;
        this.iznos = iznos;
        this.svrhaUplate = svrhaUplate;
        this.placanje = placanje;
        this.datumUplate = datumUplate;
        this.dobavljac = dobavljac;
        this.kupac = kupac;
        this.valuta = valuta;
        this.profaktura = profaktura;
    }

    public Profaktura getProfaktura() {
        return profaktura;
    }

    public void setProfaktura(Profaktura profaktura) {
        this.profaktura = profaktura;
    }

    public int getBrojVirmana() {
        return brojVirmana;
    }

    public void setBrojVirmana(int brojVirmana) {
        this.brojVirmana = brojVirmana;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public Placanje getPlacanje() {
        return placanje;
    }

    public void setPlacanje(Placanje placanje) {
        this.placanje = placanje;
    }

    public Datum getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Datum datumUplate) {
        this.datumUplate = datumUplate;
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

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
    
    
    
    
    
    
}
