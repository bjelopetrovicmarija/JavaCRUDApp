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
public class Zaposleni {

    private int zaposleniID;
    private String imePrezime;
    private String brojLK;
    private Sektor sektor;

    public Zaposleni() {
    }

    public Zaposleni(int zaposleniID, String imePrezime, String brojLK, Sektor sektor) {
        this.zaposleniID = zaposleniID;
        this.imePrezime = imePrezime;
        this.brojLK = brojLK;
        this.sektor = sektor;
    }

    public Sektor getSektor() {
        return sektor;
    }

    public void setSektor(Sektor sektor) {
        this.sektor = sektor;
    }

    public int getZaposleniID() {
        return zaposleniID;
    }

    public void setZaposleniID(int zaposleniID) {
        this.zaposleniID = zaposleniID;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    @Override
    public String toString() {
        return imePrezime;
    }

}
