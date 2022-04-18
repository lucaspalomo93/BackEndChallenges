package pairProgramming;

public interface IConnectionStrategy {
    public String conectarBaseDeDatos(String nombre);
    public String desconectarBaseDeDatos();
}
