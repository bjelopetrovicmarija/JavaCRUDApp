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
public class ModelTabeleAdresaII extends AbstractTableModel {

    ArrayList<Adresa> lista;
    ArrayList<Adresa> listaObrisanih;

    public ModelTabeleAdresaII() {
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
        Adresa a = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return a.getUlica();
            case 1:
                return a.getUlicaBroj().broj;
            case 2:
                return a.getUlicaBroj().dodatakBroju;
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
                return "Broj";
            case 2:
                return "Dodatak broju";
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

        Adresa a = lista.get(red);
        a.setStatus("delete");
        listaObrisanih.add(a);
        lista.remove(a);
        fireTableDataChanged();

    }

    public void dodajAdresu(Adresa a) {
        a.setStatus("insert");
        lista.add(a);
        fireTableDataChanged();

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 1 || columnIndex==2) {

            return true;

        }
        return false;
    }

    public ArrayList<Adresa> vratiSveAdrese() {

        listaObrisanih.addAll(lista);
        return listaObrisanih;

    }

    public void izmeni(int red, Adresa adresa) {
       adresa.setStatus("update");
       lista.remove(red);
       lista.add(adresa);
       fireTableDataChanged();
    
    
    
    }
    

}
