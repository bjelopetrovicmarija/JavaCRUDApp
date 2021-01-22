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
public class Adresa {

    private int adresaID;
    private UlicaBroj ulicaBroj;
    private Ulica ulica;
    private String status;

    public Adresa() {
    }

    public Adresa(int adresaID, UlicaBroj ulicaBroj, Ulica ulica, String status) {
        this.adresaID = adresaID;
        this.ulicaBroj = ulicaBroj;
        this.ulica = ulica;
        this.status = status;
    }

   

    public UlicaBroj getUlicaBroj() {
        return ulicaBroj;
    }

    public void setUlicaBroj(UlicaBroj ulicaBroj) {
        this.ulicaBroj = ulicaBroj;
    }

    public int getAdresaID() {
        return adresaID;
    }

    public void setAdresaID(int adresaID) {
        this.adresaID = adresaID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Adresa other = (Adresa) obj;
        if (this.adresaID != other.adresaID) {
            return false;
        }
        return true;
    }

    public Ulica getUlica() {
        return ulica;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

    @Override
    public String toString() {
        return ulica.getNazivUlice()+" "+ulicaBroj.toString();
    }

  

}
