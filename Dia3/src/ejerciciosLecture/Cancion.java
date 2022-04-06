package ejerciciosLecture;

public class Cancion {
    private String nombre;
    private String extension;

    public Cancion(String nombre, String extension) {
        this.nombre = nombre;
        this.extension = extension;
    }
 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return this.nombre + " ." + this.extension;
    }
    
    
    
    
}
