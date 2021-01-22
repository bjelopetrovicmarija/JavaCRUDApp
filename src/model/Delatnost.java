/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Delatnost {

    private int delatnostID;
    private String nazivDelatnosti;

    public Delatnost() {
    }

    public Delatnost(int delatnostID, String nazivDelatnosti) {
        this.delatnostID = delatnostID;
        this.nazivDelatnosti = nazivDelatnosti;
    }

    public String getNazivDelatnosti() {
        return nazivDelatnosti;
    }

    public void setNazivDelatnosti(String nazivDelatnosti) {
        this.nazivDelatnosti = nazivDelatnosti;
    }

    public int getDelatnostID() {
        return delatnostID;
    }

    public void setDelatnostID(int delatnostID) {
        this.delatnostID = delatnostID;
    }

    @Override
    public String toString() {
        return nazivDelatnosti;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Delatnost other = (Delatnost) obj;
        if (this.delatnostID != other.delatnostID) {
            return false;
        }
        return true;
    }

}
