package pairProgramming;

public class PostgreSQLImp implements IConnectionStrategy{

    @Override
    public String conectarBaseDeDatos(String nombre) {
        //Conectar a base de datos
        System.out.println("Conexion a PostgreSQL exitosa!");
        return nombre;
    }

    @Override
    public String desconectarBaseDeDatos() {
        //Desconectar a base de datos
        return "Desconectado de PostgreSQL!";
    }
    
}
