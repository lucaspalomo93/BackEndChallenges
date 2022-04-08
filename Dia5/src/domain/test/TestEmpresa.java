package domain.test;

import domain.Cliente;
import domain.Coche;
import domain.JefeDeZona;
import domain.Secretario;
import domain.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class TestEmpresa {
    public static void main(String[] args) {
        Coche kwid = new Coche("abc123", "Renault", 2019);
        Coche voyage = new Coche("efe456", "Volkswagen", 2014);
        
        Cliente cliente1 = new Cliente("Jose", "Gomez");
        Cliente cliente2 = new Cliente("Carla", "Perez");
        Cliente cliente3 = new Cliente("Maria", "Lopez");
        Cliente cliente4 = new Cliente("Lucas", "Palomo");
        
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        
        Secretario secretario1 = new Secretario("Quinto piso", 123313, "Fernando", "Ramirez", 11344211, "Calle Siempre Viva 124", 3, 111222333, 15000, false);
        Secretario secretario2 = new Secretario("Supervision", 123313, "Juana", "Alvarez", 11344211, "Calle Libertad 452", 7, 77744555, 450000, true);
        
        Vendedor vendedor1 = new Vendedor(444555223, "Playa", clientes, 5, voyage, "Martin", "Martinez", 39548410, "Avenida Constitucion", 2, 223455691, 15000, false);
        Vendedor vendedor2 = new Vendedor(11222333, "Centro", clientes, 7, voyage, "Juan", "Gomez", 39548410, "Avenida Libertad", 7, 453423, 15000, false);
        Vendedor vendedor3 = new Vendedor(2255534, "Norte", clientes, 8, voyage, "Felix", "Gonzales", 39548410, "Avenida Colon", 2, 11233312, 24566, false);
        Vendedor vendedor4 = new Vendedor(7765568, "Sur", clientes, 3, voyage, "Luciana", "Paz", 39548410, "Avenida Juan B Justo", 8, 56357967, 31231, true);
        
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        vendedores.add(vendedor4);
        
        JefeDeZona jefe = new JefeDeZona("Oficial", secretario1, vendedores, kwid, "Al", "Capone", 1950478, "Avenida Libertad", 15, 22334565, 15000000, true);
        
        
        //secretario1.imprimir();
        
        //vendedor1.imprimir();
        vendedor1.darAltaCliente("Nuevo","Cliente");
        vendedor1.mostrarClientes();
        vendedor1.darBajaCliente();
        vendedor1.mostrarClientes();
        
        //jefe.imprimir();
        //jefe.darAltaVendedor(7765568, "Sur", clientes, 3, voyage, "Luciana", "Paz", 39548410, "Avenida Juan B Justo", 8, 56357967, 31231, true);
        //jefe.darBajaVendedor();
        //jefe.mostrarVendedores();
        
    }
}
