package EjerciciosMañana.mercado.models;

import com.mycompany.dia8.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private static final String SQL_SELECT = "SELECT idCliente, nombre, apellido, dni, direccion, fecha_nacimiento, vendedor_idvendedor FROM cliente";
    private static final String SQL_INSERT = "INSERT INTO cliente(nombre, apellido, dni, direccion, fecha_nacimiento, vendedor_idvendedor) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre=?, apellido=?, dni=?, direccion=?, fecha_nacimiento=?, vendedor_idvendedor=? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE idCliente=?";

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

                if (nombre.startsWith("A", 0)) {
                    System.out.println("El nombre de un cliente comienza con la letra A: " + nombre);
                }

                Cliente cliente = new Cliente(idCliente, nombre, apellido, dni, direccion, fecha_nacimiento, vendedor_idvendedor);
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

    public int insertar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setInt(3, cliente.getDni());
            stmt.setString(4, cliente.getDireccion());
            stmt.setDate(5, (Date) cliente.getFecha_nacimiento());
            stmt.setInt(6, cliente.getVendedor_idvendedor());
            registros = stmt.executeUpdate();
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
        return registros;
    }

    public int actualizar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setInt(3, cliente.getDni());
            stmt.setString(4, cliente.getDireccion());
            stmt.setDate(5, (Date) cliente.getFecha_nacimiento());
            stmt.setInt(6, cliente.getVendedor_idvendedor());
            stmt.setInt(7, cliente.getIdCliente());
            registros = stmt.executeUpdate();
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
        return registros;
    }
    
    public int eliminar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cliente.getIdCliente());
            registros = stmt.executeUpdate();
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
        return registros;
    }   
    
}
