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
public class Katalog {

    private int katalogID;
    private int brojStranica;
    private ArrayList<StavkaKataloga> listaStavki;
    private Dobavljac dobavljac;
    private String status;

    public Katalog() {
    }

    public Katalog(int katalogID, int brojStranica, ArrayList<StavkaKataloga> listaStavki, Dobavljac dobavljac, String status) {
        this.katalogID = katalogID;
        this.brojStranica = brojStranica;
        this.listaStavki = listaStavki;
        this.dobavljac = dobavljac;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getKatalogID() {
        return katalogID;
    }

    public void setKatalogID(int katalogID) {
        this.katalogID = katalogID;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int brojStranica) {
        this.brojStranica = brojStranica;
    }

    public ArrayList<StavkaKataloga> getListaStavki() {
        return listaStavki;
    }

    public void setListaStavki(ArrayList<StavkaKataloga> listaStavki) {
        this.listaStavki = listaStavki;
    }

    public Dobavljac getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(Dobavljac dobavljac) {
        this.dobavljac = dobavljac;
    }

}
