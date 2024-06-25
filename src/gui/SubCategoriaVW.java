/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import crudprincesa.WindowUtils;
import db.BDConnection;
import db.InformacionBD;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EMMANUEL
 */
public class SubCategoriaVW extends javax.swing.JFrame {

    /**
     * Creates new form SubCategoriaVW
     */
    public SubCategoriaVW() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        loadSubCategoriaData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNombreSubCat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCategoriaPadre = new javax.swing.JTextField();
        btnVolverSub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-48.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("AGREGAR SUBCATEGORIA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nombre", "id_categoria"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("NOMBRE DE SUBCATEGORIA");

        jLabel3.setText("ID CATEGORIA PERTENECIENTE");

        txtIdCategoriaPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaPadreActionPerformed(evt);
            }
        });
        txtIdCategoriaPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCategoriaPadreKeyTyped(evt);
            }
        });

        btnVolverSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-volver.png"))); // NOI18N
        btnVolverSub.setText("VOLVER");
        btnVolverSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(txtIdCategoriaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreSubCat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btnVolverSub)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolverSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreSubCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCategoriaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Statement st = null;

        try {
            String name_db = "test";
            // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión con la base de datos
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_db
                    + "?useSSL=false", "root", "password");

            // Obtener el texto del usuario y la contraseña
            String nombre = txtNombreSubCat.getText();
            String idsub = txtIdCategoriaPadre.getText();
           

            if (isValidForm(nombre, idsub) == false) {
                // JOptionPane.showMessageDialog(null, "Faltan datos por llenar");
            } else {
                // Crear la consulta SQL usando PreparedStatement para evitar inyección SQL
                String sql = "INSERT INTO subcategoria (nombre, id_categoria) VALUES (?, ?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setInt(2, Integer.parseInt(idsub));
                // pst.setString(2, idsub);

                // Ejecutar la consulta de inserción
                int rowsAffected = pst.executeUpdate();

                // Verificar si la inserción fue exitosa
                if (rowsAffected > 0) {
                    InformacionBD inf = new InformacionBD();
                    // Acción al insertar correctamente el usuario
                    JOptionPane.showMessageDialog(null, "Sub categoria registrada exitosamente");

                    // Crear la consulta SQL para obtener los datos
                    String sql_2 = "SELECT * FROM subcategoria";
                    st = con.createStatement();
                    rs = st.executeQuery(sql_2);

                    // Obtener el modelo de la tabla
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                    //inf.loadInformacion(sql, st, rs, tblModel);
                     loadSubCategoriaData();
                     limpiarCampos();
                    /*
            // Limpiar la tabla antes de agregar nuevos datos
            tblModel.setRowCount(0);

            // Añadir filas de datos al modelo de tabla
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String tnombre = rs.getString("nombre");
                String tapellido = rs.getString("apellido");
                String ttelefono = rs.getString("telefono");
                String tcorreo = rs.getString("correo");
                String tdireccion = rs.getString("direccion");

                String tbData[] = {id, tnombre, tapellido, ttelefono, tcorreo, tdireccion};
                tblModel.addRow(tbData);
            }*/
                } else {
                    // Mostrar mensaje de error en la inserción
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            // Cerrar el ResultSet, el Statement, el PreparedStatement y la conexión
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int a = JOptionPane.showConfirmDialog((Component) null, "¿Quieres eliminar?", "DELETE", JOptionPane.YES_NO_OPTION);
        System.out.println("Valor de a:" + a);
        if (a == 0) {
            int row = jTable1.getSelectedRow();
            if (row != -1) { // Asegúrate de que hay una fila seleccionada
                String call = jTable1.getModel().getValueAt(row, 0).toString();
                String sql = "DELETE FROM subcategoria WHERE id = " + call;
                System.out.println("SQL: " + sql); // Imprimir la consulta SQL para verificarla

                BDConnection dbConnection = new BDConnection();
                Connection con = null;
                PreparedStatement pst = null;

                try {
                    con = dbConnection.getConnection();
                    pst = con.prepareStatement(sql);
                    int affectedRows = pst.executeUpdate(); // Usar executeUpdate() para operaciones de modificación
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Eliminado correctamente");

                        // Eliminar la fila del modelo de la tabla
                        ((DefaultTableModel) jTable1.getModel()).removeRow(row);

                        // updateTable(); // Si tienes un método para actualizar la tabla, puedes llamarlo aquí
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el registro para eliminar.");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el dato: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    try {
                        if (pst != null) {
                            pst.close();
                        }
                        if (con != null) {
                            con.close(); // Cerrar la conexión aquí
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

     public boolean isValidForm(String nombre, String idsub) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la subcategoria");
            return false;
        }
        if (idsub.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el id padre");
            return false;
        }
        return true;
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /*
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        String tblNombre = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblApellidos = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblTelefono = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblCorreo = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblDomicilio = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();

        txtNombre.setText(tblNombre);
        txtApellidos.setText(tblApellidos);
        txtTelefono.setText(tblTelefono);
        txtCorreo.setText(tblCorreo);
        txtDomicilio.setText(tblDomicilio);
        */
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSubActionPerformed
        InventarioVW invVW = new InventarioVW();
        invVW.setVisible(true);
        WindowUtils.close(this); 
    }//GEN-LAST:event_btnVolverSubActionPerformed

    private void txtIdCategoriaPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaPadreActionPerformed
     
    }//GEN-LAST:event_txtIdCategoriaPadreActionPerformed

    private void txtIdCategoriaPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCategoriaPadreKeyTyped
       char c = evt.getKeyChar();
       
       if(!Character.isDigit(c)){
           evt.consume();
       }
    }//GEN-LAST:event_txtIdCategoriaPadreKeyTyped

    
     private void loadSubCategoriaData() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "password");
            String sql = "SELECT * FROM subcategoria";
            st = con.createStatement();
            rs = st.executeQuery(sql);

            // Obtener el modelo de la tabla
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            loadInformacionSUBCAT(sql, st, rs, tblModel);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            // Cerrar el ResultSet, el Statement y la conexión
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

      public void limpiarCampos(){
       txtNombreSubCat.setText("");
       txtIdCategoriaPadre.setText("");
    }
     
    public void loadInformacionSUBCAT(String sql, Statement st, ResultSet rs, DefaultTableModel tblModel) throws SQLException {
        // Limpiar la tabla antes de agregar nuevos datos
        tblModel.setRowCount(0);
        // Añadir filas de datos al modelo de tabla
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("id"));
            String tnombre = rs.getString("nombre");
            String tnombre_categoria = rs.getString("id_categoria");
            String tbData[] = {id,tnombre,tnombre_categoria};
            tblModel.addRow(tbData);
        }
    }
    
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
            java.util.logging.Logger.getLogger(SubCategoriaVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubCategoriaVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubCategoriaVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubCategoriaVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubCategoriaVW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolverSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdCategoriaPadre;
    private javax.swing.JTextField txtNombreSubCat;
    // End of variables declaration//GEN-END:variables
}