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
public class Valuta{

    private int valutaID;
    private String nazivValute;
    private String oznakaValute;

    public int getValutaID() {
        return valutaID;
    }

    public void setValutaID(int valutaID) {
        this.valutaID = valutaID;
    }

    public String getNazivValute() {
        return nazivValute;
    }

    public void setNazivValute(String nazivValute) {
        this.nazivValute = nazivValute;
    }

    public String getOznakaValute() {
        return oznakaValute;
    }

    public void setOznakaValute(String oznakaValute) {
        this.oznakaValute = oznakaValute;
    }

    public Valuta() {
    }

    public Valuta(int valutaID, String nazivValute, String oznakaValute) {
        this.valutaID = valutaID;
        this.nazivValute = nazivValute;
        this.oznakaValute = oznakaValute;
    }

    @Override
    public String toString() {
        return oznakaValute;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Valuta other = (Valuta) obj;
        if (this.valutaID != other.valutaID) {
            return false;
        }
        return true;
    }

   
    
    
    

}
