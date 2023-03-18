/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DptLogistic;

/**
 *
 * @author SANTIAGO
 */
public class Main_Menu extends javax.swing.JFrame {
    DptLogistic dptLogistic;
    /**
     * Creates new form Main_Menu
     */
    public Main_Menu(DptLogistic dptLogistic) {
        initComponents();
        this.dptLogistic = dptLogistic;
        setLocationRelativeTo(this);
    }

    Main_Menu() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAnimalControl = new javax.swing.JButton();
        buttonPlansControl = new javax.swing.JButton();
        buttonTicketsControl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonClose = new javax.swing.JButton();
        buttonSouvenirControl = new javax.swing.JButton();
        buttonPassesContro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 400));

        buttonAnimalControl.setText("Gestionar Animales");
        buttonAnimalControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnimalControlActionPerformed(evt);
            }
        });

        buttonPlansControl.setText("Gestionar Planes");
        buttonPlansControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlansControlActionPerformed(evt);
            }
        });

        buttonTicketsControl.setText("Gestionar boletas");
        buttonTicketsControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTicketsControlActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Menú Principal");

        buttonClose.setText("Salir");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        buttonSouvenirControl.setText("Gestionar Souvenirs");
        buttonSouvenirControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSouvenirControlActionPerformed(evt);
            }
        });

        buttonPassesContro.setText("Gestionar Abonos");
        buttonPassesContro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPassesControActionPerformed(evt);
            }
        });

        jButton1.setText("Gestionar Contabilidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(buttonPassesContro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSouvenirControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTicketsControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPlansControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAnimalControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(buttonAnimalControl)
                .addGap(18, 18, 18)
                .addComponent(buttonPlansControl)
                .addGap(18, 18, 18)
                .addComponent(buttonTicketsControl)
                .addGap(18, 18, 18)
                .addComponent(buttonSouvenirControl)
                .addGap(18, 18, 18)
                .addComponent(buttonPassesContro)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(buttonClose)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTicketsControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTicketsControlActionPerformed
        // TODO add your handling code here:
        Tickest_Control tickest_Control = new Tickest_Control();
        tickest_Control.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonTicketsControlActionPerformed

    private void buttonAnimalControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnimalControlActionPerformed
        // TODO add your handling code here:
        Animals_Control animals_Control = new Animals_Control(dptLogistic);
        animals_Control.setVisible(true);
        dispose();
   
    }//GEN-LAST:event_buttonAnimalControlActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonPlansControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlansControlActionPerformed
        // TODO add your handling code here:
        Plans_Control plans_Control = new Plans_Control();
        plans_Control.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonPlansControlActionPerformed

    private void buttonSouvenirControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSouvenirControlActionPerformed
        // TODO add your handling code here:
        Souvenir_Control souvenir_Control = new Souvenir_Control();
        souvenir_Control.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonSouvenirControlActionPerformed

    private void buttonPassesControActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPassesControActionPerformed
        // TODO add your handling code here:
        Passes_Control passes_Control = new Passes_Control();
        passes_Control.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonPassesControActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Accounting_Control accounting_Control = new Accounting_Control();
        accounting_Control.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnimalControl;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonPassesContro;
    private javax.swing.JButton buttonPlansControl;
    private javax.swing.JButton buttonSouvenirControl;
    private javax.swing.JButton buttonTicketsControl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
