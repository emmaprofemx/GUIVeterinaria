/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EMMANUEL
 */
public class InformacionBD {

    private String db_name = "root";
    private String db_password = "password";
    public InformacionBD() throws ClassNotFoundException, SQLException {
         // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión con la base de datos
            Connection con = DriverManager.getConnection
           ("jdbc:mysql://localhost:3306/test?useSSL=false", db_name, db_password);
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
    
    
     public void loadInformacionCAT(String sql, Statement st, ResultSet rs, DefaultTableModel tblModel) throws SQLException {
        // Limpiar la tabla antes de agregar nuevos datos
        tblModel.setRowCount(0);
        // Añadir filas de datos al modelo de tabla
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("id"));
            String tnombre = rs.getString("nombre");
            String tbData[] = {id, tnombre};
            tblModel.addRow(tbData);
        }
    }
}
