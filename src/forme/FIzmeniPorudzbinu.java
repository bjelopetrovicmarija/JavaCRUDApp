/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import kontrolor.Kontroler;
import model.Datum;
import model.Dobavljac;
import model.Kupac;
import model.NacinIsporuke;
import model.Placanje;
import model.Porudzbina;
import model.StavkaPorudzbine;
import model.Valuta;
import modelitabela.ModelTabeleStavka;

/**
 *
 * @author Dell
 */
public class FIzmeniPorudzbinu extends javax.swing.JFrame {

    Porudzbina p;
    ModelTabeleStavka mts;

    public FIzmeniPorudzbinu() {
    }

    /**
     * Creates new form FIzmeniPorudzbinu
     */
    FIzmeniPorudzbinu(Porudzbina p) {
        initComponents();
        popuniCB();
        this.p = p;
        mts = new ModelTabeleStavka();
        jtblStavka.setModel(mts);
        srediTabelu();
        jtxtNacinPorudzbine.setText(p.getNacinPorudzbine());
        jtxtInfoPorudz.setText(p.getInformacijeOPorudzbini());
        jcmbNacinIsporuke.setSelectedItem(p.getNacinIsporuke());
        jcmbKupac.setSelectedItem(p.getKupac());
        jcmbDobavljac.setSelectedItem(p.getDobavljac());
        jcmbDatumPorudzbine.setSelectedItem(p.getDatum());
        jcmbNacinPlacanja.setSelectedItem(p.getPlacanje());
        jcmbValuta.setSelectedItem(p.getValuta());
        jtxtUkupanIznos.setText(p.getUkupanIznos() + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcmbNacinIsporuke = new javax.swing.JComboBox<model.NacinIsporuke>();
        jLabel7 = new javax.swing.JLabel();
        jcmbDatumPorudzbine = new javax.swing.JComboBox<model.Datum>();
        jLabel8 = new javax.swing.JLabel();
        jcmbNacinPlacanja = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcmbDobavljac = new javax.swing.JComboBox();
        jcmbKupac = new javax.swing.JComboBox();
        jcmbValuta = new javax.swing.JComboBox();
        jtxtNacinPorudzbine = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtInfoPorudz = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jbtnIzmeni = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtxtUkupanIznos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavka = new javax.swing.JTable();
        jbtnDodajStavku = new javax.swing.JButton();
        jbtnIzmeniStavku = new javax.swing.JButton();
        jbtnObrisiStavku = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setText("Nacin placanja:");

        jcmbNacinIsporuke.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Dobavljac: ");

        jcmbDatumPorudzbine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Kupac:");

        jcmbNacinPlacanja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Valuta:");

        jcmbDobavljac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcmbKupac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcmbValuta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nacin porudzbine: ");

        jLabel3.setText("Informacije o porudzbini: ");

        jLabel4.setText("Nacin isporuke: ");

        jtxtInfoPorudz.setColumns(20);
        jtxtInfoPorudz.setRows(5);
        jScrollPane2.setViewportView(jtxtInfoPorudz);

        jLabel5.setText("Datum porudzbine: ");

        jbtnIzmeni.setText("Izmeni porudzbinu");
        jbtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniActionPerformed(evt);
            }
        });

        jLabel10.setText("Ukupan iznos:");

        jtblStavka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblStavka);

        jbtnDodajStavku.setText("Dodaj stavku");
        jbtnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavkuActionPerformed(evt);
            }
        });

        jbtnIzmeniStavku.setText("Izmeni stavku");
        jbtnIzmeniStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniStavkuActionPerformed(evt);
            }
        });

        jbtnObrisiStavku.setText("Obrisi stavku");
        jbtnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiStavkuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcmbKupac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbDobavljac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbNacinPlacanja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbDatumPorudzbine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbNacinIsporuke, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNacinPorudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUkupanIznos)
                            .addComponent(jcmbValuta, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnIzmeniStavku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnDodajStavku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnObrisiStavku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNacinPorudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbNacinIsporuke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbDatumPorudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbNacinPlacanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbDobavljac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbtnDodajStavku)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnIzmeniStavku)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnObrisiStavku))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jbtnIzmeni)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniActionPerformed
        String nacinporudzbine = jtxtNacinPorudzbine.getText();
        String informacijeOPorudzbini = jtxtInfoPorudz.getText();
        NacinIsporuke nacinIsporuke = (NacinIsporuke) jcmbNacinIsporuke.getSelectedItem();
        Datum datum = (Datum) jcmbDatumPorudzbine.getSelectedItem();
        Placanje placanje = (Placanje) jcmbNacinPlacanja.getSelectedItem();
        Dobavljac dobavljac = (Dobavljac) jcmbDobavljac.getSelectedItem();
        Valuta valuta = (Valuta) jcmbValuta.getSelectedItem();
        Kupac kupac = (Kupac) jcmbKupac.getSelectedItem();
        double ukupanIznos = Double.parseDouble(jtxtUkupanIznos.getText());
        mts = (ModelTabeleStavka) jtblStavka.getModel();
        ArrayList<StavkaPorudzbine> stavke = mts.vratiSveStavke();

        Porudzbina porudzbina = new Porudzbina(p.getPorudzbinaID(), nacinporudzbine, informacijeOPorudzbini, nacinIsporuke, datum, placanje, dobavljac, kupac, stavke, ukupanIznos, valuta);

        String dodatak = "";
        if (!valuta.equals(p.getValuta())) {

            dodatak = ",valutaid=" + porudzbina.getValuta().getValutaID();

        }
        Kontroler.getInstanca().izmeniPorudzbinu(porudzbina, dodatak);


    }//GEN-LAST:event_jbtnIzmeniActionPerformed

    private void jbtnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiStavkuActionPerformed

        int red = jtblStavka.getSelectedRow();
        if (red != -1) {
            mts = (ModelTabeleStavka) jtblStavka.getModel();
            mts.obrisiStavku(red);

        } else {

            JOptionPane.showMessageDialog(this, "Niste izabrali stavku koju zelite da obrisete");

        }

    }//GEN-LAST:event_jbtnObrisiStavkuActionPerformed

    private void jbtnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavkuActionPerformed

        FKreirajStavkuPorudzbine fks = new FKreirajStavkuPorudzbine(this, true);
        fks.pack();
        fks.setVisible(true);


    }//GEN-LAST:event_jbtnDodajStavkuActionPerformed

    private void jbtnIzmeniStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniStavkuActionPerformed

        int red = jtblStavka.getSelectedRow();
        if (red != -1) {
            mts = (ModelTabeleStavka) jtblStavka.getModel();
            StavkaPorudzbine sp = mts.vratiStavku(red);
            int kolicina = Integer.parseInt(JOptionPane.showInputDialog("Unesite kolicinu:"));
            mts.setValueAt(kolicina, red, 2);
            StavkaPorudzbine izmenjena = new StavkaPorudzbine(sp.getPorudzbina(), sp.getRbStavke(), kolicina, sp.getArtikal(), sp.getJedinicaMere(), "update");
             mts.izmeniStavku(izmenjena,red);
            
        } else {

            JOptionPane.showMessageDialog(this, "Niste izabrali stavku koju zelite da izmenite");
            return;

        }


    }//GEN-LAST:event_jbtnIzmeniStavkuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FIzmeniPorudzbinu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIzmeniPorudzbinu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIzmeniPorudzbinu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIzmeniPorudzbinu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FIzmeniPorudzbinu forma = new FIzmeniPorudzbinu();
                forma.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                forma.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnDodajStavku;
    private javax.swing.JButton jbtnIzmeni;
    private javax.swing.JButton jbtnIzmeniStavku;
    private javax.swing.JButton jbtnObrisiStavku;
    private javax.swing.JComboBox<model.Datum> jcmbDatumPorudzbine;
    private javax.swing.JComboBox jcmbDobavljac;
    private javax.swing.JComboBox jcmbKupac;
    private javax.swing.JComboBox<model.NacinIsporuke> jcmbNacinIsporuke;
    private javax.swing.JComboBox jcmbNacinPlacanja;
    private javax.swing.JComboBox jcmbValuta;
    private javax.swing.JTable jtblStavka;
    private javax.swing.JTextArea jtxtInfoPorudz;
    private javax.swing.JTextField jtxtNacinPorudzbine;
    private javax.swing.JTextField jtxtUkupanIznos;
    // End of variables declaration//GEN-END:variables

    private void popuniCB() {

        jcmbNacinIsporuke.removeAllItems();
        jcmbNacinPlacanja.removeAllItems();
        jcmbDobavljac.removeAllItems();
        jcmbDatumPorudzbine.removeAllItems();
        jcmbKupac.removeAllItems();
        jcmbValuta.removeAllItems();

        ArrayList<Valuta> valute = kontrolor.Kontroler.getInstanca().vratiValute();
        for (Valuta v : valute) {

            jcmbValuta.addItem(v);
        }

        ArrayList<NacinIsporuke> naciniIsporuke = kontrolor.Kontroler.getInstanca().vratiNacineIsporuke();
        for (NacinIsporuke n : naciniIsporuke) {

            jcmbNacinIsporuke.addItem(n);
        }

        ArrayList<Placanje> placanja = kontrolor.Kontroler.getInstanca().vratiPlacanja();
        for (Placanje p : placanja) {

            jcmbNacinPlacanja.addItem(p);
        }

        ArrayList<Datum> datumi = kontrolor.Kontroler.getInstanca().vratiDatume();
        for (Datum d : datumi) {

            jcmbDatumPorudzbine.addItem(d);
        }

        ArrayList<Kupac> kupci = kontrolor.Kontroler.getInstanca().vratiKupce();
        for (Kupac k : kupci) {

            jcmbKupac.addItem(k);
        }

        ArrayList<Dobavljac> dobavljaci = kontrolor.Kontroler.getInstanca().vrati_Dobavljace();
        for (Dobavljac d : dobavljaci) {

            jcmbDobavljac.addItem(d);
        }

    }

    private void srediTabelu() {

        ArrayList<StavkaPorudzbine> stavke = Kontroler.getInstanca().vratiStavkeZaPorudzbinu(p);
        mts = (ModelTabeleStavka) jtblStavka.getModel();
        mts.setLista(stavke);

    }

    void dodajStavku(StavkaPorudzbine sp) {
        mts = (ModelTabeleStavka) jtblStavka.getModel();
        mts.dodajStavku(sp);

    }
}
