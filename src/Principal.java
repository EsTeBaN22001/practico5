
import javax.swing.JOptionPane;



public class Principal extends javax.swing.JFrame {
    
    
    public Principal() {
        initComponents();
        
        
        
    }
    
    
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jAgregarClientes = new javax.swing.JMenuItem();
        jBuscarClientes = new javax.swing.JMenuItem();
        jBorrarClientes = new javax.swing.JMenuItem();
        jMenuDirectorio = new javax.swing.JMenu();
        jBuscarClientesCiudad = new javax.swing.JMenuItem();
        jBuscarClientesApellido = new javax.swing.JMenuItem();
        jMenuCiudades = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        jMenuClientes.setText("Clientes");

        jAgregarClientes.setText("Agregar Clientes");
        jAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jAgregarClientes);

        jBuscarClientes.setText("Buscar Clientes");
        jBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jBuscarClientes);

        jBorrarClientes.setText("Borrar Clientes");
        jBorrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jBorrarClientes);

        jMenuBar.add(jMenuClientes);

        jMenuDirectorio.setText("Directorio");

        jBuscarClientesCiudad.setText("Buscar Clientes por Ciudad");
        jBuscarClientesCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClientesCiudadActionPerformed(evt);
            }
        });
        jMenuDirectorio.add(jBuscarClientesCiudad);

        jBuscarClientesApellido.setText("Buscar Clientes por Apellido");
        jBuscarClientesApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClientesApellidoActionPerformed(evt);
            }
        });
        jMenuDirectorio.add(jBuscarClientesApellido);

        jMenuBar.add(jMenuDirectorio);

        jMenuCiudades.setText("Ciudades");
        jMenuBar.add(jMenuCiudades);

        jSalir.setText("Salir");
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });
        jMenuBar.add(jSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTON SALIR 
    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        
        int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro ?", "Confirmar Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if( respuesta == JOptionPane.YES_OPTION ) {
            dispose();
            System.exit(0);
        }

    }//GEN-LAST:event_jSalirMouseClicked
    // BOTON SALIR 
    
    // VENTANA AGREGAR CLIENTES 
    private void jAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClientesActionPerformed
        
        //BorrarAlumno borrar = new BorrarAlumno();
        //jDesktopPane1.add(borrar);
        //int x = (jDesktopPane1.getWidth() - borrar.getWidth()) / 2;
        //int y = (jDesktopPane1.getHeight() - borrar.getHeight()) / 2;
        //borrar.setLocation(x, y);
        //borrar.setVisible(true);
        
    }//GEN-LAST:event_jAgregarClientesActionPerformed
    // VENTANA AGREGAR CLIENTES 
    
    
    // VENTANA BUSCAR CLIENTES 
    private void jBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesActionPerformed
        
        
        
    }//GEN-LAST:event_jBuscarClientesActionPerformed
    // VENTANA BUSCAR CLIENTES 
    
    // VENTANA BORRAR CLIENTES 
    private void jBorrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarClientesActionPerformed
        
        
        
    }//GEN-LAST:event_jBorrarClientesActionPerformed
    // VENTANA BORRAR CLIENTES 
    
    
    // VENTANA BUSCAR CLIENTES CIUDAD
    private void jBuscarClientesCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesCiudadActionPerformed

    }//GEN-LAST:event_jBuscarClientesCiudadActionPerformed
    // VENTANA BUSCAR CLIENTES CIUDAD
    
    
    // VENTANA BUSCAR CLIENTES APELLIDO
    private void jBuscarClientesApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesApellidoActionPerformed
        
    }//GEN-LAST:event_jBuscarClientesApellidoActionPerformed
    // VENTANA BUSCAR CLIENTES APELLIDO
    
    
    
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if( "Nimbus".equals(info.getName()) ) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( InstantiationException ex ) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAgregarClientes;
    private javax.swing.JMenuItem jBorrarClientes;
    private javax.swing.JMenuItem jBuscarClientes;
    private javax.swing.JMenuItem jBuscarClientesApellido;
    private javax.swing.JMenuItem jBuscarClientesCiudad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCiudades;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuDirectorio;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables




}
