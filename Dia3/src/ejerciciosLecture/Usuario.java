package ejerciciosLecture;

import java.util.List;


/*
1) generar un "fake" spotify", donde tienen canciones, y usuarios estándar y premium., los dos heredan de usuario
2) 
2) hacer una clase "forma" y que hereden cuadrado, triangulo y circulo, y que deban sobrecargar el método de la clase madre "calcularPerimetro" y "calcular area"
*/

public class Usuario {
    private String nombreUsuario;
    private List<Cancion> canciones;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, List<Cancion> canciones) {
        this.nombreUsuario = nombreUsuario;
        this.canciones = canciones;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    private void escucharCancion(){
        
    }
}
