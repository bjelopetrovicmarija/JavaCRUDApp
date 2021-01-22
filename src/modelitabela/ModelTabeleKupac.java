/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Kupac;

/**
 *
 * @author Dell
 */
public class ModelTabeleKupac extends AbstractTableModel {

    private ArrayList<Kupac> lista;
    String[] kolone = {"Naziv kupca", "Mesto", "Ulica", "Adresa", "PIB", "Telefon", "Fax"};

    public ModelTabeleKupac() {
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

        Kupac kupac = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return kupac.getNazivKupca();
            case 1:
                return kupac.getMesto();
            case 2:
                return kupac.getUlica();
            case 3:
                return kupac.getAdresa();
            case 4:
                return kupac.getPib();
            case 5:
                return kupac.getTelefon();
            case 6:
                return kupac.getFax();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public ArrayList<Kupac> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Kupac> lista) {
        this.lista = lista;
    }

    public Kupac vratiKupca(int red) {
        return lista.get(red);
    }

    public void obrisi(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

    public void izmeni(int red, Kupac kupac) {

        lista.remove(red);
        lista.add(red, kupac);
        fireTableDataChanged();

    }

}
