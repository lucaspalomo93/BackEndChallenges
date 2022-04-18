package com.mycompany.dia8.Models;

import java.util.Date;

public class Vendedor {
    private int idvendedor;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fecha_nacimiento;
    private double salario;

    public Vendedor(String nombre, String apellido, int dni, String direccion, Date fecha_nacimiento, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
    }

    public int getIdvendedor() {
        return idvendedor;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "idvendedor=" + idvendedor + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + 
                ", fecha_nacimiento=" + fecha_nacimiento + ", salario=" + salario + '}';
    }
    
    
}
