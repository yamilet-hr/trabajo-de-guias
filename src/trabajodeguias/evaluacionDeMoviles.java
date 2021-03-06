/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodeguias;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author chente
 */
public class evaluacionDeMoviles extends javax.swing.JFrame {

    claseEvaluacionDeMoviles movil = new claseEvaluacionDeMoviles();
    boolean entrada=false;
    
    public evaluacionDeMoviles() {
        initComponents();
        setTitle("Evaluación de móviles");
        setLocationRelativeTo(null);
        setResizable(false);
        txtTotal.setEditable(false);
        bloquear();
    }
    public final void bloquear(){
        this.txtTam.setEnabled(false);
        this.txtBateria.setEnabled(false);
        this.txtPrecio.setEnabled(false);
        this.cmbMarca.setEnabled(false);
        this.txtRam.setEnabled(false);
        this.txtGarantia.setEnabled(false);
        this.cmbCpu.setEnabled(false);
        this.chkFlash.setEnabled(false);
        this.chkFrontal.setEnabled(false);
        this.chkTrasera.setEnabled(false);
    }
    public void desbloquear(){
        this.txtTam.setEnabled(true);
        this.txtBateria.setEnabled(true);
        this.txtPrecio.setEnabled(true);
        this.cmbMarca.setEnabled(true);
        this.txtRam.setEnabled(true);
        this.txtGarantia.setEnabled(true);
        this.cmbCpu.setEnabled(true);
        this.chkFlash.setEnabled(true);
        this.chkFrontal.setEnabled(true);
        this.chkTrasera.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBateria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chkTrasera = new javax.swing.JCheckBox();
        chkFrontal = new javax.swing.JCheckBox();
        chkFlash = new javax.swing.JCheckBox();
        txtTrasera = new javax.swing.JTextField();
        txtFrontal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmbCpu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Evalue su terminal");

        jLabel9.setText("Tamaño de pantalla");

        txtTam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTamKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamKeyTyped(evt);
            }
        });

        jLabel10.setText("Capacidad de la bateria");

        txtBateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBateriaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBateriaKeyTyped(evt);
            }
        });

        jLabel1.setText("CPU");

        jLabel3.setText("Precio");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel4.setText("RAM");

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRamKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        jLabel5.setText("Marca");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nexus", "Google", "Lenovo", "Huawei", "Sony", "Apple", "Samsung", "Alcatel", "Lg", "Otro" }));

        jLabel6.setText("Garantia");

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
        });

        jLabel7.setText("Camara");

        chkTrasera.setText("Trasera");

        chkFrontal.setText("Frontal");

        chkFlash.setText("Flash");

        txtTrasera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTraseraKeyTyped(evt);
            }
        });

        txtFrontal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrontalKeyTyped(evt);
            }
        });

        jLabel11.setText("El puntaje del movil es:");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmbCpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "2", "4", "6", "8", " " }));

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
                                .addGap(81, 81, 81)
                                .addComponent(chkTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(txtTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkFrontal)
                            .addComponent(txtFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(213, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTam, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtBateria)
                                    .addComponent(txtPrecio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(cmbMarca, 0, 151, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRam, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                            .addComponent(txtGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(cmbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(chkFlash, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkTrasera)
                        .addComponent(chkFlash))
                    .addComponent(chkFrontal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyTyped
        int c=3;
        
        if(txtTam.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtTamKeyTyped

    private void txtBateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBateriaKeyTyped
        int c=5;
        
        if(txtBateria.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtBateriaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int c=6;
        
        if(txtPrecio.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        int c=3;
        
        if(txtTam.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        int c=2;
        
        if(txtGarantia.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtTamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtBateria.requestFocus();
       }
    }//GEN-LAST:event_txtTamKeyPressed

    private void txtBateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBateriaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtPrecio.requestFocus();
       }
    }//GEN-LAST:event_txtBateriaKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtRam.requestFocus();
       }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtRamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtGarantia.requestFocus();
       }
    }//GEN-LAST:event_txtRamKeyPressed

    private void txtTraseraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTraseraKeyTyped
        int c=4;
        
        if(txtTrasera.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtTraseraKeyTyped

    private void txtFrontalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrontalKeyTyped
        int c=4;
        
        if(txtFrontal.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();   
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
    }//GEN-LAST:event_txtFrontalKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int valorPantalla,valorBateria,valorPrecio,valorRam,valorGarantia;
        double camara1,camara2,valorPrincipal,valorSecundario;
        
        if(entrada==true){
            if(this.txtTam.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo Tamaño de pantalla");
                this.txtTam.requestFocus();
            }else if(this.txtBateria.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo Capacidad de la bateria");
                this.txtBateria.requestFocus();
            }else if(this.txtPrecio.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campoPrecio");
            }else if(this.cmbMarca.getSelectedItem().equals("Seleccione")){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una marca");
            }else if(this.txtRam.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo Ram");
                this.txtRam.requestFocus();
            }else if(this.txtGarantia.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo Garantía");
                this.txtGarantia.requestFocus();
            }else if(this.cmbCpu.getSelectedItem().equals("Seleccione")){
                JOptionPane.showMessageDialog(null, "Debe seleccionar el número de núcleos del Cpu");
            }else if(!this.chkTrasera.isSelected()){
                JOptionPane.showMessageDialog(null, "Debe seleccionar la camara principal");
            }else if(this.txtTrasera.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo camara trasera");
                this.txtTrasera.requestFocus();
            }else if(!this.chkFrontal.isSelected()){
                JOptionPane.showMessageDialog(null, "Debe seleccionar la camara frontal");
            }else if(this.txtFrontal.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo camara frontal");
                this.txtFrontal.requestFocus();
            }else {
                valorPantalla=Integer.parseInt(this.txtTam.getText());
                valorBateria=Integer.parseInt(this.txtBateria.getText());
                valorPrecio=Integer.parseInt(this.txtPrecio.getText());
                valorRam=Integer.parseInt(this.txtRam.getText());
                valorGarantia=Integer.parseInt(this.txtGarantia.getText());
                String valorMarca;
                valorMarca = this.cmbMarca.getSelectedItem().toString();
                int valorCpu;
                valorCpu=this.cmbCpu.getSelectedIndex();
                valorPrincipal=Double.parseDouble(this.txtTrasera.getText());
                valorSecundario=Double.parseDouble(this.txtFrontal.getText());
                
                if(valorPantalla<1 || valorPantalla>7){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor entre 1 y 7");
                    this.txtTam.requestFocus();
                    this.txtTam.setText("");
                }else if(valorBateria<1 || valorBateria<=4000){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 4000");
                    this.txtBateria.requestFocus();
                    this.txtBateria.setText("");
                }else if(valorPrecio<1 || valorPrecio>800){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 800");
                    this.txtPrecio.requestFocus();
                    this.txtPrecio.setText("");
                }else if(valorRam<0 || valorRam>6){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 6");
                    this.txtRam.requestFocus();
                    this.txtRam.setText("");
                }else if(valorGarantia<1 || valorGarantia>24){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 24");
                    this.txtGarantia.requestFocus();
                    this.txtGarantia.setText("");
                }else if(valorPrincipal<1 || valorPrincipal>24){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 24");
                    this.txtTrasera.requestFocus();
                    this.txtTrasera.setText("");
                }else if(valorSecundario<1 || valorSecundario>8){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 8");
                    this.txtFrontal.requestFocus();
                    this.txtFrontal.setText("");
                }else{
                    movil.BateriaPantalla(valorPantalla, valorBateria);
                    movil.rangPrecio(valorPrecio);
                    movil.puntajeMarca(valorMarca);
                    movil.garantia(valorGarantia);
                    movil.pixelajeCamara(valorPrincipal, valorSecundario);
                    movil.cpu(valorCpu);
                    movil.ramEquipo(valorRam);
                    
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        entrada=true;
        desbloquear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuGuia3y4 vol=new menuGuia3y4();
        vol.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.txtTam.setText("");
        this.txtBateria.setText("");
        this.txtPrecio.setText("");
        this.cmbMarca.setSelectedIndex(0);
        this.txtRam.setText("");
        this.txtGarantia.setText("");
        this.cmbCpu.setSelectedIndex(0);
        this.chkFlash.setSelected(false);
        this.chkFrontal.setSelected(false);
        this.chkTrasera.setSelected(false);
        this.txtTam.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(evaluacionDeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeMoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evaluacionDeMoviles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkFlash;
    private javax.swing.JCheckBox chkFrontal;
    private javax.swing.JCheckBox chkTrasera;
    private javax.swing.JComboBox<String> cmbCpu;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBateria;
    private javax.swing.JTextField txtFrontal;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTam;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTrasera;
    // End of variables declaration//GEN-END:variables
}
