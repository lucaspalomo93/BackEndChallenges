package com.mycompany.dia8.Models;

import java.util.Date;

public class Facturacion {
    private int idfacturacion;
    private Date fecha_compra;
    private int vendedor_idvendedor;

    public Facturacion(Date fecha_compra, int vendedor_idvendedor) {
        this.fecha_compra = fecha_compra;
        this.vendedor_idvendedor = vendedor_idvendedor;
    }

    public int getIdfacturacion() {
        return idfacturacion;
    }


    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getVendedor_idvendedor() {
        return vendedor_idvendedor;
    }

    public void setVendedor_idvendedor(int vendedor_idvendedor) {
        this.vendedor_idvendedor = vendedor_idvendedor;
    }

    @Override
    public String toString() {
        return "Facturacion{" + "idfacturacion=" + idfacturacion + ", fecha_compra=" + fecha_compra + ", vendedor_idvendedor=" + vendedor_idvendedor + '}';
    }
    
    
}
