package EjerciciosMañana.mercado.models;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fecha_nacimiento;
    private int vendedor_idvendedor;

    public Cliente(String nombre, String apellido, int dni, String direccion, Date fecha_nacimiento, int vendedor_idvendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.vendedor_idvendedor = vendedor_idvendedor;
    }

    public Cliente(int idCliente, String nombre, String apellido, int dni, String direccion, Date fecha_nacimiento, int vendedor_idvendedor) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.vendedor_idvendedor = vendedor_idvendedor;
    }
    
    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getVendedor_idvendedor() {
        return vendedor_idvendedor;
    }

    public void setVendedor_idvendedor(int vendedor_idvendedor) {
        this.vendedor_idvendedor = vendedor_idvendedor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido
                + ", dni=" + dni + ", direccion=" + direccion + ", fecha_nacimiento=" + fecha_nacimiento
                + ", vendedor_idvendedor=" + vendedor_idvendedor + '}';
    }

}
