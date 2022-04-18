package com.mycompany.dia8.Models;

import com.mycompany.dia8.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao implements IDao {

    private static final String SQL_SELECT = "SELECT idCliente, nombre, apellido, dni, direccion, fecha_nacimiento, vendedor_idvendedor FROM cliente";

    @Override
    public List<Cliente> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();


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

                Cliente cliente = new Cliente(idCliente, nombre,apellido , dni, direccion, fecha_nacimiento, vendedor_idvendedor);
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return clientes;
    }

    @Override
    public Object insertar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
