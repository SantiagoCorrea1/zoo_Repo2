/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MainClass;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import utility.Ticket;

/**
 *
 * @author SANTIAGO
 */
public class Edit_Tickets extends javax.swing.JFrame {
    MainClass mainClass;
    /**
     * Creates new form Edit_Tickets
     */
    public Edit_Tickets(MainClass mainClass) {
        initComponents();
        this.mainClass = mainClass;
        setLocationRelativeTo(this);
    }

    private Edit_Tickets() {
    }
    
    void setNull(){
        boxDeleteCode.setText("");
        boxEditAge.setText("");
        boxEditCode.setText("");
        boxEditPrice.setText("");
        boxNewAge.setText("");
        boxNewCode.setText("");
        boxNewPrice.setText("");
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
        jTable1 = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        boxNewCode = new javax.swing.JTextField();
        boxNewPrice = new javax.swing.JTextField();
        boxNewAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxEditCode = new javax.swing.JTextField();
        boxEditPrice = new javax.swing.JTextField();
        boxEditAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        boxDeleteCode = new javax.swing.JTextField();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        buttonBack.setText("Regresar");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Editar Boletas");

        jLabel1.setText("Código");

        jLabel2.setText("Precio");

        jLabel3.setText("edad");

        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        boxNewCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNewCodeKeyTyped(evt);
            }
        });

        boxNewPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNewPriceKeyTyped(evt);
            }
        });

        boxNewAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNewAgeKeyTyped(evt);
            }
        });

        jLabel4.setText("Código");

        jLabel6.setText("Precio");

        jLabel7.setText("edad");

        boxEditCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditCodeKeyTyped(evt);
            }
        });

        boxEditPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditPriceKeyTyped(evt);
            }
        });

        boxEditAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditAgeKeyTyped(evt);
            }
        });

        jLabel8.setText("Código");

        boxDeleteCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxDeleteCodeKeyTyped(evt);
            }
        });

        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(181, 181, 181))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxNewAge, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(boxNewCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNewPrice, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(buttonAdd))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEdit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxEditAge)
                            .addComponent(boxEditCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEditPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxDeleteCode)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDelete)
                                .addGap(0, 14, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(boxNewCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxNewAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(boxDeleteCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(boxEditCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(boxEditPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(boxEditAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit))
                .addGap(23, 23, 23)
                .addComponent(buttonBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        Tickest_Control tickest_Control = new Tickest_Control(mainClass);
        tickest_Control.setVisible(true);
        dispose();
        setNull();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        Ticket newTicket = new Ticket(Double.parseDouble(boxNewPrice.getText()), boxNewCode.getText(), Integer.parseInt(boxNewAge.getText()));;
        if (mainClass.getDptSales().ticketExits(boxNewCode.getText())) {
            showMessageDialog(null, "el tiquete ya existe");
        } else {
            mainClass.getDptSales().getArraysControl().getTickets().add(newTicket);
            showMessageDialog(null, "el tiquete fue agregado correctamente");
        }
        setNull();
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        Ticket editTicket = new Ticket(Double.parseDouble(boxEditPrice.getText()), "", Integer.parseInt(boxEditAge.getText()));
        mainClass.getDptSales().editTicket(boxEditCode.getText(), editTicket);
        setNull();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        mainClass.getDptSales().cancelTicket(boxDeleteCode.getText());
        setNull();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void boxNewCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNewCodeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxNewCode.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxNewCodeKeyTyped

    private void boxNewPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNewPriceKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxNewPrice.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxNewPriceKeyTyped

    private void boxNewAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNewAgeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxNewAge.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxNewAgeKeyTyped

    private void boxEditCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditCodeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxEditCode.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxEditCodeKeyTyped

    private void boxEditPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditPriceKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxEditPrice.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxEditPriceKeyTyped

    private void boxEditAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditAgeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxEditAge.getText().trim().length() == 10) {
            evt.consume();
        }  
    }//GEN-LAST:event_boxEditAgeKeyTyped

    private void boxDeleteCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxDeleteCodeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxEditPrice.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_boxDeleteCodeKeyTyped

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
            java.util.logging.Logger.getLogger(Edit_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxDeleteCode;
    private javax.swing.JTextField boxEditAge;
    private javax.swing.JTextField boxEditCode;
    private javax.swing.JTextField boxEditPrice;
    private javax.swing.JTextField boxNewAge;
    private javax.swing.JTextField boxNewCode;
    private javax.swing.JTextField boxNewPrice;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
