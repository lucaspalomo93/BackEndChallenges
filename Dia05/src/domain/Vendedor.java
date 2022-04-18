package domain;

import java.util.List;
import java.util.Scanner;

public class Vendedor extends Empleado {

    private int telefonoMovil;
    private String areaDeVenta;
    private List<Cliente> clientes;
    private float porcentajeVentas;
    private Coche coche;

    public Vendedor(int telefonoMovil, String areaDeVenta, List<Cliente> clientes, float porcentajeVentas, Coche coche,
            String nombre, String apellido, int dni, String direccion, int aniosAntiguedad, int telefono, double salario,
            boolean esSupervisor) {
        super(nombre, apellido, dni, direccion, aniosAntiguedad, telefono, salario, esSupervisor);
        this.telefonoMovil = telefonoMovil;
        this.areaDeVenta = areaDeVenta;
        this.clientes = clientes;
        this.porcentajeVentas = porcentajeVentas;
        this.coche = coche;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaDeVenta() {
        return areaDeVenta;
    }

    public void setAreaDeVenta(String areaDeVenta) {
        this.areaDeVenta = areaDeVenta;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public float getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(float porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + "telefonoMovil=" + telefonoMovil + ", areaDeVenta=" + areaDeVenta + ", clientes=" + clientes + ", porcentajeVentas=" + porcentajeVentas + ", coche=" + coche + '}';
    }

    public double incrementarSalario() {
        double totalAumento = (this.porcentajeVentas * super.getSalario()) / 100;
        double total = (super.getSalario() + totalAumento) * super.getAniosAntiguedad();
        return total;
    }

    //vendedor1.darAltaCliente();
    public void darAltaCliente(String nombre, String apellido) {
        Cliente cliente1 = new Cliente(nombre, apellido);
        this.clientes.add(cliente1);
        System.out.println("Cliente dado de alta");
    }

    //vendedor1.darBajaCliente();
    public void darBajaCliente() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        for (int i = 0; i < this.clientes.size(); i++) {
            System.out.println("Indice: " + i + " " + this.clientes.get(i));
        }
        System.out.println("Ingrese el indice que desea eliminar: ");
        opcion = sc.nextInt();

        this.clientes.remove(opcion);
        System.out.println("Cliente dado de baja");

    }

    public void mostrarClientes() {
        System.out.println("cantidad elementos: " + " " + this.clientes.size());
        for (int i = 0; i < this.clientes.size(); i++) {
            System.out.println("Indice: " + this.clientes.get(i));
        }
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

}
