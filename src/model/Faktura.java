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
public class Faktura {

    private int brojFakture;
    private double osnovica;
    private double iznosPDV;
    private double ukupanIznos;
    private Otpremnica otpremnica;
    private Mesto mesto;
    private Kupac kupac;
    private Dobavljac dobavljac;
    private Datum datumFakture;
    private Datum datumPrometa;
    private Procenat stopaPDV;
    private ArrayList<StavkaFakture> listaStavki;
    private String status;

    public Faktura() {
    }

    public Faktura(int brojFakture, double osnovica, double iznosPDV, double ukupanIznos, Otpremnica otpremnica, Mesto mesto, Kupac kupac, Dobavljac dobavljac, Datum datumFakture, Datum datumPrometa, Procenat stopaPDV, ArrayList<StavkaFakture> listaStavki, String status) {
        this.brojFakture = brojFakture;
        this.osnovica = osnovica;
        this.iznosPDV = iznosPDV;
        this.ukupanIznos = ukupanIznos;
        this.otpremnica = otpremnica;
        this.mesto = mesto;
        this.kupac = kupac;
        this.dobavljac = dobavljac;
        this.datumFakture = datumFakture;
        this.datumPrometa = datumPrometa;
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

    public int getBrojFakture() {
        return brojFakture;
    }

    public void setBrojFakture(int brojFakture) {
        this.brojFakture = brojFakture;
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

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Dobavljac getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(Dobavljac dobavljac) {
        this.dobavljac = dobavljac;
    }

    public Datum getDatumFakture() {
        return datumFakture;
    }

    public void setDatumFakture(Datum datumFakture) {
        this.datumFakture = datumFakture;
    }

    public Datum getDatumPrometa() {
        return datumPrometa;
    }

    public void setDatumPrometa(Datum datumPrometa) {
        this.datumPrometa = datumPrometa;
    }

    public Procenat getStopaPDV() {
        return stopaPDV;
    }

    public void setStopaPDV(Procenat stopaPDV) {
        this.stopaPDV = stopaPDV;
    }

    public ArrayList<StavkaFakture> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaFakture> listaStavki) {
        this.listaStavki = listaStavki;
    }

}
