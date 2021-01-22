/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Ulica;

/**
 *
 * @author Dell
 */
public class ModelTabeleUlica extends AbstractTableModel {

    ArrayList<Ulica> lista;

    public ModelTabeleUlica() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {

        return lista.size();

    }

    @Override
    public int getColumnCount() {

        return 2;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Ulica u = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getNazivUlice();
            case 1:
                return u.getNazivMesta();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "Ulica";
            case 1:
                return "Mesto";
            default:
                return "";

        }

    }

    public Ulica vratiUlicu(int red) {

        return lista.get(red);

    }

    public void obrisiUlicu(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

    public ArrayList<Ulica> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ulica> lista) {
        this.lista = lista;
    }

}
