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
public class Ulica {

    private int ulicaID;
    private String nazivUlice;
    private String nazivMesta;
    private ArrayList<Adresa> adrese;
    private Mesto mesto;
    private String status;

    public Ulica() {
    }

    public Ulica(int ulicaID, String nazivUlice, String nazivMesta, ArrayList<Adresa> adrese, Mesto mesto, String status) {
        this.ulicaID = ulicaID;
        this.nazivUlice = nazivUlice;
        this.nazivMesta = nazivMesta;
        this.adrese = adrese;
        this.mesto = mesto;
        this.status = status;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Adresa> getAdrese() {
        return adrese;
    }

    public void setAdrese(ArrayList<Adresa> adrese) {
        this.adrese = adrese;
    }

    public int getUlicaID() {
        return ulicaID;
    }

    public void setUlicaID(int ulicaID) {
        this.ulicaID = ulicaID;
    }

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }

    @Override
    public String toString() {
        return nazivUlice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ulica other = (Ulica) obj;
        if (this.ulicaID != other.ulicaID) {
            return false;
        }
        return true;
    }

  

}
