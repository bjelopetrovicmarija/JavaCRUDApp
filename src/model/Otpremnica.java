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
public class Otpremnica {

    private int brojOtpremnice;
    private String napomena;
    private Datum datumOtpremnice;
    private Datum zeljeniTermin;
    private Dobavljac dobavljac;
    private Porudzbina porudzbina;
    private Zaposleni odobrio;
    private Zaposleni primio;
    private ArrayList<StavkaOtpremnice> listaStavki;

    public Otpremnica() {
    }

    public Otpremnica(int brojOtpremnice, String napomena, Datum datumOtpremnice, Datum zeljeniTermin, Dobavljac dobavljac, Porudzbina porudzbina, Zaposleni odobrio, Zaposleni primio, ArrayList<StavkaOtpremnice> listaStavki) {
        this.brojOtpremnice = brojOtpremnice;
        this.napomena = napomena;
        this.datumOtpremnice = datumOtpremnice;
        this.zeljeniTermin = zeljeniTermin;
        this.dobavljac = dobavljac;
        this.porudzbina = porudzbina;
        this.odobrio = odobrio;
        this.primio = primio;
        this.listaStavki = listaStavki;
    }

    public int getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(int brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Datum getDatumOtpremnice() {
        return datumOtpremnice;
    }

    public void setDatumOtpremnice(Datum datumOtpremnice) {
        this.datumOtpremnice = datumOtpremnice;
    }

    public Datum getZeljeniTermin() {
        return zeljeniTermin;
    }

    public void setZeljeniTermin(Datum zeljeniTermin) {
        this.zeljeniTermin = zeljeniTermin;
    }

    public Dobavljac getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(Dobavljac dobavljac) {
        this.dobavljac = dobavljac;
    }

    public Porudzbina getPorudzbina() {
        return porudzbina;
    }

    public void setPorudzbina(Porudzbina porudzbina) {
        this.porudzbina = porudzbina;
    }

    public Zaposleni getOdobrio() {
        return odobrio;
    }

    public void setOdobrio(Zaposleni odobrio) {
        this.odobrio = odobrio;
    }

    public Zaposleni getPrimio() {
        return primio;
    }

    public void setPrimio(Zaposleni primio) {
        this.primio = primio;
    }

    @Override
    public String toString() {
        return brojOtpremnice + "";

    }

    public ArrayList<StavkaOtpremnice> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaOtpremnice> listaStavki) {
        this.listaStavki = listaStavki;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Otpremnica other = (Otpremnica) obj;
        if (this.brojOtpremnice != other.brojOtpremnice) {
            return false;
        }
        return true;
    }

}
