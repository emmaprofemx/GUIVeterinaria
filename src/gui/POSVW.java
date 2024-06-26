/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import crudprincesa.WindowUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EMMANUEL
 */
public class POSVW extends javax.swing.JFrame {

    /**
     * Creates new form POSVW
     */
    public POSVW() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        llenarTablaConDatosEstaticos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolverSub = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        txtTotalProducto = new javax.swing.JTextField();
        txtPagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "cantidad", "precio", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 730, 230));

        btnVolverSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-volver.png"))); // NOI18N
        btnVolverSub.setText("VOLVER");
        btnVolverSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CAMBIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

        btnPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPagar.setText("PAGAR");
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 80, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PAGA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));

        txtCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioActionPerformed(evt);
            }
        });
        txtCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCambioKeyTyped(evt);
            }
        });
        getContentPane().add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 110, 30));

        txtTotalProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalProductoActionPerformed(evt);
            }
        });
        txtTotalProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotalProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 110, 30));

        txtPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagarKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TOTAL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID DEL PRODUCTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRE DEL PRODUCTO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CANTIDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("PRECIO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        txtTotalFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalFinalKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 110, 30));

        txtIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 30));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, 30));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 110, 30));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 110, 30));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-48.png"))); // NOI18N
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        String tblid = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblnombre = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblcantidad = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblprecio = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();

        // Asignar los valores a los campos de texto
        txtIdProducto.setText(tblid);
        txtNombreProducto.setText(tblnombre);
        txtCantidad.setText(tblcantidad);
        txtPrecio.setText(tblprecio);
        txtTotalProducto.setText(""); // Limpiar el campo de total
        txtCantidad.setText(tblcantidad); // Asignar el valor inicial al campo de cantidad modificada


    }//GEN-LAST:event_jTable1MouseClicked

    private void btnVolverSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSubActionPerformed
        HomePage hmvw = new HomePage();
        hmvw.setVisible(true);
        WindowUtils.close(this);
    }//GEN-LAST:event_btnVolverSubActionPerformed

    private void txtIdProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdProductoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtTotalProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalProductoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalProductoKeyTyped

    private void txtPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagarKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPagarKeyTyped

    private void txtCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioActionPerformed

    private void txtCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCambioKeyTyped

    private void txtTotalFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalFinalKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
             calcularTotal();
        }
    }//GEN-LAST:event_txtTotalFinalKeyTyped

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtTotalProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalProductoActionPerformed
        // TODO add your handling code here:
         calcularTotal();
    }//GEN-LAST:event_txtTotalProductoActionPerformed

    private void llenarTablaConDatosEstaticos() {
        // Crear el modelo de la tabla con los nombres de las columnas
        DefaultTableModel tblModel = new DefaultTableModel(new Object[]{
            "ID", "Nombre", "Cantidad", "Precio", "ID_Subcategoria", "ID_Categoria"}, 0);

        // Añadir filas de datos estáticos al modelo
        Object[][] datos = {
            {1, "Croquetas para mascota pequeña (Seco)", 999, 95, 1, 1},
            {2, "Croquetas para mascota mediana (Seco)", 999, 200, 1, 1},
            {3, "Croquetas para mascota grande (Seco)", 999, 350, 1, 1},
            {4, "Alimento para Aves", 999, 40, 2, 1},
            {5, "Alimento para Reptiles", 999, 80, 2, 1},
            {6, "Alimento para Roedores", 999, 40, 2, 1},
            {7, "Alimento para Peces", 999, 85, 2, 1},
            {8, "Vitaminas y minerales", 999, 120, 3, 1},
            {9, "Suplementos para articulaciones", 999, 40, 3, 1},
            {10, "Probioticos", 999, 180, 3, 1},
            {11, "perro", 999, 29, 1, 1},
            {12, "medicamentos y suplementos", 999, 80, 1, 1},
            {13, "test", 2334, 11, 1, 1},
            {14, "TES3", 67, 334, 1, 1},
            {15, "qw", 33, 12, 3, 1},
            {17, "Vendaje", 30, 40, 16, 4}
        };

        for (Object[] fila : datos) {
            tblModel.addRow(fila);
        }

        // Asignar el modelo a la tabla
        jTable1.setModel(tblModel);
    }

    // Método para calcular el total
    private void calcularTotal() {
        try {
            // Obtener los valores de los campos de texto
            String tblid = txtIdProducto.getText();
            String tblnombre = txtNombreProducto.getText();
            String tblcantidadModificada = txtCantidad.getText();
            String tblprecio = txtPrecio.getText();

            // Convertir cantidad modificada y precio a valores numéricos
            int cantidad = Integer.parseInt(tblcantidadModificada);
            double precio = Double.parseDouble(tblprecio);

            // Calcular el total
            double total = cantidad * precio;

            // Asignar el resultado al campo de texto del total
            txtTotalProducto.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            // Manejar el error si la entrada no es un número válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
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
            java.util.logging.Logger.getLogger(POSVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSVW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnVolverSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPagar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotalFinal;
    private javax.swing.JTextField txtTotalProducto;
    // End of variables declaration//GEN-END:variables
}
