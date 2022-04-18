package com.mycompany.dia8;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3306/mercado?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String usuario = "root";
    private static final String pw = "admin";
    
    public static Connection getConection() throws SQLException {
        return DriverManager.getConnection(url,usuario,pw);

    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection con) throws SQLException{
        con.close();
    }
            
}
