package domain;

import java.util.List;
import java.util.Scanner;

public class JefeDeZona extends Empleado {

    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private Coche coche;
    private float porcentajeVentas;

    public JefeDeZona(String despacho, Secretario secretario, List<Vendedor> vendedores, Coche coche, String nombre, String apellido, int dni, String direccion, int aniosAntiguedad, int telefono, double salario, boolean esSupervisor) {
        super(nombre, apellido, dni, direccion, aniosAntiguedad, telefono, salario, esSupervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
        this.porcentajeVentas = 20f;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "JefeDeZona{" + super.toString() + "despacho=" + despacho + ", secretario=" + secretario + ", vendedores=" + vendedores + ", coche=" + coche + ", porcentajeVentas=" + porcentajeVentas + '}';
    }

    public double incrementarSalario() {
        double totalAumento = (this.porcentajeVentas * super.getSalario()) / 100;
        double total = (super.getSalario() + totalAumento) * super.getAniosAntiguedad();
        return total;
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

    public void darAltaVendedor(int telefonoMovil, String areaDeVenta,
            List<Cliente> clientes, float porcentajeVentas, Coche coche,
            String nombre, String apellido, int dni, String direccion, int aniosAntiguedad,
            int telefono, double salario, boolean esSupervisor) {

        Vendedor nuevoVendedor = new Vendedor(telefonoMovil, areaDeVenta,
                clientes, porcentajeVentas, coche, nombre, apellido, dni, direccion,
                aniosAntiguedad, telefono, salario, esSupervisor);

        this.vendedores.add(nuevoVendedor);
        System.out.println("Se ha agregado el vendedor a la lista.");
    }

    public void darBajaVendedor() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        for (int i = 0; i < this.vendedores.size(); i++) {
            System.out.println("Indice: " + i + this.vendedores.get(i));
        }
        System.out.println("Ingrese el indice que desea eliminar: ");
        opcion = sc.nextInt();

        this.vendedores.remove(opcion);
        System.out.println("Vendedor dado de baja");
    }

    public void mostrarVendedores() {
        System.out.println("cantidad elementos: " + " " + this.vendedores.size());
        for (int i = 0; i < this.vendedores.size(); i++) {
            System.out.println("Indice: " + this.vendedores.get(i));
        }
    }

}
