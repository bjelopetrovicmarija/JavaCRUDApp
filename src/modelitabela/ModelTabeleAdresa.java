/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Adresa;

/**
 *
 * @author Dell
 */
public class ModelTabeleAdresa extends AbstractTableModel {

    ArrayList<Adresa> lista;

    public ModelTabeleAdresa() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return lista.size();

    }

    @Override
    public int getColumnCount() {
        return 1;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Adresa a = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return a.toString();
            default:
                return "";
        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "Adresa";
            default:
                return "";

        }
    }

    public ArrayList<Adresa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Adresa> lista) {
        this.lista = lista;
    }

    public Adresa vratiAdresu(int red) {

        return lista.get(red);

    }

    public void obrisiAdresu(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

    public void dodajAdresu(Adresa a) {

        lista.add(a);
        fireTableDataChanged();

    }

}
