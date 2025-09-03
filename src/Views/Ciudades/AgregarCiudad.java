package Views.Ciudades;

import Controllers.Ciudad;
import Controllers.DirectorioCiudades;
import javax.swing.JOptionPane;

public class AgregarCiudad extends javax.swing.JInternalFrame {

    private Ciudad Ciudad;

    public AgregarCiudad() {
        initComponents();
        this.setSize(400, 250);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCiudad = new javax.swing.JTextField();
        jBotonSalir = new javax.swing.JButton();
        jBotonGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("AgregarCiudad");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Agregar una Ciudad");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jTextCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCiudadActionPerformed(evt);
            }
        });

        jBotonSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBotonSalir.setText("Salir");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jBotonGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonSalir)
                    .addComponent(jBotonGuardar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        
        String nombre = jTextCiudad.getText();
        Ciudad nuevaCiudad = new Ciudad(nombre);
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la ciudad no puede estar vacío.");
            return;
        }
        if (Main.Principal.ciudades.contains(nuevaCiudad)) {
            JOptionPane.showMessageDialog(this, "La ciudad ya existe.");
            return;
        }
        Main.Principal.ciudades.add(nuevaCiudad);
        jTextCiudad.setText("");
        jTextCiudad.requestFocus();
        JOptionPane.showMessageDialog(this, "Ciudad agregada con éxito.");
        
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jTextCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCiudadActionPerformed
    }//GEN-LAST:event_jTextCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextCiudad;
    // End of variables declaration//GEN-END:variables



}
