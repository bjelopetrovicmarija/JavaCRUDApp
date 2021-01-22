/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.StavkaPorudzbine;

/**
 *
 * @author Dell
 */
public class ModelTabeleStavka extends AbstractTableModel {

    ArrayList<StavkaPorudzbine> lista;
    ArrayList<StavkaPorudzbine> listaObrisanih;

    public ModelTabeleStavka() {
        lista = new ArrayList();
        listaObrisanih = new ArrayList<>();

    }

    @Override
    public int getRowCount() {
        return lista.size();

    }

    @Override
    public int getColumnCount() {

        return 4;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        StavkaPorudzbine sp = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sp.getRbStavke();
            case 1:
                return sp.getArtikal();
            case 2:
                return sp.getKolicina();
            case 3:
                return sp.getJedinicaMere();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "Rb stavke";
            case 1:
                return "Artikal";
            case 2:
                return "Kolicina";
            case 3:
                return "Jedinica mere";
            default:
                return "";

        }

    }

    public ArrayList<StavkaPorudzbine> getLista() {
        return lista;
    }

    public void setLista(ArrayList<StavkaPorudzbine> lista) {
        this.lista = lista;
    }

    private void srediRedneBrojeve() {
        ArrayList<StavkaPorudzbine> listaStavki = (ArrayList) lista;
        int brojac = 1;
        for (StavkaPorudzbine st : listaStavki) {
            st.setRbStavke(brojac++);
        }

    }

    public void dodajStavku(StavkaPorudzbine sp) {
        sp.setStatus("insert");
        lista.add(sp);
        srediRedneBrojeve();
        fireTableDataChanged();

    }

    public void obrisiStavku(int red) {
        StavkaPorudzbine sp = lista.get(red);
        sp.setStatus("delete");
        listaObrisanih.add(sp);
        lista.remove(red);
        srediRedneBrojeve();
        fireTableDataChanged();

    }

    public ArrayList<StavkaPorudzbine> vratiSveStavke() {
        listaObrisanih.addAll(lista);
        return listaObrisanih;

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        if (columnIndex == 2) {
            return true;
        }
        return false;

    }

    public StavkaPorudzbine vratiStavku(int red) {

        return lista.get(red);

    }

    public void izmeniStavku(StavkaPorudzbine izmenjena, int red) {
        izmenjena.setStatus("update");
        lista.remove(red);
        lista.add(red, izmenjena);
        fireTableDataChanged();

    }

}
