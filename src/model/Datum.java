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
public class Datum {

    private int datumID;
    private int godina;
    private int mesec;
    private int dan;

    public Datum(int datumID, int godina, int mesec, int dan) {
        this.datumID = datumID;
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
    }

    public Datum() {
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public int getDatumID() {
        return datumID;
    }

    public void setDatumID(int datumID) {
        this.datumID = datumID;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    @Override
    public String toString() {
        return dan + "." + mesec + "." + godina + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Datum other = (Datum) obj;
        if (this.datumID != other.datumID) {
            return false;
        }
        return true;
    }

}
