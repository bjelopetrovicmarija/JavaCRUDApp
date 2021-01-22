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
public class NacinIsporuke {
    
    private int nacinIsporukeID;
    private String nazivNacinaIsporuke;

    public NacinIsporuke() {
    }

    public NacinIsporuke(int nacinIsporukeID, String nazivNacinaIsporuke) {
        this.nacinIsporukeID = nacinIsporukeID;
        this.nazivNacinaIsporuke = nazivNacinaIsporuke;
    }

    public String getNazivNacinaIsporuke() {
        return nazivNacinaIsporuke;
    }

    public void setNazivNacinaIsporuke(String nazivNacinaIsporuke) {
        this.nazivNacinaIsporuke = nazivNacinaIsporuke;
    }

    public int getNacinIsporukeID() {
        return nacinIsporukeID;
    }

    public void setNacinIsporukeID(int nacinIsporukeID) {
        this.nacinIsporukeID = nacinIsporukeID;
    }

    @Override
    public String toString() {
        return nazivNacinaIsporuke;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NacinIsporuke other = (NacinIsporuke) obj;
        if (this.nacinIsporukeID != other.nacinIsporukeID) {
            return false;
        }
        return true;
    }

  
    
    
    
    
    
    
}
