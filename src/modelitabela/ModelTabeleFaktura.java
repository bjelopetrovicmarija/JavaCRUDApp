/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Faktura;
import model.Procenat;

/**
 *
 * @author Dell
 */
public class ModelTabeleFaktura extends AbstractTableModel {

    ArrayList<Faktura> lista;
    String[] kolone = {"Osnovica", "PDV stopa", "Iznos PDV", "Ukupan iznos", "Otpremnica", "Mesto", "Kupac", "Dobavljac", "Datum fakture", "Datum prometa"};

    public ModelTabeleFaktura() {
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

        Faktura f = lista.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return f.getOsnovica();
            case 1:
                return f.getStopaPDV().toString();
            case 2:
                return f.getIznosPDV();
            case 3:
                return f.getUkupanIznos();
            case 4:
                return f.getOtpremnica();
            case 5:
                return f.getMesto();
            case 6:
                return f.getKupac();
            case 7:
                return f.getDobavljac();
            case 8:
                return f.getDatumFakture();
            case 9:
                return f.getDatumPrometa();
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        return kolone[column];

    }

    public ArrayList<Faktura> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Faktura> lista) {
        this.lista = lista;
    }

    public Faktura vratiFakturu(int red) {

        return lista.get(red);

    }

    public void obrisi(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

}
