package pairProgramming;

public class MySQLImpl implements IConnectionStrategy{

    @Override
    public String conectarBaseDeDatos(String nombre) {
        System.out.println();
        return "Conexion a "+ nombre +  "exitosa!";
    }

    @Override
    public String desconectarBaseDeDatos() {
        return "Desconexion de MySQL exitosa!";
    }
    
}
