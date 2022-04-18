package challenge.domain.conexionMongo;

import com.mongodb.*;
import java.util.Scanner;

public class Conexion {

    public static void main(String[] args) {

        MongoClient mongo = crearConexion();
        DB db = mongo.getDB("persona");
        Scanner sc = new Scanner(System.in);

        //insertarDato(db, "datos", nombre, apellido, dni, direccion);
        int flag = 0;

        while (flag != 5) {
            System.out.println("1. Insertar un dato");
            System.out.println("2. Leer coleccion");
            System.out.println("3. Buscar por DNI");
            System.out.println("4. Elminar por DNI");
            System.out.println("5. Salir");
            flag = sc.nextInt();
            switch (flag) {
                case 1:
                    String nombre;
                    String apellido;
                    int dni;
                    String direccion;
                    System.out.println("Ingrese un nombre: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese DNI: ");
                    dni = sc.nextInt();
                    System.out.println("Ingrese direccion: ");
                    sc.nextLine();
                    direccion = sc.nextLine();

                    insertarDato(db, "datos", nombre, apellido, dni, direccion);
                    break;
                case 2:
                    mostrarColeccion(db, "datos");
                    break;
                case 3:
                    System.out.println("Ingrese el DNI de la persona a buscar: ");
                    dni = sc.nextInt();
                    buscarPorID(db, "datos", dni);
                    break;
                case 4:
                    System.out.println("Ingrese el DNI de la persona a eliminar");
                    dni = sc.nextInt();
                    eliminarPorDNI(db, "datos", dni);
                    break;

                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }

    private static MongoClient crearConexion() {
        System.out.println("Conectando a Mongo DB");

        MongoClient mongo = null;

        mongo = new MongoClient("localhost", 27017);

        return mongo;
    }

    private static void insertarDato(DB db, String coleccion, String nombre, String apellido, int dni, String direccion) {
        DBCollection colec = db.getCollection(coleccion);

        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", nombre);
        documento.put("apellido", apellido);
        documento.put("dni", dni);
        documento.put("direccion", direccion);

        colec.insert(documento);

    }

    private static void mostrarColeccion(DB db, String coleccion) {
        DBCollection colec = db.getCollection(coleccion);
        DBCursor cursor = colec.find();

        while (cursor.hasNext()) {
            System.out.println("-" + cursor.next().get("nombre") + " - " + cursor.curr().get("apellido") + " - " + cursor.curr().get("dni") + " - " + cursor.curr().get("direccion"));
        }
    }

    private static void buscarPorID(DB db, String coleccion, int dni) {
        DBCollection colec = db.getCollection(coleccion);

        BasicDBObject consulta = new BasicDBObject();
        consulta.put("dni", dni);

        DBCursor cursor = colec.find(consulta);

        while (cursor.hasNext()) {
            System.out.println("-" + cursor.next().get("nombre") + " - " + cursor.curr().get("apellido") + " - " + cursor.curr().get("dni") + " - " + cursor.curr().get("direccion"));
        }
    }

    private static void eliminarPorDNI(DB db, String coleccion, int dni) {
        DBCollection colec = db.getCollection(coleccion);


            colec.remove(new BasicDBObject().append("dni", dni));

    }
}
