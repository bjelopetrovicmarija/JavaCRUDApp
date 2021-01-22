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
public class JedinicaMere {

    private int jmID;
    private String nazivJM;

    public JedinicaMere(int jmID, String nazivJM) {
        this.jmID = jmID;
        this.nazivJM = nazivJM;
    }

    public JedinicaMere() {
    }

    public int getJmID() {
        return jmID;
    }

    public void setJmID(int jmID) {
        this.jmID = jmID;
    }

    public String getNazivJM() {
        return nazivJM;
    }

    public void setNazivJM(String nazivJM) {
        this.nazivJM = nazivJM;
    }

    @Override
    public String toString() {
        return nazivJM;
    }

}
