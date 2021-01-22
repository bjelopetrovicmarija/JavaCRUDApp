/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.StavkaKataloga;
import model.StavkaPorudzbine;

/**
 *
 * @author Dell
 */
public class ModelTabeleStavkaKataloga extends AbstractTableModel {

    ArrayList<StavkaKataloga> lista;
    ArrayList<StavkaKataloga> listaObrisanih;
    String[] kolone = {"Rb Stavke", "Artikal", "Jedinica mere", "Naziv dobavljaca"};

    public ModelTabeleStavkaKataloga() {
        lista = new ArrayList<>();
        listaObrisanih = new ArrayList<>();
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
        StavkaKataloga sk = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return sk.getRbStavke();
            case 1:
                return sk.getArtikal();
            case 2:
                return sk.getJedinicaMere();
            case 3:
                return sk.getNazivDobavljaca();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        return kolone[column];

    }

    public ArrayList<StavkaKataloga> getLista() {
        return lista;
    }

    public void setLista(ArrayList<StavkaKataloga> lista) {
        this.lista = lista;
    }

    private void srediRedneBrojeve() {
        ArrayList<StavkaKataloga> listaStavki = (ArrayList) lista;
        int brojac = 1;
        for (StavkaKataloga st : listaStavki) {
            st.setRbStavke(brojac++);
        }

    }

    public void dodajStavku(StavkaKataloga sp) {
        sp.setStatus("insert");
        lista.add(sp);
        srediRedneBrojeve();
        fireTableDataChanged();

    }

    public void obrisiStavku(int red) {
        StavkaKataloga sk = lista.get(red);
        sk.setStatus("delete");
        listaObrisanih.add(sk);
        lista.remove(red);
        srediRedneBrojeve();
        fireTableDataChanged();

    }

    public ArrayList<StavkaKataloga> vratiSveStavke() {

        listaObrisanih.addAll(lista);
        return listaObrisanih;

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        if (columnIndex == 3) {
            return true;
        }
        return false;

    }

    public StavkaKataloga vratiStavku(int red) {

        return lista.get(red);

    }

    public void izmeniStavku(StavkaKataloga s, int red) {

        s.setStatus("update");
        lista.remove(red);
        lista.add(red, s);
        fireTableDataChanged();

    }

}
