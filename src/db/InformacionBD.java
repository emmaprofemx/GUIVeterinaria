/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EMMANUEL
 */
public class InformacionBD {

    public InformacionBD() {

    }

    public void loadInformacion(String sql, Statement st, ResultSet rs, DefaultTableModel tblModel) throws SQLException {
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
        }
    }
}
