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
public class StavkaOtpremnice {

    private Otpremnica otpremnica;
    private int rbStavke;
    private int otpremljenaKolicina;
    private Artikal artikal;
    private JedinicaMere jedinicaMere;

    public StavkaOtpremnice() {
    }

    public StavkaOtpremnice(Otpremnica otpremnica, int rbStavke, int otpremljenaKolicina, Artikal artikal, JedinicaMere jedinicaMere) {
        this.otpremnica = otpremnica;
        this.rbStavke = rbStavke;
        this.otpremljenaKolicina = otpremljenaKolicina;
        this.artikal = artikal;
        this.jedinicaMere = jedinicaMere;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public int getRbStavke() {
        return rbStavke;
    }

    public void setRbStavke(int rbStavke) {
        this.rbStavke = rbStavke;
    }

    public int getOtpremljenaKolicina() {
        return otpremljenaKolicina;
    }

    public void setOtpremljenaKolicina(int otpremljenaKolicina) {
        this.otpremljenaKolicina = otpremljenaKolicina;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

}
