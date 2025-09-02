package Views.Clientes;

import Controllers.Ciudad;
import Controllers.Contacto;

import javax.swing.JOptionPane;
import Main.Principal;

public class AgregarClientes extends javax.swing.JInternalFrame {

  public AgregarClientes() {
    initComponents();
    this.setSize(500, 500);
    cargarCombo();

  }

  private void cargarCombo() {
    jComboCiudad.removeAllItems();
    jComboCiudad.addItem(null);
    for (Ciudad c : Principal.ciudades) {
      jComboCiudad.addItem(c.getCiudad());
    }

  }

  // @SuppressWarnings( "unchecked" )
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jTextDNI = new javax.swing.JTextField();
    jTextNombre = new javax.swing.JTextField();
    jTextApellido = new javax.swing.JTextField();
    jTextDomicilio = new javax.swing.JTextField();
    jComboCiudad = new javax.swing.JComboBox<>();
    jPanel2 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jTextTelefono = new javax.swing.JTextField();
    jBotonGuardar = new javax.swing.JButton();
    jBotonSalir = new javax.swing.JButton();

    setClosable(true);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Agregar Clientes");

    jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
    jLabel1.setText("Agregar Clientes");

    jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel2.setText("DNI");

    jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel3.setText("Nomrbe");

    jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel4.setText("Ciudad");

    jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel5.setText("Apellido");

    jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel6.setText("Domicilio");

    jTextDNI.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextDNIActionPerformed(evt);
      }
    });

    jTextNombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextNombreActionPerformed(evt);
      }
    });

    jTextApellido.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextApellidoActionPerformed(evt);
      }
    });

    jTextDomicilio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextDomicilioActionPerformed(evt);
      }
    });

    jComboCiudad.setModel(
        new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    jComboCiudad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboCiudadActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE,
                            230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.TRAILING,
                                    false)
                                    .addComponent(jTextApellido,
                                        javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        122, Short.MAX_VALUE)
                                    .addComponent(jTextNombre,
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDNI,
                                        javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jComboCiudad,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        123,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextDNI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextApellido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)));

    jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    jLabel7.setText("Telefono");

    jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextTelefonoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE)));

    jBotonGuardar.setText("Guardar");
    jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBotonGuardarActionPerformed(evt);
      }
    });

    jBotonSalir.setText("Salir");
    jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBotonSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                            .createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jBotonGuardar)
                            .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                            layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING,
                                    false)
                                    .addComponent(jPanel1,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(jPanel2,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonGuardar)
                    .addComponent(jBotonSalir))
                .addContainerGap(21, Short.MAX_VALUE)));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // TEXTO DNI //
  private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextDNIActionPerformed

  }// GEN-LAST:event_jTextDNIActionPerformed
   // TEXTO DNI //

  // TEXTO NOMBRE //
  private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextNombreActionPerformed

  }// GEN-LAST:event_jTextNombreActionPerformed
   // TEXTO NOMBRE //

  // TEXTO APELLIDO //
  private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextApellidoActionPerformed

  }// GEN-LAST:event_jTextApellidoActionPerformed
   // TEXTO APELLIDO //

  // TEXTO CIUDAD //
  private void jComboCiudadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboCiudadActionPerformed

  }// GEN-LAST:event_jComboCiudadActionPerformed
   // TEXTO CIUDAD //

  // TEXTO DOMICILIO //
  private void jTextDomicilioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextDomicilioActionPerformed

  }// GEN-LAST:event_jTextDomicilioActionPerformed
   // TEXTO DOMICILIO //

  // TEXTO TELEFONO //
  private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextTelefonoActionPerformed

  }// GEN-LAST:event_jTextTelefonoActionPerformed
   // TEXTO TELEFONO //

  // BOTON GUARDAR //
  private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBotonGuardarActionPerformed

    String dni = jTextDNI.getText();
    String nombre = jTextNombre.getText();
    String apellido = jTextApellido.getText();
    String ciudad = jComboCiudad.getSelectedItem().toString();
    String direccion = jTextDomicilio.getText();
    String telefono = jTextTelefono.getText();

    // NO DEJAR QUE DEJA ALGO VACIO
    if (dni.isEmpty()) {
      JOptionPane.showMessageDialog(null, "El DNI no puede estar vacio..");
      return;
    }
    if (nombre.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Nombre no puede estar vacio..");
      return;
    }
    if (apellido.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Apellido no puede estar vacio..");
      return;
    }
    if (ciudad.isEmpty()) {
      JOptionPane.showMessageDialog(null, "La ciudad no puede estar vacia..");
      return;
    }
    if (direccion.isEmpty()) {
      JOptionPane.showMessageDialog(null, "domicilio no puede estar vacio..");
      return;
    }
    if (telefono.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Telefono no puede estar vacio..");
      return;
    }

    // CONVERTIR DNI Y TELEFONO A INT Y MAS VERIFICACIONES//
    int dniINT;
    Long telefonoLong;
    try {
      dniINT = Integer.parseInt(dni);
      telefonoLong = Long.parseLong(telefono);
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Numero no valido. :/, en DNI o Telefono");
      return;
    }
    if (dniINT <= 0 && telefonoLong <= 0) {
      JOptionPane.showMessageDialog(null, "El numero no puede ser negativo. :%");
    }

    Principal.contactos.agregarContacto(new Contacto(dniINT, nombre, apellido, ciudad, direccion, telefonoLong));

    for (Contacto contacto : Principal.contactos.getDirectorio().values()) {
      System.out.println("Nombre: " + contacto.getNombre() +
          " | Teléfono: " + contacto.getCiudad());
    }

  }// GEN-LAST:event_jBotonGuardarActionPerformed
   // BOTON GUARDAR //

  // BOTON SALIR //
  private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBotonSalirActionPerformed
    this.setVisible(false);
  }// GEN-LAST:event_jBotonSalirActionPerformed
   // BOTON SALIR //

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBotonGuardar;
  private javax.swing.JButton jBotonSalir;
  private javax.swing.JComboBox<String> jComboCiudad;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField jTextApellido;
  private javax.swing.JTextField jTextDNI;
  private javax.swing.JTextField jTextDomicilio;
  private javax.swing.JTextField jTextNombre;
  private javax.swing.JTextField jTextTelefono;
  // End of variables declaration//GEN-END:variables

  /*
   * /\_/\ ___
   * = o_o =_______ \ \
   * __^ __( \.__) )
   * (@)<_____>__(_____)____/
   */
}
