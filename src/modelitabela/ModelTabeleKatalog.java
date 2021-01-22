/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Katalog;
import model.StavkaKataloga;

/**
 *
 * @author Dell
 */
public class ModelTabeleKatalog extends AbstractTableModel {

    ArrayList<Katalog> lista;
    Katalog k;

    public ModelTabeleKatalog() {
        lista = new ArrayList<>();
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

        Katalog k = lista.get(rowIndex);
        String artikli = "";
        ArrayList<StavkaKataloga> stavke = kontrolor.Kontroler.getInstanca().vratiStavkeZaKatalog(k);
        k.setListaStavki(stavke);
        switch (columnIndex) {

            case 0:
                return k.getKatalogID();
            case 1:
                return k.getBrojStranica();
            case 2:
                for (StavkaKataloga s : k.getListaStavki()) {
                    artikli += s.getArtikal().getNazivArtikla() + ", ";

                }
                return artikli;
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "ID kataloga";
            case 1:
                return "Broj stranica";
            case 2:
                return "Stavke kataloga";
            default:
                return "";

        }
    }

    public ArrayList<Katalog> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Katalog> lista) {
        this.lista = lista;
    }

    public void dodajKatalog(Katalog k) {
        this.k = k;
        lista.add(k);
        fireTableDataChanged();

    }

    public Katalog vratiKatalog(int red) {

        return lista.get(red);
    }

    public void obrisiKatalog(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

}
