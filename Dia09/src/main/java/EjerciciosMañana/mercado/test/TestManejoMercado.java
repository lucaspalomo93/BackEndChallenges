package EjerciciosMañana.mercado.test;

import EjerciciosMañana.mercado.models.Cliente;
import EjerciciosMañana.mercado.models.ClienteDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestManejoMercado {

    public static void main(String[] args) throws ParseException {
//        ClienteDao personaDao = new ClienteDao();
//        List<Cliente> clientes = personaDao.listar();
//        for(Cliente cliente : clientes){
//            System.out.println("cliente = " + cliente);
//        }
        ClienteDao personaDao = new ClienteDao();

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        while (opcion != 5) {
            System.out.println("Ingrese una opcion para continuar ");
            System.out.println("\n 1 - Listar Cliente");
            System.out.println("\n 2 - Insertar Cliente");
            System.out.println("\n 3 - Actualizar Cliente");
            System.out.println("\n 4 - Eliminar Cliente");
            System.out.println("\n 5 - Salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Lista de clientes: ");
                    List<Cliente> clientes = personaDao.listar();
                    for (Cliente cliente : clientes) {
                        System.out.println("Cliente = " + cliente);
                    }
                    break;
                case 2:
                    String nombre;
                    String apellido;
                    int dni;
                    String direccion;
                    Date fecha_nacimiento = null;
                    int vendedor_idvendedor;
                    System.out.println("Rellene los datos para insertar un nuevo cliente: ");
                    System.out.println("Nombre: ");
                    nombre = sc.next();
                    System.out.println("Apellido: ");
                    apellido = sc.next();
                    System.out.println("DNI: ");
                    dni = sc.nextInt();
                    System.out.println("Direccion: ");
                    direccion = sc.next();
 

                    System.out.println("idVendedor: ");
                    vendedor_idvendedor = sc.nextInt();

                    Cliente clienteNuevo = new Cliente(nombre, apellido, dni, direccion, fecha_nacimiento, vendedor_idvendedor);
                    personaDao.insertar(clienteNuevo);
                    System.out.println("Cliente insertado");
                    break;

                case 3:
                    String nombreUp ="";
                    String apellidoUp="";
                    int dniUp=0;
                    String direccionUp="";
                    Date fecha_nacimientoUp=null;
                    int vendedor_idvendedorUp=0;
                    System.out.println("Rellene los datos para insertar un nuevo cliente: ");
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("DNI: ");
                    dni = sc.nextInt();
                    System.out.println("Direccion: ");
                    direccion = sc.nextLine();
                    System.out.println("Fecha YYYY-MM-DD: ");
                    String fecha_stringUp = sc.nextLine();
                    SimpleDateFormat sdfUp = new SimpleDateFormat("yyyy-MM-dd");
                    fecha_nacimiento = sdfUp.parse(fecha_stringUp);

                    System.out.println("idVendedor: ");
                    vendedor_idvendedor = sc.nextInt();

                    Cliente clienteNuevoUp = new Cliente(nombreUp,apellidoUp, dniUp, direccionUp, fecha_nacimientoUp, vendedor_idvendedorUp);
                    personaDao.actualizar(clienteNuevoUp);
                    System.out.println("Cliente actualizado");
                    break;
                    
                case 4:
                    int id;
                    System.out.println("Ingrese id del Cliente a eliminar: ");
                    id = sc.nextInt();
                    
                    Cliente clienteEliminar = new Cliente(id);
                    personaDao.eliminar(clienteEliminar);
                    System.out.println("Cliente eliminado");
                case 5:
                    System.out.println("Adios!");
                    break;                   
            }

        }

    }
}
