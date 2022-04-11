package domain;

public abstract class Empleado extends Persona{
    private int anioIncorporacion;
    private int nroDespacho;

    public Empleado(int anioIncorporacion, int nroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    
       
    
    public abstract void reasignarDespacho(int despacho);

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", nroDespacho=" + nroDespacho + '}';
    }
    
    
    
    
}
