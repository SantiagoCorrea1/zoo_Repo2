/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.MainClass;
import javax.swing.JOptionPane;
import utility.DomesticAnimal;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SANTIAGO
 */
public class Edit_DomesticAnimals extends javax.swing.JFrame {
    MainClass mainClass;
    /**
     * Creates new form Edit_Animals
     * @param dptLogistic
     */
    public Edit_DomesticAnimals(MainClass mainClass) {
        this.mainClass = mainClass;
        initComponents();
        setLocationRelativeTo(this);
    }

    Edit_DomesticAnimals() {
        
    }

    void setNull(){
        boxCode.setText("");
        boxCodeDelete.setText("");
        boxCodeEdit.setText("");
        boxEditKidness.setText("");
        boxEditName.setText("");
        boxEditWeigth.setText("");
        boxKidness.setText("");
        boxName.setText("");
        boxSpecies.setText("");
        boxType.setText("");
        boxWeigth.setText("");
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
        boxEditName = new javax.swing.JTextField();
        buttonBack = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        boxCode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        boxName = new javax.swing.JTextField();
        boxEditWeigth = new javax.swing.JTextField();
        boxType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxWeigth = new javax.swing.JTextField();
        boxSpecies = new javax.swing.JTextField();
        buttonEdit = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxKidness = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxCodeDelete = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        boxEditKidness = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        boxCodeEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Tipo", "peso", "Especie", "Amabilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        boxEditName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditNameKeyTyped(evt);
            }
        });

        buttonBack.setText("Regresar");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        jLabel14.setText("Peso");

        boxCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeActionPerformed(evt);
            }
        });
        boxCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeKeyTyped(evt);
            }
        });

        jLabel16.setText("Amabilidad");

        boxName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNameKeyTyped(evt);
            }
        });

        boxEditWeigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEditWeigthActionPerformed(evt);
            }
        });
        boxEditWeigth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditWeigthKeyTyped(evt);
            }
        });

        boxType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxTypeKeyTyped(evt);
            }
        });

        jLabel4.setText("Peso");

        jLabel7.setText("Especie");

        jLabel8.setText("Amabilidad");

        boxWeigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxWeigthActionPerformed(evt);
            }
        });
        boxWeigth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxWeigthKeyTyped(evt);
            }
        });

        boxSpecies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxSpeciesKeyTyped(evt);
            }
        });

        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        boxKidness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxKidnessKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Animales Domesticos");

        jLabel9.setText("Código");

        jLabel6.setText("Código");

        boxCodeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeDeleteActionPerformed(evt);
            }
        });
        boxCodeDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeDeleteKeyTyped(evt);
            }
        });

        jLabel11.setText("Nombre");

        boxEditKidness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditKidnessKeyTyped(evt);
            }
        });

        jLabel13.setText("Código");

        boxCodeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeEditActionPerformed(evt);
            }
        });
        boxCodeEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeEditKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(boxCode, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(boxName)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(buttonAdd)
                                                .addGap(48, 48, 48))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel8))
                                                            .addGap(31, 31, 31)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(boxKidness, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(boxWeigth, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                                    .addComponent(boxSpecies)))))
                                                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(46, 46, 46)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(45, 45, 45)
                                                .addComponent(boxEditWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel13))
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(boxCodeEdit)
                                                    .addComponent(boxEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(buttonEdit)
                                                    .addComponent(boxEditKidness, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonDelete)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCodeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(boxCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(buttonDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxEditWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxEditKidness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(boxSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(boxKidness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(buttonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonAdd)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        Animals_Control animals_Control = new Animals_Control(mainClass);
        animals_Control.setVisible(true);
        dispose();
        setNull();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void boxCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeActionPerformed

    private void boxEditWeigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEditWeigthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEditWeigthActionPerformed

    private void boxWeigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxWeigthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxWeigthActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        String code =  boxCodeEdit.getText();
        DomesticAnimal domesticAnimal =  new DomesticAnimal(boxSpecies.getText(), boxEditKidness.getText(), "", boxEditName.getText(), "", ""); //vacío el tipo porque eso no se va a editar
        mainClass.getDptLogistic().editDomesticAnimals(code, domesticAnimal);
        setNull();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        
        DomesticAnimal domesticAnimal = new DomesticAnimal(boxSpecies.getText(), boxKidness.getText(), boxCode.getText(),
                boxName.getText(), boxWeigth.getText(), boxType.getText());
        
        if (mainClass.getDptLogistic().animalExits(boxCode.getText())) {
            showMessageDialog(null, "el animal ya existe");
        } else {
            mainClass.getDptLogistic().addDomesticAnimals(domesticAnimal);
            showMessageDialog(null, "el animal fue agregado correctamente");
        }
        setNull();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void boxCodeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeDeleteActionPerformed

    private void boxCodeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        mainClass.getDptLogistic().deleteAnimal(boxCodeDelete.getText(), "domestico");
        setNull();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void boxNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNameKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
               
    }//GEN-LAST:event_boxNameKeyTyped

    private void boxCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxCode.getText().trim().length() == 10) {
           evt.consume();
        }
    }//GEN-LAST:event_boxCodeKeyTyped

    private void boxTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTypeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");           
        }
    }//GEN-LAST:event_boxTypeKeyTyped

    private void boxWeigthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxWeigthKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxWeigth.getText().trim().length() == 10) {
           evt.consume();
        }
    }//GEN-LAST:event_boxWeigthKeyTyped

    private void boxSpeciesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxSpeciesKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
        
    }//GEN-LAST:event_boxSpeciesKeyTyped

    private void boxKidnessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxKidnessKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxKidnessKeyTyped

    private void boxCodeEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeEditKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxCodeEdit.getText().trim().length() == 10) {
           evt.consume();
        }
        
    }//GEN-LAST:event_boxCodeEditKeyTyped

    private void boxEditNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditNameKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
        
    }//GEN-LAST:event_boxEditNameKeyTyped

    private void boxEditWeigthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditWeigthKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxEditWeigth.getText().trim().length() == 10) {
           evt.consume();
        }
        
    }//GEN-LAST:event_boxEditWeigthKeyTyped

    private void boxEditKidnessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditKidnessKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxEditKidnessKeyTyped

    private void boxCodeDeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeDeleteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
        if (boxCodeDelete.getText().trim().length() == 10) {
           evt.consume();
        }
    }//GEN-LAST:event_boxCodeDeleteKeyTyped

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
            java.util.logging.Logger.getLogger(Edit_DomesticAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_DomesticAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_DomesticAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_DomesticAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_DomesticAnimals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCode;
    private javax.swing.JTextField boxCodeDelete;
    private javax.swing.JTextField boxCodeEdit;
    private javax.swing.JTextField boxEditKidness;
    private javax.swing.JTextField boxEditName;
    private javax.swing.JTextField boxEditWeigth;
    private javax.swing.JTextField boxKidness;
    private javax.swing.JTextField boxName;
    private javax.swing.JTextField boxSpecies;
    private javax.swing.JTextField boxType;
    private javax.swing.JTextField boxWeigth;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
