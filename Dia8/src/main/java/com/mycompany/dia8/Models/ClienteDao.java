package com.mycompany.dia8.Models;

import com.mycompany.dia8.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao implements IDao {

    private static final String SQL_SELECT = "SELECT * FROM cliente";

    @Override
    public List<Cliente> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCliente = rs.getInt("idcliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int dni = rs.getInt("dni");
                String direccion = rs.getString("direccion");
                Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
                int vendedor_idvendedor = rs.getInt("vendedor_idvendedor");
                
                Cliente cliente = new Cliente("Lucas", "Palomo", 111222334, "calle 123", 31/07/1993, vendedor_idvendedor);
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
