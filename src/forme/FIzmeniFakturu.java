/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import kontrolor.Kontroler;
import model.Datum;
import model.Dobavljac;
import model.Faktura;
import model.Kupac;
import model.Mesto;
import model.Otpremnica;
import model.Procenat;

/**
 *
 * @author Dell
 */
public class FIzmeniFakturu extends javax.swing.JDialog {

    /**
     * Creates new form FIzmeniFakturu
     *
     */
    Faktura f;

    public FIzmeniFakturu(java.awt.Frame parent, boolean modal) {

    }

    FIzmeniFakturu(FRadSaFakturama aThis, boolean b, Faktura f) {

        initComponents();
        this.f = f;
        popuniCB();
        srediPoljaForme();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jcmbBrojOtpremnice = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jcmbMesto = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcmbKupac = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jcmbDobavljac = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcmbDatumFakture = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jcmbDatumPrometa = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jbtnIzmeni = new javax.swing.JButton();
        jtxtBrojFakture = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtOsnovica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtStopaPDV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtIznosPDV = new javax.swing.JTextField();
        jtxtUkupanIznos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Stopa PDV:");

        jcmbBrojOtpremnice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Broj otpremnice:");

        jcmbMesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Mesto:");

        jcmbKupac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Kupac:");

        jcmbDobavljac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Dobavljac:");

        jcmbDatumFakture.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Datum fakture:");

        jcmbDatumPrometa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Datum prometa: ");

        jbtnIzmeni.setText("Izmeni fakturu");
        jbtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniActionPerformed(evt);
            }
        });

        jtxtBrojFakture.setEditable(false);

        jLabel1.setText("Broj fakture: ");

        jLabel2.setText("Osnovica:");

        jLabel4.setText("Iznos PDV:");

        jLabel5.setText("Ukupan iznos:");

        jtxtUkupanIznos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUkupanIznosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jcmbDatumPrometa, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbDatumFakture, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbDobavljac, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtIznosPDV)
                                    .addComponent(jtxtOsnovica)
                                    .addComponent(jtxtStopaPDV)
                                    .addComponent(jcmbBrojOtpremnice, 0, 374, Short.MAX_VALUE)
                                    .addComponent(jcmbMesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcmbKupac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtBrojFakture)
                                    .addComponent(jtxtUkupanIznos))))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtBrojFakture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtOsnovica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtStopaPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtIznosPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jcmbBrojOtpremnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcmbMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmbDatumPrometa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbDobavljac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbDatumFakture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)))
                .addComponent(jbtnIzmeni)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniActionPerformed

        double osnovica = Double.parseDouble(jtxtOsnovica.getText());
        int brojFakture = Integer.parseInt(jtxtBrojFakture.getText());
        int stopaPDV = Integer.parseInt(jtxtStopaPDV.getText());
        double iznospdv = Double.parseDouble(jtxtIznosPDV.getText());
        double ukupanIznos = Double.parseDouble(jtxtUkupanIznos.getText());
        Otpremnica otpremnica = (Otpremnica) jcmbBrojOtpremnice.getSelectedItem();
        Kupac kupac = (Kupac) jcmbKupac.getSelectedItem();
        Dobavljac dobavljac = (Dobavljac) jcmbDobavljac.getSelectedItem();
        Datum datumFakture = (Datum) jcmbDatumFakture.getSelectedItem();
        Datum datumPrometa = (Datum) jcmbDatumPrometa.getSelectedItem();
        Mesto mesto = (Mesto) jcmbMesto.getSelectedItem();

        Procenat procenat = new Procenat("MARIJA.PROCENAT", stopaPDV);

        Faktura faktura = new Faktura(brojFakture, osnovica, iznospdv, ukupanIznos, otpremnica, mesto, kupac, dobavljac, datumFakture, datumPrometa, procenat, null, "UPDATE");

        Kontroler.getInstanca().izmeniFakturu(faktura);

    }//GEN-LAST:event_jbtnIzmeniActionPerformed

    private void jtxtUkupanIznosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUkupanIznosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUkupanIznosActionPerformed

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
            java.util.logging.Logger.getLogger(FIzmeniFakturu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIzmeniFakturu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIzmeniFakturu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIzmeniFakturu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FIzmeniFakturu dialog = new FIzmeniFakturu(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnIzmeni;
    private javax.swing.JComboBox jcmbBrojOtpremnice;
    private javax.swing.JComboBox jcmbDatumFakture;
    private javax.swing.JComboBox jcmbDatumPrometa;
    private javax.swing.JComboBox jcmbDobavljac;
    private javax.swing.JComboBox jcmbKupac;
    private javax.swing.JComboBox jcmbMesto;
    private javax.swing.JTextField jtxtBrojFakture;
    private javax.swing.JTextField jtxtIznosPDV;
    private javax.swing.JTextField jtxtOsnovica;
    private javax.swing.JTextField jtxtStopaPDV;
    private javax.swing.JTextField jtxtUkupanIznos;
    // End of variables declaration//GEN-END:variables

    private void srediPoljaForme() {
        jtxtBrojFakture.setText(f.getBrojFakture() + "");
        jtxtOsnovica.setText(f.getOsnovica() + "");
        jtxtIznosPDV.setText(f.getIznosPDV() + "");
        jtxtUkupanIznos.setText(f.getUkupanIznos() + "");
        jtxtStopaPDV.setText(f.getStopaPDV().toString());
        jcmbBrojOtpremnice.setSelectedItem(f.getOtpremnica());
        jcmbMesto.setSelectedItem(f.getMesto());
        jcmbDobavljac.setSelectedItem(f.getDobavljac());
        jcmbKupac.setSelectedItem(f.getKupac());
        jcmbDatumFakture.setSelectedItem(f.getDatumFakture());
        jcmbDatumPrometa.setSelectedItem(f.getDatumPrometa());

    }

    private void popuniCB() {

        jcmbBrojOtpremnice.removeAllItems();
        jcmbDatumFakture.removeAllItems();
        jcmbDatumPrometa.removeAllItems();
        jcmbDobavljac.removeAllItems();
        jcmbKupac.removeAllItems();
        jcmbMesto.removeAllItems();

        ArrayList<Datum> datumi = kontrolor.Kontroler.getInstanca().vratiDatume();
        for (Datum d : datumi) {
            jcmbDatumFakture.addItem(d);
            jcmbDatumPrometa.addItem(d);

        }

        ArrayList<Dobavljac> dobavljaci = Kontroler.getInstanca().vrati_Dobavljace();
        for (Dobavljac d : dobavljaci) {

            jcmbDobavljac.addItem(d);
        }

        ArrayList<Kupac> kupci = Kontroler.getInstanca().vratiKupce();
        for (Kupac k : kupci) {

            jcmbKupac.addItem(k);
        }

        ArrayList<Mesto> mesta = Kontroler.getInstanca().vratiMesta();
        for (Mesto m : mesta) {

            jcmbMesto.addItem(m);
        }

        ArrayList<Otpremnica> otpremnice = Kontroler.getInstanca().vratiOtpremnice();
        for (Otpremnica o : otpremnice) {

            jcmbBrojOtpremnice.addItem(o);
        }

    }
}
