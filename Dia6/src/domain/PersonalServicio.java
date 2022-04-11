package domain;

public class PersonalServicio extends Empleado{
    private String seccionAsignada;

    public PersonalServicio(String seccionAsignada, int anioIncorporacion, int nroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, id, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public void reasignarDespacho(int despacho) {
        this.setNroDespacho(despacho);
    }

    @Override
    public void cambiarEstadoCivil(String estado) {
        this.setEstadoCivil(estado);
    }

    @Override
    public void imprimirInformacion() {
        this.toString();
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "seccionAsignada=" + seccionAsignada + '}';
    }
    
    
    
}
