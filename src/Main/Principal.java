package Main;

import Controllers.Ciudad;
import Controllers.Contacto;
import Controllers.DirectorioCiudades;
import Controllers.DirectorioTelefonico;
import Views.Ciudades.AgregarCiudad;
import Views.Clientes.AgregarClientes;
import Views.Clientes.BorrarClientes;
import Views.Clientes.BuscarClientes;
import Views.Directorio.BuscarClientesApellido;
import Views.Directorio.BuscarClientesCiudad;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public static ArrayList<Ciudad> ciudades=new DirectorioCiudades().getCiudades();
    public static DirectorioTelefonico contactos=new DirectorioTelefonico();

    public Principal() {
        initComponents();

    }

    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jAgregarClientes = new javax.swing.JMenuItem();
        jBuscarClientes = new javax.swing.JMenuItem();
        jBorrarClientes = new javax.swing.JMenuItem();
        jMenuDirectorio = new javax.swing.JMenu();
        jBuscarClientesCiudad = new javax.swing.JMenuItem();
        jBuscarClientesApellido = new javax.swing.JMenuItem();
        jMenuCiudades = new javax.swing.JMenu();
        jAgregarCiudad = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgEscritorio.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
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

        jBuscarClientesCiudad.setText("Buscar Clientes por Apellido");
        jBuscarClientesCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClientesCiudadActionPerformed(evt);
            }
        });
        jMenuDirectorio.add(jBuscarClientesCiudad);

        jBuscarClientesApellido.setText("Buscar Clientes por Ciudad");
        jBuscarClientesApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClientesApellidoActionPerformed(evt);
            }
        });
        jMenuDirectorio.add(jBuscarClientesApellido);

        jMenuBar.add(jMenuDirectorio);

        jMenuCiudades.setText("Ciudades");

        jAgregarCiudad.setText("Agregar Ciudad");
        jAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarCiudadActionPerformed(evt);
            }
        });
        jMenuCiudades.add(jAgregarCiudad);

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

        int respuesta=JOptionPane.showConfirmDialog(this, "Esta seguro ?", "Confirmar Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if( respuesta==JOptionPane.YES_OPTION ) {
            dispose();
            System.exit(0);
        }

    }//GEN-LAST:event_jSalirMouseClicked
    // BOTON SALIR

    // VENTANA AGREGAR CLIENTES
    private void jAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClientesActionPerformed

        AgregarClientes agregarClientes=new AgregarClientes();
        jDesktopPane1.add(agregarClientes);
        int x=(jDesktopPane1.getWidth()-agregarClientes.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-agregarClientes.getHeight())/2;
        agregarClientes.setLocation(x, y);
        agregarClientes.setVisible(true);

    }//GEN-LAST:event_jAgregarClientesActionPerformed
    // VENTANA AGREGAR CLIENTES

    // VENTANA BUSCAR CLIENTES
    private void jBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesActionPerformed

        BuscarClientes buscarClientes=new BuscarClientes();
        jDesktopPane1.add(buscarClientes);
        int x=(jDesktopPane1.getWidth()-buscarClientes.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-buscarClientes.getHeight())/2;
        buscarClientes.setLocation(x, y);
        buscarClientes.setVisible(true);

    }//GEN-LAST:event_jBuscarClientesActionPerformed
    // VENTANA BUSCAR CLIENTES

    // VENTANA BORRAR CLIENTES
    private void jBorrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarClientesActionPerformed

        BorrarClientes borrarClientes=new BorrarClientes();
        jDesktopPane1.add(borrarClientes);
        int x=(jDesktopPane1.getWidth()-borrarClientes.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-borrarClientes.getHeight())/2;
        borrarClientes.setLocation(x, y);
        borrarClientes.setVisible(true);

    }//GEN-LAST:event_jBorrarClientesActionPerformed
    // VENTANA BORRAR CLIENTES

    // VENTANA BUSCAR CLIENTES CIUDAD
    private void jBuscarClientesCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesCiudadActionPerformed

        BuscarClientesApellido buscaAClientes=new BuscarClientesApellido();
        jDesktopPane1.add(buscaAClientes);
        int x=(jDesktopPane1.getWidth()-buscaAClientes.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-buscaAClientes.getHeight())/2;
        buscaAClientes.setLocation(x, y);
        buscaAClientes.setVisible(true);

    }//GEN-LAST:event_jBuscarClientesCiudadActionPerformed
    // VENTANA BUSCAR CLIENTES CIUDAD

    // VENTANA BUSCAR CLIENTES APELLIDO
    private void jBuscarClientesApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClientesApellidoActionPerformed

        BuscarClientesCiudad buscaCClientes=new BuscarClientesCiudad();
        jDesktopPane1.add(buscaCClientes);
        int x=(jDesktopPane1.getWidth()-buscaCClientes.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-buscaCClientes.getHeight())/2;
        buscaCClientes.setLocation(x, y);
        buscaCClientes.setVisible(true);

    }//GEN-LAST:event_jBuscarClientesApellidoActionPerformed

    private void jAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarCiudadActionPerformed
        AgregarCiudad agregarCiudad=new AgregarCiudad();
        jDesktopPane1.add(agregarCiudad);
        int x=(jDesktopPane1.getWidth()-agregarCiudad.getWidth())/2;
        int y=(jDesktopPane1.getHeight()-agregarCiudad.getHeight())/2;
        agregarCiudad.setLocation(x, y);
        agregarCiudad.setVisible(true);
    }//GEN-LAST:event_jAgregarCiudadActionPerformed
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
                // Agregar contacto de prueba
                // DirectorioTelefonico directorio = new DirectorioTelefonico();
                Contacto contacto2=new Contacto(46617010, "Esteban", "Redon", "San Luis", "Barrio jardin San Luis",
                  2664552752L);
                contactos.agregarContacto(contacto2);
                Contacto c1 = new Contacto(20904283,"Juan", "Fernandez", "Cordoba", "Alberdi",2644158282l);       
                Contacto c2 = new Contacto(20904283,"Mateo", "Fernandez", "Buenos Aires", "Pilar",261738282l);
                Contacto c3 = new Contacto(20904283,"Ticiana", "Aguilar", "Buenos Aires", "Palermo",36737735l);            
                Contacto c4 = new Contacto(20904283,"Florencia", "Torres", "San Luis", "Juana Koslay",364677l);              
                Contacto c5 = new Contacto(20904283,"Pedro", "Quiroga", "Cordoba", "Tablada",261738282l);
                contactos.agregarContacto(c1);
                contactos.agregarContacto(c2);
                contactos.agregarContacto(c3);
                contactos.agregarContacto(c4);
                contactos.agregarContacto(c5);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAgregarCiudad;
    private javax.swing.JMenuItem jAgregarClientes;
    private javax.swing.JMenuItem jBorrarClientes;
    private javax.swing.JMenuItem jBuscarClientes;
    private javax.swing.JMenuItem jBuscarClientesApellido;
    private javax.swing.JMenuItem jBuscarClientesCiudad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCiudades;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuDirectorio;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables

    /*
             /\_/\           ___
            = o_o =_______    \ \
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
     */
}
