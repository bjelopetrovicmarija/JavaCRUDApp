/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;
import model.Cena;

/**
 *
 * @author Dell
 */
public class ModelTabeleCena extends AbstractTableModel {

    ArrayList<Cena> lista;
    ArrayList<Cena> listaObrisanih;

    public ModelTabeleCena() {
        lista = new ArrayList<>();
        listaObrisanih = new ArrayList<>();
    }

    @Override
    public int getRowCount() {

        return lista.size();

    }

    @Override
    public int getColumnCount() {

        return 3;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Cena c = lista.get(rowIndex);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        switch (columnIndex) {

            case 0:
                return sdf.format(c.getDatumOd());
            case 1:
                return c.getIznos();
            case 2:
                return c.getValuta().getOznakaValute();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "Datum od";
            case 1:
                return "Iznos";
            case 2:
                return "Valuta";
            default:
                return "";

        }

    }

    public ArrayList<Cena> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cena> lista) {
        this.lista = lista;
    }

    public void dodajCenu(Cena cena) {
        cena.setStatus("insert");
        lista.add(cena);
        fireTableDataChanged();

    }

    public void obrisiCenu(int red) {
        Cena c = lista.get(red);
        c.setStatus("delete");
        listaObrisanih.add(c);
        lista.remove(red);
        fireTableDataChanged();

    }

    public Cena vratiCenu(int red) {

        return lista.get(red);

    }

    public ArrayList<Cena> vratiSveCene() {
        for (Cena c : lista) {

            if (c.getStatus() == null) {
                c.setStatus("");
            }

        }

        lista.addAll(listaObrisanih);
        return lista;

    }

    public void izmeniCenu(Cena c, int red) {
        c.setStatus("update");
        lista.remove(red);
        lista.add(red, c);
        fireTableDataChanged();

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        if (columnIndex == 1) {

            return true;

        }
        return false;

    }

}
