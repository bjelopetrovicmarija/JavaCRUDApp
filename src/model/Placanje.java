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
public class Placanje  {

    private int placanjeID;
    private String nacinPlacanja;
    private String rokPlacanja;
    private Valuta valuta;

    public Placanje() {
    }

    public Placanje(int placanjeID, String nacinPlacanja, String rokPlacanja, Valuta valuta) {
        this.placanjeID = placanjeID;
        this.nacinPlacanja = nacinPlacanja;
        this.rokPlacanja = rokPlacanja;
        this.valuta = valuta;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public int getPlacanjeID() {
        return placanjeID;
    }

    public void setPlacanjeID(int placanjeID) {
        this.placanjeID = placanjeID;
    }

    public String getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(String nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public String getRokPlacanja() {
        return rokPlacanja;
    }

    public void setRokPlacanja(String rokPlacanja) {
        this.rokPlacanja = rokPlacanja;
    }

    @Override
    public String toString() {
        return nacinPlacanja;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Placanje other = (Placanje) obj;
        if (this.placanjeID != other.placanjeID) {
            return false;
        }
        return true;
    }

}
