
package trabajodeguias;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author chente
 */
public class evaluacionDeEquipos extends javax.swing.JFrame {

    DefaultListModel modeloDatos = new DefaultListModel();
    DefaultComboBoxModel modeloMarcas = new DefaultComboBoxModel();
    boolean entrada= false;
    
    public evaluacionDeEquipos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Puntaje de equipos");
        cargarMarcas();
        bloquear();
    }
    public final void cargarMarcas(){
        String [] marcas= {"Seleccione","NEXUS","PIXIE","LENOVO","HUAWEI","SONY","APPLE","SAMSUGN","ALCATEL","LG","Otra"};
        modeloMarcas= new DefaultComboBoxModel(marcas);
        cmbMarcas.setModel(modeloMarcas);
    }
    public void bloquear(){
      this.txtCpu.setEnabled(false);
      this.txtGarantia.setEnabled(false);
      this.txtPantalla.setEnabled(false);
      this.txtPrecio.setEnabled(false);
      this.txtPrincipal.setEnabled(false);
      this.txtRam.setEnabled(false);
      this.txtSecundaria.setEnabled(false);
      this.cmbMarcas.setEnabled(false);
      this.btnLimpiar.setEnabled(false);
      this.btnProcesar.setEnabled(false);
      this.chbFlash.setEnabled(false);
      this.chbPrincipal.setEnabled(false);
      this.chbSecundaria.setEnabled(false);
    }
    public void desbloquear(){
      this.txtCpu.setEnabled(true);
      this.txtGarantia.setEnabled(true);
      this.txtPantalla.setEnabled(true);
      this.txtPrecio.setEnabled(true);
      //this.txtPrincipal.setEnabled(true);
      this.txtRam.setEnabled(true);
      //this.txtSecundaria.setEnabled(true);
      this.cmbMarcas.setEnabled(true);
      this.btnLimpiar.setEnabled(true);
      this.btnProcesar.setEnabled(true);
      this.chbFlash.setEnabled(true);
      this.chbPrincipal.setEnabled(true);
      this.chbSecundaria.setEnabled(true);
    }
    public void limpiar(){
      this.txtCpu.setText("");
      this.txtGarantia.setText("");
      this.txtPantalla.setText("");
      this.txtPrecio.setText("");
      this.txtPrincipal.setText("");
      
      this.txtRam.setText("");
      this.txtSecundaria.setText("");
      
      this.cmbMarcas.setSelectedIndex(0);
      this.chbFlash.setSelected(false);
      this.chbPrincipal.setSelected(false);
      this.chbSecundaria.setSelected(false);
      
     // this.chbFlash.setEnabled(false);
      //this.chbSecundaria.setEnabled(false);
      //this.chbPrincipal.setEnabled(false);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbMarcas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chbPrincipal = new javax.swing.JCheckBox();
        chbSecundaria = new javax.swing.JCheckBox();
        chbFlash = new javax.swing.JCheckBox();
        txtPrincipal = new javax.swing.JTextField();
        txtSecundaria = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDatos = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Puntaje de equipos");

        jLabel2.setText("CPU número de núcleos");

        txtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpuKeyTyped(evt);
            }
        });

        jLabel3.setText("Tamaño de pantalla");

        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPantallaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad de RAM");

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRamKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        jLabel5.setText("Tiempo de garantía ");

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
        });

        jLabel6.setText("Precio");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel7.setText("Marca");

        jLabel8.setText("Cámara");

        chbPrincipal.setText("Principal");
        chbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPrincipalActionPerformed(evt);
            }
        });

        chbSecundaria.setText("Secundaria");
        chbSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSecundariaActionPerformed(evt);
            }
        });

        chbFlash.setText("Flash");

        txtPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrincipalKeyTyped(evt);
            }
        });

        txtSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecundariaKeyTyped(evt);
            }
        });

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstDatos);

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCpu, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(txtPantalla)
                                        .addComponent(txtRam)
                                        .addComponent(txtGarantia)
                                        .addComponent(txtPrecio))
                                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnProcesar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPrincipal)
                                            .addComponent(chbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chbSecundaria)
                                        .addGap(18, 18, 18)
                                        .addComponent(chbFlash))
                                    .addComponent(txtSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbPrincipal)
                    .addComponent(chbSecundaria)
                    .addComponent(chbFlash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyTyped
        int c=2;
        if(txtCpu.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) ){
            evt.consume();
        }
    }//GEN-LAST:event_txtCpuKeyTyped

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        int c=3;
        if(txtPantalla.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtPantalla.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtGarantia.requestFocus();
        }
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        int c=3;
        if(txtRam.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtRam.getText().contains(".")){
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
        if(evt.getKeyChar()=='.' && txtGarantia.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int c=6;
        if(txtPrecio.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtPrecio.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipalKeyTyped
        int c=4;
        if(txtPrincipal.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtPrincipal.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrincipalKeyTyped

    private void txtSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecundariaKeyTyped
        int c=3;
        if(txtSecundaria.getText().length()>=c){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && txtSecundaria.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtSecundariaKeyTyped

    private void txtCpuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtPantalla.requestFocus();
       }
    }//GEN-LAST:event_txtCpuKeyPressed

    private void txtPantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtRam.requestFocus();
       }
    }//GEN-LAST:event_txtPantallaKeyPressed

    private void txtRamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtGarantia.requestFocus();
       }
    }//GEN-LAST:event_txtRamKeyPressed

    private void txtGarantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.txtPrecio.requestFocus();
       }
    }//GEN-LAST:event_txtGarantiaKeyPressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquear();
        this.txtCpu.requestFocus();
        entrada=true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        Double valorCpu, valorPantalla, valorRam, valorGarantia, valorPrecio;
        Double Pantalla,Ram,Precio,camara1,camara2,camara3,camara4;
        int Cpu,Garantia,valor;
        String Marca;
        
        if(entrada==true){
            if(this.txtCpu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "El campo Número de nucleos esta vacio");
                this.txtCpu.requestFocus();
            }else if(this.txtPantalla.getText().equals("")){
                JOptionPane.showMessageDialog(null, "El campo Tamaño de pantalla esta vacio");
                this.txtPantalla.requestFocus();
            }else if(this.txtRam.getText().equals("")){
                JOptionPane.showMessageDialog(null, "El campo Cantidad de RAM esta vacio");
                this.txtRam.requestFocus();
            }else if(this.txtGarantia.getText().equals("")){
                JOptionPane.showMessageDialog(null, "El campo Tiempo de garantía esta vacio");
                this.txtGarantia.requestFocus();
            }else if(this.txtPrecio.getText().equals("")){
                JOptionPane.showMessageDialog(null, "El campo Precio esta vacio");
                this.txtPrecio.requestFocus();
            }else if(this.cmbMarcas.getSelectedItem().equals("Seleccione")){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una Marca");
            }else{
                valorCpu=Double.parseDouble(this.txtCpu.getText());
                valorPantalla=Double.parseDouble(this.txtPantalla.getText());
                valorRam=Double.parseDouble(this.txtPantalla.getText());
                valorGarantia=Double.parseDouble(this.txtGarantia.getText());
                valorPrecio=Double.parseDouble(this.txtPrecio.getText());
                
                if(valorCpu<1 || valorCpu>12){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número entre 1 y 12");
                    this.txtCpu.requestFocus();
                    this.txtCpu.setText("");
                }else if(valorPantalla<3 || valorPantalla>6.7){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 3 y 6.7");
                    this.txtPantalla.requestFocus();
                    this.txtPantalla.setText("");
                }else if(valorRam<0.5 || valorRam>6.0){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 0.5 y 6.0");
                    this.txtRam.requestFocus();
                    this.txtRam.setText("");
                }else if(valorGarantia<1 || valorGarantia>24){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 1 y 24");
                    this.txtGarantia.requestFocus();
                    this.txtGarantia.setText("");
                }else if(valorPrecio<0.01 || valorPrecio>999.99){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor entre 0.01 y 999.99");
                    this.txtPrecio.requestFocus();
                    this.txtPrecio.setText("");
                }else if(!this.chbPrincipal.isSelected() && !this.chbSecundaria.isSelected()){
                    JOptionPane.showMessageDialog(null, "Seleccione una camara");
                }else{
  
                    Cpu=Integer.parseInt(this.txtCpu.getText());
                    modeloDatos.addElement("La cantidad de nucleos es de: "+Cpu);
                    Pantalla=Double.parseDouble(this.txtPantalla.getText());
                    modeloDatos.addElement("El tamaño de la pantalla es de: "+Pantalla);
                    Ram=Double.parseDouble(this.txtRam.getText());
                    modeloDatos.addElement("La RAM es de: "+Ram);
                    Garantia=Integer.parseInt(this.txtGarantia.getText());
                    modeloDatos.addElement("La garantía es de: "+Garantia+" meses");
                    Precio=Double.parseDouble(this.txtPrecio.getText());
                    modeloDatos.addElement("El precio es de: $"+Precio);
                    Marca=this.cmbMarcas.getSelectedItem().toString();
                    modeloDatos.addElement("La marca es: "+Marca);
              
                    
                    if(this.chbPrincipal.isSelected()){
                        camara1=Double.parseDouble(this.txtPrincipal.getText());
                        modeloDatos.addElement("La cámara principal es de: "+camara1+" mpx");
                    }else if(this.chbSecundaria.isSelected()){
                        camara2=Double.parseDouble(this.txtSecundaria.getText());
                        modeloDatos.addElement("La cámara secundaria es de: "+camara2+" mpx");   
                    }else{
                        camara3=Double.parseDouble(this.txtPrincipal.getText());
                        camara4=Double.parseDouble(this.txtSecundaria.getText());
                        modeloDatos.addElement("La cámara principal es: "+camara3+" mpx y la cámara secundaria es de: "+camara4);
                    }
                    if(this.chbFlash.isSelected()){
                      modeloDatos.addElement("El equipo cuenta con Flash: SI");
                    }else{
                        modeloDatos.addElement("El equipo cuneta con Flash: NO");
                    }
                    this.btnProcesar.setEnabled(false);
                }
            }
        }
        lstDatos.setModel(modeloDatos);
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void chbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPrincipalActionPerformed
        if(this.chbPrincipal.isSelected()){
            this.txtPrincipal.setEnabled(true);
        }else{
            this.txtPrincipal.setEnabled(false);
        }
    }//GEN-LAST:event_chbPrincipalActionPerformed

    private void chbSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSecundariaActionPerformed
        if(this.chbSecundaria.isSelected()){
            this.txtSecundaria.setEnabled(true);
        }else{
            this.txtSecundaria.setEnabled(false);
        }
    }//GEN-LAST:event_chbSecundariaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        this.txtCpu.requestFocus();
        this.txtPrincipal.setEnabled(false);
        this.txtSecundaria.setEnabled(false);
        this.btnProcesar.setEnabled(true);
        this.modeloDatos.clear();
        
        entrada=false;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuGuia3y4 volv = new menuGuia3y4();
        volv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(evaluacionDeEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evaluacionDeEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evaluacionDeEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JCheckBox chbFlash;
    private javax.swing.JCheckBox chbPrincipal;
    private javax.swing.JCheckBox chbSecundaria;
    private javax.swing.JComboBox<String> cmbMarcas;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstDatos;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables
}
