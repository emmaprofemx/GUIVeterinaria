/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
public class PacienteVW extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public PacienteVW() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
         loadMascotaData();
        //loadInventarioData();
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
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-volver.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setText("INVENTARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

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
                "id", "nombre", "especie", "raza", "edad", "id_cliente"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 190));

        jLabel2.setText("ID CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, -1));

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, -1));
        jPanel1.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, -1));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, -1));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, -1));

        jLabel4.setText("ESPECIE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel6.setText("RAZA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel7.setText("EDAD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-48.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void close(){
      this.dispose();
    }
     
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        HomePage hmvw = new HomePage();
        hmvw.setVisible(true);
        close();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        String tblNombre = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblEspecie = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblRaza = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblEdad = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblIdCliente = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();

        txtIdCliente.setText(tblNombre);
        txtEspecie.setText(tblEspecie);
        txtRaza.setText(tblRaza);
        txtEdad.setText(tblEdad);
        txtIdCliente.setText(tblIdCliente);

    }//GEN-LAST:event_jTable1MouseClicked

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
        String nombre = txtNombre.getText();
        String especie = txtEspecie.getText();
        String raza = txtRaza.getText();
        String edad = txtEdad.getText();
        String idcliente = txtIdCliente.getText();

        if (isValidForm(nombre, especie, raza, edad, idcliente) == false) {
            // JOptionPane.showMessageDialog(null, "Faltan datos por llenar");
        } else {
            // Crear la consulta SQL usando PreparedStatement para evitar inyección SQL
            String sql = "INSERT INTO mascota (nombre, especie, raza, edad, cliente_id) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, especie);
            pst.setString(3, raza);
            pst.setInt(4, Integer.parseInt(edad));
            pst.setInt(5, Integer.parseInt(idcliente));

            // Ejecutar la consulta de inserción
            int rowsAffected = pst.executeUpdate();

            // Verificar si la inserción fue exitosa
            if (rowsAffected > 0) {
                InformacionBD inf = new InformacionBD();
                // Acción al insertar correctamente el usuario
                JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente");

                // Crear la consulta SQL para obtener los datos
                String sql_2 = "SELECT * FROM mascota";
                st = con.createStatement();
                rs = st.executeQuery(sql_2);

                // Obtener el modelo de la tabla
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                 loadInformacionSUBCAT(sql, st, rs, tblModel);

               
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {  // Verifica que se haya seleccionado una fila
            String edtNombre = txtNombre.getText();
            String edtEspecie = txtEspecie.getText();
            String edtRaza = txtRaza.getText();
            String edtEdad = txtEdad.getText();
            String edtIdCliente = txtIdCliente.getText();

            // Actualiza los valores en la fila seleccionada
            tblModel.setValueAt(edtNombre, selectedRow, 0);
            tblModel.setValueAt(edtEspecie, selectedRow, 1);
            tblModel.setValueAt(edtRaza, selectedRow, 2);
            tblModel.setValueAt(edtEdad, selectedRow, 3);
            tblModel.setValueAt(edtIdCliente, selectedRow, 4);
        } else {
            // Maneja el caso donde no se ha seleccionado ninguna fila (opcional)
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int a = JOptionPane.showConfirmDialog((Component) null, "¿Quieres eliminar?", "DELETE", JOptionPane.YES_NO_OPTION);
        System.out.println("Valor de a:" + a);
        if (a == 0) {
            int row = jTable1.getSelectedRow();
            if (row != -1) { // Asegúrate de que hay una fila seleccionada
                String call = jTable1.getModel().getValueAt(row, 0).toString();
                String sql = "DELETE FROM mascota WHERE id = " + call;
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

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
       
       if(!Character.isDigit(c)){
           evt.consume();
       }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        char c = evt.getKeyChar();
       
       if(!Character.isDigit(c)){
           evt.consume();
       }
    }//GEN-LAST:event_txtIdClienteKeyTyped

      public boolean isValidForm(String nombre, String especie,
            String raza, String edad, String idcliente) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre");
            return false;
        }
        if (especie.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la especie");
            return false;
        }
        if (raza.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la raza");
            return false;
        }
        if (edad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la edad");
            return false;
        }
        if (idcliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el id del dueño");
            return false;
        }
        return true;
    }
      
      private void loadMascotaData() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "password");
            String sql = "SELECT * FROM mascota";
            st = con.createStatement();
            rs = st.executeQuery(sql);

            // Obtener el modelo de la tabla
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
          //  loadInformacion(sql, st, rs, tblModel);
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

   public void loadInformacionSUBCAT(String sql, Statement st, ResultSet rs, DefaultTableModel tblModel) throws SQLException {
        // Limpiar la tabla antes de agregar nuevos datos
        tblModel.setRowCount(0);
        // Añadir filas de datos al modelo de tabla
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("id"));
            String tnombre = rs.getString("nombre");
            String tespecie = rs.getString("especie");
            String traza = rs.getString("raza");
            String tedad = rs.getString("edad");
            String tclienteid = rs.getString("cliente_id");
            String tbData[] = {id,tnombre,tespecie,traza,tedad,tclienteid};
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
            java.util.logging.Logger.getLogger(PacienteVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteVW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
