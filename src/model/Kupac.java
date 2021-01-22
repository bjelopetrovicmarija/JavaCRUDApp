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
public class Kupac  {

    private int sifraKupca;
    private String nazivKupca;
    private Mesto mesto;
    private Ulica ulica;
    private Adresa adresa;
    private String pib;
    private String telefon;
    private String fax;
    private String status;

    public Kupac() {
    }

    public Kupac(int sifraKupca, String nazivKupca, Mesto mesto, Ulica ulica, Adresa adresa, String pib, String telefon, String fax, String status) {
        this.sifraKupca = sifraKupca;
        this.nazivKupca = nazivKupca;
        this.mesto = mesto;
        this.ulica = ulica;
        this.adresa = adresa;
        this.pib = pib;
        this.telefon = telefon;
        this.fax = fax;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSifraKupca() {
        return sifraKupca;
    }

    public void setSifraKupca(int sifraKupca) {
        this.sifraKupca = sifraKupca;
    }

    public String getNazivKupca() {
        return nazivKupca;
    }

    public void setNazivKupca(String nazivKupca) {
        this.nazivKupca = nazivKupca;
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

    @Override
    public String toString() {
        return nazivKupca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kupac other = (Kupac) obj;
        if (this.sifraKupca != other.sifraKupca) {
            return false;
        }
        return true;
    }

}
