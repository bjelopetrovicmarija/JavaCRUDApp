/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import kontrolor.Kontroler;
import model.Adresa;
import model.Mesto;
import model.Ulica;
import modelitabela.ModelTabeleAdresa;

/**
 *
 * @author Dell
 */
public class FKreirajUlicu extends javax.swing.JFrame {

    /**
     * Creates new form FKreirajUlicu
     */
    ModelTabeleAdresa mta;

    public FKreirajUlicu() {
        initComponents();
        mta = new ModelTabeleAdresa();
        jtblAdresa.setModel(mta);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcmbMesto = new javax.swing.JComboBox();
        jtxtUlicaID = new javax.swing.JTextField();
        jtxtNazivUlice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAdresa = new javax.swing.JTable();
        jbtnSacuvajUlicu = new javax.swing.JButton();
        jbtnDodajAdresu = new javax.swing.JButton();
        jbtnObrisiAdresu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mesto: ");

        jLabel2.setText("Ulica ID:");

        jLabel3.setText("Naziv ulice:");

        jcmbMesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtblAdresa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblAdresa);

        jbtnSacuvajUlicu.setText("Sacuvaj ulicu");
        jbtnSacuvajUlicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajUlicuActionPerformed(evt);
            }
        });

        jbtnDodajAdresu.setText("Dodaj adresu");
        jbtnDodajAdresu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajAdresuActionPerformed(evt);
            }
        });

        jbtnObrisiAdresu.setText("Obrisi adresu");
        jbtnObrisiAdresu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiAdresuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcmbMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtUlicaID))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnDodajAdresu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnObrisiAdresu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtNazivUlice))))
                    .addComponent(jbtnSacuvajUlicu, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUlicaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNazivUlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDodajAdresu)
                    .addComponent(jbtnObrisiAdresu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSacuvajUlicu)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSacuvajUlicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajUlicuActionPerformed
         int ulicaID=Integer.parseInt(jtxtUlicaID.getText());
        String nazivUlice=jtxtNazivUlice.getText();
        Mesto mesto=(Mesto)jcmbMesto.getSelectedItem();
        mta=(ModelTabeleAdresa)jtblAdresa.getModel();
        ArrayList<Adresa> adrese=mta.getLista();
        
        Ulica ulica=new Ulica(ulicaID, nazivUlice, null, adrese, mesto, "insert");
        Kontroler.getInstanca().sacuvajUlicu(ulica);
        
    }//GEN-LAST:event_jbtnSacuvajUlicuActionPerformed

    private void jbtnDodajAdresuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajAdresuActionPerformed

        FDodajAdresu fda = new FDodajAdresu(this, true);
        fda.pack();
        fda.setVisible(true);

    }//GEN-LAST:event_jbtnDodajAdresuActionPerformed

    private void jbtnObrisiAdresuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiAdresuActionPerformed
      int red=jtblAdresa.getSelectedRow();
      if(red!=-1){
      mta=(ModelTabeleAdresa)jtblAdresa.getModel();
      mta.obrisiAdresu(red);
      
      }else{
      
          JOptionPane.showMessageDialog(this, "Niste izabrali adresu koju zelite da obrisete");
          return;
      
      }

      


    }//GEN-LAST:event_jbtnObrisiAdresuActionPerformed

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
            java.util.logging.Logger.getLogger(FKreirajUlicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FKreirajUlicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FKreirajUlicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FKreirajUlicu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FKreirajUlicu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDodajAdresu;
    private javax.swing.JButton jbtnObrisiAdresu;
    private javax.swing.JButton jbtnSacuvajUlicu;
    private javax.swing.JComboBox jcmbMesto;
    private javax.swing.JTable jtblAdresa;
    private javax.swing.JTextField jtxtNazivUlice;
    private javax.swing.JTextField jtxtUlicaID;
    // End of variables declaration//GEN-END:variables

    private void popuniCB() {

        ArrayList<Mesto> mesta = kontrolor.Kontroler.getInstanca().vratiMesta();
        jcmbMesto.removeAllItems();
        for (Mesto m : mesta) {

            jcmbMesto.addItem(m);

        }

    }

    void dodajAdresu(Adresa adresa) {
        int ulicaID=Integer.parseInt(jtxtUlicaID.getText());
        String nazivUlice=jtxtNazivUlice.getText();
        Mesto mesto=(Mesto)jcmbMesto.getSelectedItem();
        Ulica ulica=new Ulica(ulicaID, nazivUlice, null, null, mesto,"");
        adresa.setUlica(ulica);
        mta = (ModelTabeleAdresa) jtblAdresa.getModel();
        mta.dodajAdresu(adresa);

    }
}
