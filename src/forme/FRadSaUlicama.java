/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Ulica;
import modelitabela.ModelTabeleUlica;

/**
 *
 * @author Dell
 */
public class FRadSaUlicama extends javax.swing.JFrame {

    /**
     * Creates new form FRadSaUlicama
     */
    ModelTabeleUlica mtu;

    public FRadSaUlicama() {
        initComponents();
        mtu = new ModelTabeleUlica();
        jtblUlica.setModel(mtu);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblUlica = new javax.swing.JTable();
        jbtnObrisi = new javax.swing.JButton();
        jbtnIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblUlica.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblUlica);

        jbtnObrisi.setText("Obrisi");
        jbtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiActionPerformed(evt);
            }
        });

        jbtnIzmeni.setText("Izmeni");
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jbtnObrisi)
                .addGap(33, 33, 33)
                .addComponent(jbtnIzmeni)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiActionPerformed
        int red = jtblUlica.getSelectedRow();
        if (red != -1) {
            mtu = (ModelTabeleUlica) jtblUlica.getModel();
            Ulica ulica = mtu.vratiUlicu(red);
            boolean uspesno = kontrolor.Kontroler.getInstanca().obrisiUlicu(ulica);
            if (uspesno) {
                mtu.obrisiUlicu(red);

            }

        } else {

            JOptionPane.showMessageDialog(this, "Niste izabrali ulicu koju zelite da obrisete");
            return;

        }


    }//GEN-LAST:event_jbtnObrisiActionPerformed

    private void jbtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniActionPerformed

        int red = jtblUlica.getSelectedRow();
        if (red != -1) {
            mtu = (ModelTabeleUlica) jtblUlica.getModel();
            Ulica ulica =mtu.vratiUlicu(red);
            FIzmeniUlicu fiu=new FIzmeniUlicu(ulica);
            fiu.setVisible(true);
        
        } else {

            JOptionPane.showMessageDialog(this, "Niste izabrali ulicu koju zelite da izmenite");
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
            java.util.logging.Logger.getLogger(FRadSaUlicama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRadSaUlicama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRadSaUlicama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRadSaUlicama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRadSaUlicama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnIzmeni;
    private javax.swing.JButton jbtnObrisi;
    private javax.swing.JTable jtblUlica;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {

        mtu = (ModelTabeleUlica) jtblUlica.getModel();
        ArrayList<Ulica> ulice = kontrolor.Kontroler.getInstanca().vratiUlice();
        mtu.setLista(ulice);

    }
}
