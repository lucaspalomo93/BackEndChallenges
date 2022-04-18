package domain;

//Clase madre
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int id;
    private String estadoCivil;

    public Persona(String nombre, String apellido, int id, String etadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = etadoCivil;
    }
        
    
    public abstract void cambiarEstadoCivil(String estado);
    public abstract void imprimirInformacion();

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String etadoCivil) {
        this.estadoCivil = etadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", etadoCivil=" + estadoCivil + '}';
    }
    
    
}
