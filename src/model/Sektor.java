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
public class Sektor {

    private int sifraSektora;
    private String nazivSektora;

    public Sektor() {
    }

    public Sektor(int sifraSektora, String nazivSektora) {
        this.sifraSektora = sifraSektora;
        this.nazivSektora = nazivSektora;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public int getSifraSektora() {
        return sifraSektora;
    }

    public void setSifraSektora(int sifraSektora) {
        this.sifraSektora = sifraSektora;
    }

    @Override
    public String toString() {
        return nazivSektora;
    }

}
