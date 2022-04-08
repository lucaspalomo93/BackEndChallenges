package domain;

public class Secretario extends Empleado {

    private String despacho;
    private int nroFax;
    private float porcentajeAumento;

    public Secretario(String despacho, int nroFax, String nombre, String apellido, int dni, String direccion, int aniosAntiguedad, int telefono, double salario, boolean esSupervisor) {
        super(nombre, apellido, dni, direccion, aniosAntiguedad, telefono, salario, esSupervisor);
        this.despacho = despacho;
        this.nroFax = nroFax;
        this.porcentajeAumento = 5f;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNroFax() {
        return nroFax;
    }

    public void setNroFax(int nroFax) {
        this.nroFax = nroFax;
    }

    @Override
    public String toString() {
        return "Secretario{" + super.toString() + "despacho=" + despacho + ", nroFax=" + nroFax + '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

    public double incrementarSalario() {
        double totalAumento = (this.porcentajeAumento * super.getSalario()) / 100;
        double total = (super.getSalario() + totalAumento) * super.getAniosAntiguedad();
        return total;
    }

}
