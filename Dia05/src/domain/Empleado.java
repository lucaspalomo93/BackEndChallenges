package domain;

public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int aniosAntiguedad;
    private int telefono;
    private double salario;
    private boolean esSupervisor;

    public Empleado(String nombre, String apellido, int dni, String direccion, int aniosAntiguedad, int telefono, double salario, boolean esSupervisor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.aniosAntiguedad = aniosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.esSupervisor = esSupervisor;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEsSupervisor() {
        return esSupervisor;
    }

    public void setEsSupervisor(boolean esSupervisor) {
        this.esSupervisor = esSupervisor;
    }

    public void cambiarASupervisor() {
        this.esSupervisor = true;
    }
     
    public double incrementarSalario(float porcentaje){
        double totalAumento = (porcentaje * this.salario) / 100;
        double total = this.salario + totalAumento;
        return total;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + 
                ", direccion=" + direccion + ", aniosAntiguedad=" + aniosAntiguedad + ", telefono=" + 
                telefono + ", salario=" + salario + ", esSupervisor=" + esSupervisor + '}';
    }
    
    
    
    public void imprimir(){
        System.out.println(this.toString());
    }
}
