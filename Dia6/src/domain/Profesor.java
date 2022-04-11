package domain;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor(String departamento, int anioIncorporacion, int nroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    } 
    

    @Override
    public void imprimirInformacion() {
        this.toString();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }

    @Override
    public void reasignarDespacho(int despacho) {
        this.setNroDespacho(despacho);
    }

    @Override
    public void cambiarEstadoCivil(String estado) {
        this.setEstadoCivil(estado);
    }


    
    
}
