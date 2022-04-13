package com.mycompany.dia8.Models;

public class Producto {
    private int idproducto;
    private String nombre;
    private double precio_unitario;
    private int cantidad;
    private int stock_minimo;
    private int facturacion_idfacturacion;

    public Producto(String nombre, double precio_unitario, int cantidad, int stock_minimo, int facturacion_idfacturacion) {
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.stock_minimo = stock_minimo;
        this.facturacion_idfacturacion = facturacion_idfacturacion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getFacturacion_idfacturacion() {
        return facturacion_idfacturacion;
    }

    public void setFacturacion_idfacturacion(int facturacion_idfacturacion) {
        this.facturacion_idfacturacion = facturacion_idfacturacion;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + 
                ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad + 
                ", stock_minimo=" + stock_minimo + ", facturacion_idfacturacion=" + facturacion_idfacturacion + '}';
    }
    
    
}
