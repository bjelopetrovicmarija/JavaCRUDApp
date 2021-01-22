/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Dobavljac;

/**
 *
 * @author Dell
 */
public class ModelTabeleDobavljac extends AbstractTableModel {

    ArrayList<Dobavljac> lista;

    public ModelTabeleDobavljac() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {

        return lista.size();

    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Dobavljac d = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return d.getNazivDobavljaca();
            case 1:
                return d.getPib();
            case 2:
                return d.getTelefon();
            case 3:
                return d.getFax();
            case 4:
                return d.getMail();
            case 5:
                return d.getDelatnost();
            case 6:
                return d.getTekuciRacun();
            case 7:
                return d.getAdresa().getUlicaBroj().toString();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "Naziv dobavljaca";
            case 1:
                return "PIB";
            case 2:
                return "Telefon";
            case 3:
                return "Fax";
            case 4:
                return "Mail";
            case 5:
                return "Delatnost";
            case 6:
                return "Tekuci racun";
            case 7:
                return "Adresa";
            default:
                return "";

        }

    }

    public ArrayList<Dobavljac> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Dobavljac> lista) {
        this.lista = lista;
    }

    public Dobavljac vratiDobavljaca(int red) {

        return lista.get(red);

    }

    public void obrisi(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

}
