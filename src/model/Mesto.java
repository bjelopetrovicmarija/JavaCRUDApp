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
public class Mesto {

    private int mestoID;
    private String nazivMesta;
    private String status;
    private ArrayList<Ulica> ulice;

    public Mesto() {
    }

    public Mesto(int mestoID, String nazivMesta, String status, ArrayList<Ulica> ulice) {
        this.mestoID = mestoID;
        this.nazivMesta = nazivMesta;
        this.status = status;
        this.ulice = ulice;
    }

    public int getMestoID() {
        return mestoID;
    }

    public void setMestoID(int mestoID) {
        this.mestoID = mestoID;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nazivMesta;
    }

    public ArrayList<Ulica> getUlice() {
        return ulice;
    }

    public void setUlice(ArrayList<Ulica> ulice) {
        this.ulice = ulice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mesto other = (Mesto) obj;
        if (this.mestoID != other.mestoID) {
            return false;
        }
        return true;
    }

}
