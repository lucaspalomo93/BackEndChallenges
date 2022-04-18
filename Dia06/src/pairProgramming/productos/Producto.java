package pairProgramming.productos;

public abstract class Producto {
    private String nombre;
    private int id;
    private double precio;

    public Producto() {
    }
    
    

    public Producto(String nombre, int id, double precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String mostrarInformacion(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", id=" + id + ", precio=" + precio + '}';
    }
    
    
}
