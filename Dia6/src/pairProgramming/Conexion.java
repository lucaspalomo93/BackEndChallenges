package pairProgramming;

public class Conexion {
    

//    SINGLETONE
//    private static Conexion conexion;
//    
//    private Conexion(){
//    }
//    
//
//    public static Conexion getConexion(){
//        if(conexion == null){
//            return new Conexion();
//        }
//        return conexion;
//    }
//    
    
    private IConnectionStrategy strategy;
    
    public Conexion(IConnectionStrategy strategy){
        this.strategy = strategy;
    }
    
    public String conectarBaseDeDatos(String nombre){
        return strategy.conectarBaseDeDatos(nombre);
    }
    
    public String desconectarBaseDeDatos(){
        return strategy.desconectarBaseDeDatos();
    }
    
    public void cambiarConexion(IConnectionStrategy strategy){
        this.strategy = strategy;
    }
}
