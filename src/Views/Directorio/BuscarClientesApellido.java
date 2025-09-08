
package Views.Directorio;


import Controllers.Contacto;
import Main.Principal;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class BuscarClientesApellido extends javax.swing.JInternalFrame {
     private DefaultTableModel modelo = new DefaultTableModel();
    
    public BuscarClientesApellido() {
        initComponents();
        this.setSize(650, 465);
        jtmodelo.setModel(modelo);
        armarCabecera();
        llenarListaApellido();
        
        jList1.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String apellidoSeleccionado = jList1.getSelectedValue();
            if (apellidoSeleccionado != null && !apellidoSeleccionado.trim().isEmpty()) {
                buscarYMostrar(apellidoSeleccionado); // ← ¡Ahora sí usa el valor de la lista!
            }
        }
    }
});
        
    }
    @SuppressWarnings("unchecked")
    private void llenarListaApellido() {
        DefaultListModel<String> modelo2 = new DefaultListModel<>();
        for (Contacto c : Main.Principal.contactos.getDirectorio().values()) {
           
            if (!modelo2.contains(c.getApellido()))
            {
                 modelo2.addElement(String.valueOf(c.getApellido()));
            }
        }
        
        jList1.setModel(modelo2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtmodelo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Clientes Por Apellido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Telefóno Por Apellido");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList1);

        jtmodelo.setBackground(new java.awt.Color(0, 102, 255));
        jtmodelo.setModel(new javax.swing.table.DefaultTableModel(
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
        jtmodelo.setAutoResizeMode(getHeight());
        jScrollPane2.setViewportView(jtmodelo);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   private void buscarYMostrar(String apellidoBuscado) {
    modelo.setRowCount(0);

    if (apellidoBuscado == null || apellidoBuscado.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Apellido no válido.", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    boolean encontrado = false;

    for (Contacto c : Principal.contactos.getDirectorio().values()) {
        if (c.getApellido().equalsIgnoreCase(apellidoBuscado)) {
            Object[] fila = {
                c.getDNI(),
                c.getNombre(),
                c.getApellido(),
                c.getDireccion(),
                c.getCiudad(),
                c.getTelefono()
            };
            modelo.addRow(fila);
            encontrado = true;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this,
            "No se encontraron contactos con el apellido: " + apellidoBuscado,
            "Sin resultados",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
   
   
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtmodelo;
    // End of variables declaration//GEN-END:variables

   private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono");
        jtmodelo.setModel(modelo);

    }
    
    
/*
             /\_/\           ___
            = o_o =_______    \ \
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */

}
