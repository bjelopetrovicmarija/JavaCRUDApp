/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import model.Artikal;
import model.JedinicaMere;
import model.StavkaPorudzbine;

/**
 *
 * @author Dell
 */
public class FKreirajStavkuPorudzbine extends javax.swing.JDialog {

    /**
     * Creates new form FKreirajStavkuPorudzbine
     */
    public FKreirajStavkuPorudzbine(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniCB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtKolicina = new javax.swing.JTextField();
        jbtnDodajStavku = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcmbArtikal = new javax.swing.JComboBox();
        jcmbJedinicaMere = new javax.swing.JComboBox();
        jtxtKolicina1 = new javax.swing.JTextField();
        jbtnDodajStavku1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcmbArtikal1 = new javax.swing.JComboBox();
        jcmbJedinicaMere1 = new javax.swing.JComboBox();

        jbtnDodajStavku.setText("Dodaj stavku");
        jbtnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavkuActionPerformed(evt);
            }
        });

        jLabel1.setText("Artikal:");

        jLabel2.setText("Jedinica mere:");

        jLabel3.setText("Kolicina: ");

        jcmbArtikal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcmbJedinicaMere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbtnDodajStavku1.setText("Dodaj stavku");
        jbtnDodajStavku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavku1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Artikal:");

        jLabel5.setText("Jedinica mere:");

        jLabel6.setText("Kolicina: ");

        jcmbArtikal1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcmbJedinicaMere1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcmbArtikal1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcmbJedinicaMere1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtKolicina1)))
                    .addComponent(jbtnDodajStavku1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbArtikal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbJedinicaMere1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtKolicina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jbtnDodajStavku1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavkuActionPerformed
       
    }//GEN-LAST:event_jbtnDodajStavkuActionPerformed

    private void jbtnDodajStavku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavku1ActionPerformed
        Artikal artikal = (Artikal) jcmbArtikal1.getSelectedItem();
        JedinicaMere jedinicaMere = (JedinicaMere) jcmbJedinicaMere1.getSelectedItem();
        int kolicina = Integer.parseInt(jtxtKolicina1.getText());

        StavkaPorudzbine sp = new StavkaPorudzbine(null, -1, kolicina, artikal, jedinicaMere, "insert");
        FIzmeniPorudzbinu fip = (FIzmeniPorudzbinu) getParent();
        fip.dodajStavku(sp);
    }//GEN-LAST:event_jbtnDodajStavku1ActionPerformed

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
            java.util.logging.Logger.getLogger(FKreirajStavkuPorudzbine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FKreirajStavkuPorudzbine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FKreirajStavkuPorudzbine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FKreirajStavkuPorudzbine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FKreirajStavkuPorudzbine dialog = new FKreirajStavkuPorudzbine(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnDodajStavku;
    private javax.swing.JButton jbtnDodajStavku1;
    private javax.swing.JComboBox jcmbArtikal;
    private javax.swing.JComboBox jcmbArtikal1;
    private javax.swing.JComboBox jcmbJedinicaMere;
    private javax.swing.JComboBox jcmbJedinicaMere1;
    private javax.swing.JTextField jtxtKolicina;
    private javax.swing.JTextField jtxtKolicina1;
    // End of variables declaration//GEN-END:variables

    private void popuniCB() {

        ArrayList<Artikal> artikli = kontrolor.Kontroler.getInstanca().vratiArtikle();
        jcmbArtikal1.removeAllItems();

        for (Artikal a : artikli) {

            jcmbArtikal1.addItem(a);

        }

        ArrayList<JedinicaMere> jediniceMere = kontrolor.Kontroler.getInstanca().vratiJediniceMere();
        jcmbJedinicaMere1.removeAllItems();

        for (JedinicaMere jm : jediniceMere) {

            jcmbJedinicaMere1.addItem(jm);

        }
    }
}