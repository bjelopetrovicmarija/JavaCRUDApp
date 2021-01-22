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
public class TekuciRacun {

    private int tekuciRacunID;
    private String brojRacuna;

    public TekuciRacun() {
    }

    public TekuciRacun(int tekuciRacunID, String brojRacuna) {
        this.tekuciRacunID = tekuciRacunID;
        this.brojRacuna = brojRacuna;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public int getTekuciRacunID() {
        return tekuciRacunID;
    }

    public void setTekuciRacunID(int tekuciRacunID) {
        this.tekuciRacunID = tekuciRacunID;
    }

    @Override
    public String toString() {
        return brojRacuna;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TekuciRacun other = (TekuciRacun) obj;
        if (this.tekuciRacunID != other.tekuciRacunID) {
            return false;
        }
        return true;
    }

}
