/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Dobavljac;
import model.Katalog;
import model.StavkaKataloga;
import modelitabela.ModelTabeleStavka;
import modelitabela.ModelTabeleStavkaKataloga;

/**
 *
 * @author Dell
 */
public class FIzmeniKatalog extends javax.swing.JFrame {

    /**
     * Creates new form FIzmeniKatalog
     */
    ModelTabeleStavkaKataloga mts;
    Katalog k;

    public FIzmeniKatalog() {
    }

    FIzmeniKatalog(Katalog k) {
        initComponents();
        this.k = k;
        jtxtBrojStranica1.setText(k.getBrojStranica() + "");
        mts = new ModelTabeleStavkaKataloga();
        jtblStavka1.setModel(mts);
        srediTabelu();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtBrojStranica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavka = new javax.swing.JTable();
        jbtnDodajKatalog = new javax.swing.JButton();
        jbtnDodajStavku = new javax.swing.JButton();
        jbtnObrisiStavku = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcmbDobavljac = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtxtBrojStranica1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblStavka1 = new javax.swing.JTable();
        jbtnIzmeniKatalog = new javax.swing.JButton();
        jbtnDodajStavku1 = new javax.swing.JButton();
        jbtnObrisiStavku1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtnIzmeni = new javax.swing.JButton();

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

        jbtnDodajKatalog.setText("Dodaj katalog");
        jbtnDodajKatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajKatalogActionPerformed(evt);
            }
        });

        jbtnDodajStavku.setText("Dodaj stavku");
        jbtnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavkuActionPerformed(evt);
            }
        });

        jbtnObrisiStavku.setText("Obrisi stavku");
        jbtnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiStavkuActionPerformed(evt);
            }
        });

        jLabel3.setText("Dobavljac:");

        jcmbDobavljac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Broj stranica:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblStavka1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblStavka1);

        jbtnIzmeniKatalog.setText("Izmeni katalog");
        jbtnIzmeniKatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniKatalogActionPerformed(evt);
            }
        });

        jbtnDodajStavku1.setText("Dodaj stavku");
        jbtnDodajStavku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavku1ActionPerformed(evt);
            }
        });

        jbtnObrisiStavku1.setText("Obrisi stavku");
        jbtnObrisiStavku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiStavku1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Broj stranica:");

        jbtnIzmeni.setText("Izmeni stavku");
        jbtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnIzmeniKatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnDodajStavku1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jbtnObrisiStavku1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jbtnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtxtBrojStranica1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbtnDodajStavku1)
                        .addGap(32, 32, 32)
                        .addComponent(jbtnObrisiStavku1)
                        .addGap(30, 30, 30)
                        .addComponent(jbtnIzmeni)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jbtnIzmeniKatalog)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtBrojStranica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(328, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDodajKatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajKatalogActionPerformed


    }//GEN-LAST:event_jbtnDodajKatalogActionPerformed

    private void jbtnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavkuActionPerformed

//        FDodajStavkuKataloga dsk = new FDodajStavkuKataloga(this, true);
//        dsk.pack();
//        dsk.setVisible(true);
    }//GEN-LAST:event_jbtnDodajStavkuActionPerformed

    private void jbtnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiStavkuActionPerformed

    }//GEN-LAST:event_jbtnObrisiStavkuActionPerformed

    private void jbtnIzmeniKatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniKatalogActionPerformed

        int brojStranica = Integer.parseInt(jtxtBrojStranica1.getText());
        mts = (ModelTabeleStavkaKataloga) jtblStavka1.getModel();
        ArrayList<StavkaKataloga> stavke = mts.vratiSveStavke();

        Katalog katalog = new Katalog(k.getKatalogID(), brojStranica, stavke, k.getDobavljac(), "update");
        kontrolor.Kontroler.getInstanca().izmeniKatalog(katalog);

    }//GEN-LAST:event_jbtnIzmeniKatalogActionPerformed

    private void jbtnDodajStavku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavku1ActionPerformed

        FKreirajStavkuKataloga dsk = new FKreirajStavkuKataloga(this, true);
        dsk.pack();
        dsk.setVisible(true);
    }//GEN-LAST:event_jbtnDodajStavku1ActionPerformed

    private void jbtnObrisiStavku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiStavku1ActionPerformed

        int red = jtblStavka1.getSelectedRow();
        if (red != -1) {
            mts = (ModelTabeleStavkaKataloga) jtblStavka1.getModel();
            mts.obrisiStavku(red);

        } else {
            JOptionPane.showMessageDialog(this, "Niste izabrali stavku koju zelite da obrisete");
            return;
        }
    }//GEN-LAST:event_jbtnObrisiStavku1ActionPerformed

    private void jbtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniActionPerformed
        int red = jtblStavka1.getSelectedRow();
        if (red != -1) {
            mts = (ModelTabeleStavkaKataloga) jtblStavka1.getModel();
            StavkaKataloga sk = mts.vratiStavku(red);
            String nazivDob = JOptionPane.showInputDialog("Unesite naziv dobavljaca");
            mts.setValueAt(nazivDob, red, 1);
            StavkaKataloga s = new StavkaKataloga(sk.getStavkaID(), sk.getRbStavke(), sk.getArtikal(), sk.getJedinicaMere(), nazivDob, sk.getKatalog(), "update");
            mts.izmeniStavku(s,red);

        } else {

            JOptionPane.showMessageDialog(this, "Niste izabrali stavku kataloga koju zelite da izmenite");
            return;
        }


    }//GEN-LAST:event_jbtnIzmeniActionPerformed

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
            java.util.logging.Logger.getLogger(FIzmeniKatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIzmeniKatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIzmeniKatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIzmeniKatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIzmeniKatalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDodajKatalog;
    private javax.swing.JButton jbtnDodajStavku;
    private javax.swing.JButton jbtnDodajStavku1;
    private javax.swing.JButton jbtnIzmeni;
    private javax.swing.JButton jbtnIzmeniKatalog;
    private javax.swing.JButton jbtnObrisiStavku;
    private javax.swing.JButton jbtnObrisiStavku1;
    private javax.swing.JComboBox jcmbDobavljac;
    private javax.swing.JTable jtblStavka;
    private javax.swing.JTable jtblStavka1;
    private javax.swing.JTextField jtxtBrojStranica;
    private javax.swing.JTextField jtxtBrojStranica1;
    // End of variables declaration//GEN-END:variables

    void dodajStavku(StavkaKataloga sk) {

        mts = (ModelTabeleStavkaKataloga) jtblStavka1.getModel();
        mts.dodajStavku(sk);

    }

    private void srediTabelu() {

        ArrayList<StavkaKataloga> stavke = kontrolor.Kontroler.getInstanca().vratiStavkeZaKatalog(k);
        mts = (ModelTabeleStavkaKataloga) jtblStavka1.getModel();
        mts.setLista(stavke);

    }
}
