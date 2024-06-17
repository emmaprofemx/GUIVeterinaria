package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDConnection {
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private Statement st = null;
    
    private String name_db = "test";
    private String username = "root";
    private String password = "password";
    
    public BDConnection() {
        try {
            iniciar();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void iniciar() throws ClassNotFoundException, SQLException {
        // Cargar el driver JDBC de MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establecer la conexión con la base de datos
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_db + "?useSSL=false", username, password);
    }
    
    public Connection getConnection() {
        return con;
    }
    
    public void close() {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (st != null) st.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BDConnection dbConnection = new BDConnection();
        if (dbConnection.getConnection() != null) {
            System.out.println("Conexión exitosa a la base de datos");
        } else {
            System.out.println("Error al conectar a la base de datos");
        }
        dbConnection.close();
    }
}
