package ejercicioPairProgramming.aviones;

public class Pasajero {

    private String nombre;
    private String apellido;
    private final int numeroVuelo;
    private static int idVuelos;

    public Pasajero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroVuelo = ++Pasajero.idVuelos;
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

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", numeroVuelo=" + numeroVuelo + '}';
    }

}
