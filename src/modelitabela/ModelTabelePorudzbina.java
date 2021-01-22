/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Porudzbina;

/**
 *
 * @author Dell
 */
public class ModelTabelePorudzbina extends AbstractTableModel {

    ArrayList<Porudzbina> lista;

    public ModelTabelePorudzbina() {
        lista = new ArrayList<>();
    }

    @Override
    public int getRowCount() {

        return lista.size();

    }

    @Override
    public int getColumnCount() {

        return 9;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Porudzbina p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getNacinPorudzbine();
            case 1:
                return p.getInformacijeOPorudzbini();
            case 2:
                return p.getNacinIsporuke().getNazivNacinaIsporuke();
            case 3:
                return p.getDatum().toString();
            case 4:
                return p.getPlacanje().getNacinPlacanja();
            case 5:
                return p.getDobavljac().getNazivDobavljaca();
            case 6:
                return p.getKupac().getNazivKupca();
            case 7:
                return p.getValuta().getOznakaValute();
            case 8:
                return p.getUkupanIznos();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {

            case 0:
                return "Nacin porudzbine";
            case 1:
                return "Dodatne info";
            case 2:
                return "Isporuka";
            case 3:
                return "Datum";
            case 4:
                return "Placanje";
            case 5:
                return "Dobavljac";
            case 6:
                return "Kupac";
            case 7:
                return "Valuta";
            case 8:
                return "Ukupno";
            default:
                return "";

        }

    }

    public ArrayList<Porudzbina> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Porudzbina> lista) {
        this.lista = lista;
    }

    public Porudzbina vratiPorudzbinu(int red) {

        return lista.get(red);

    }

}
