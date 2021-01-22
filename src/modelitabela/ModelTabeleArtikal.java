/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Artikal;

/**
 *
 * @author Dell
 */
public class ModelTabeleArtikal extends AbstractTableModel {

    ArrayList<Artikal> lista;
    String[] kolone = {"ID artikla", "Naziv artikla", "Opis artikla", "Aktuelna cena"};

    public ModelTabeleArtikal() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {

        return lista.size();

    }

    @Override
    public int getColumnCount() {

        return kolone.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Artikal artikal = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return artikal.getArtikalID();
            case 1:
                return artikal.getNazivArtikla();
            case 2:
                return artikal.getOpisArtikla();
            case 3:
                return artikal.getAktuelnaCena();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public ArrayList<Artikal> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Artikal> lista) {
        this.lista = lista;
    }

    public Artikal vratiArtikal(int red) {

        return lista.get(red);
    }

    public void obrisiArtikal(int red) {
    
        lista.remove(red);
        fireTableDataChanged();

    }

}