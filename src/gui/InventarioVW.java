/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import crudprincesa.WindowUtils;
import db.BDConnection;
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
public class InventarioVW extends javax.swing.JFrame {

    /**
     * Creates new form InventarioVW
     */
    public InventarioVW() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        loadInventarioData();
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
        jLabel5 = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAgregarInv = new javax.swing.JButton();
        btnEliminarInv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVolverINV = new javax.swing.JButton();
        btnSubcategorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setText("INVENTARIO");

        btnCategorias.setText("CATEGORIAS");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        jButton2.setText("PRODUCTOS");

        btnAgregarInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-48.png"))); // NOI18N
        btnAgregarInv.setText("AGREGAR");
        btnAgregarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInvActionPerformed(evt);
            }
        });

        btnEliminarInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-eliminar.png"))); // NOI18N
        btnEliminarInv.setText("ELIMINAR");
        btnEliminarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInvActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre(s)", "cantidad", "precio", "id_subcategoria", "id_categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");

        jLabel1.setText("AQUI VAN LOS PRODUCTOS ");

        btnVolverINV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-volver.png"))); // NOI18N
        btnVolverINV.setText("VOLVER");
        btnVolverINV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverINVActionPerformed(evt);
            }
        });

        btnSubcategorias.setText("SUBCATEGORIAS");
        btnSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubcategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVolverINV)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnSubcategorias))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnAgregarInv)
                .addGap(70, 70, 70)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarInv)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolverINV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCategorias)
                            .addComponent(jButton2)
                            .addComponent(btnSubcategorias))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarInv)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminarInv))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnVolverINVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverINVActionPerformed
        HomePage hmvw = new HomePage();
        hmvw.setVisible(true);
        WindowUtils.close(this); 
    }//GEN-LAST:event_btnVolverINVActionPerformed

    private void btnEliminarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInvActionPerformed
        int a = JOptionPane.showConfirmDialog((Component) null, 
              "¿DESEAS ELIMINAR ESTE PRODUCTO?",
              "DELETE", JOptionPane.YES_NO_OPTION);
        System.out.println("Valor de a:" + a);
        if (a == 0) {
            int row = jTable1.getSelectedRow();
            if (row != -1) { // Asegúrate de que hay una fila seleccionada
                String call = jTable1.getModel().getValueAt(row, 0).toString();
                String sql = "DELETE FROM productos WHERE id = " + call;
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
    }//GEN-LAST:event_btnEliminarInvActionPerformed

    private void btnAgregarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInvActionPerformed
        /*
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
            String nombreCat = txtNombreCAT.getText();
            if (isValidForm(nombreCat) == false) {
                // JOptionPane.showMessageDialog(null, "Faltan datos por llenar");
            } else {
                // Crear la consulta SQL usando PreparedStatement para evitar inyección SQL
                String sql = "INSERT INTO categoria (nombre) VALUES (?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, nombreCat);
                // Ejecutar la consulta de inserción
                int rowsAffected = pst.executeUpdate();

                // Verificar si la inserción fue exitosa
                if (rowsAffected > 0) {
                   
                    // Acción al insertar correctamente el usuario
                    JOptionPane.showMessageDialog(null, "Categoria registrada "
                            + "exitosamente");

                    // Crear la consulta SQL para obtener los datos
                    String sql_2 = "SELECT * FROM categoria";
                    st = con.createStatement();
                    rs = st.executeQuery(sql_2);

                    // Obtener el modelo de la tabla
                    DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                   // inf.loadInformacion(sql, st, rs, tblModel);
                    loadInformacionCAT(sql, st, rs, tblModel);
                    txtNombreCAT.setText("");
                } else {
                    // Mostrar mensaje de error en la inserción
                    JOptionPane.showMessageDialog(null, "Error al registrar la categoria");
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
        */
    }//GEN-LAST:event_btnAgregarInvActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        CategoriaVW catVW = new CategoriaVW();
        catVW.setVisible(true);
        WindowUtils.close(this);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubcategoriasActionPerformed
         SubCategoriaVW subVW = new SubCategoriaVW();
         subVW.setVisible(true);
    }//GEN-LAST:event_btnSubcategoriasActionPerformed

     private boolean isValidForm(String nombreCAT) {
        if (nombreCAT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la categoria");
            return false;
        }  
        return true;
    }
      
       private void loadInventarioData() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "password");
            String sql = "SELECT * FROM productos";
            st = con.createStatement();
            rs = st.executeQuery(sql);

            // Obtener el modelo de la tabla
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            loadInformacionINV(sql, st, rs, tblModel);
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
       
       public void loadInformacionINV(String sql, Statement st, ResultSet rs, DefaultTableModel tblModel) throws SQLException {
        // Limpiar la tabla antes de agregar nuevos datos
        tblModel.setRowCount(0);
        // Añadir filas de datos al modelo de tabla
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("id"));
            String tnombre = rs.getString("nombre");
            String tcantidad = rs.getString("cantidad");
            String tprecio = rs.getString("precio");
            String tid_subcategoria = rs.getString("id_subcategoria");
            String tid_categoria = rs.getString("id_categoria");
            String tbData[] = {id, tnombre , tcantidad , tprecio , tid_subcategoria , tid_categoria};
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
            java.util.logging.Logger.getLogger(InventarioVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioVW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarInv;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarInv;
    private javax.swing.JButton btnSubcategorias;
    private javax.swing.JButton btnVolverINV;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
