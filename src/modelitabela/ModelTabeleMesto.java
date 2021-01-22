/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelitabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import kontrolor.Kontroler;
import model.Mesto;
import model.Ulica;

/**
 *
 * @author Dell
 */
public class ModelTabeleMesto extends AbstractTableModel {

    ArrayList<Mesto> lista;

    public ModelTabeleMesto() {
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

        Mesto m = lista.get(rowIndex);
        ArrayList<Ulica> ulice = Kontroler.getInstanca().vratiUliceZaMesto(m);
        m.setUlice(ulice);
        switch (columnIndex) {

            case 0:
                return m.getMestoID();
            case 1:
                return m.getNazivMesta();
            case 2:
                String ul = "";
                for (Ulica u : m.getUlice()) {
                    if (!ul.contains(u.getNazivUlice())) {
                        ul += u + ", ";
                    }

                }
                return ul;
            default:
                return "";

        }

    }

    @Override
    public String getColumnName(int column) {

        switch (column) {

            case 0:
                return "ID mesta";
            case 1:
                return "Naziv mesta";
            case 2:
                return "Ulice";
            default:
                return "";

        }

    }

    public ArrayList<Mesto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mesto> lista) {
        this.lista = lista;
    }

    public Mesto vratiMesto(int red) {

        return (Mesto) lista.get(red);

    }

    public void obrisi(int red) {

        lista.remove(red);
        fireTableDataChanged();

    }

}
