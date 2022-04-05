package pairProgramming;

public class Test {
    public static void main(String[] args) {
        Animal perro = new Animal("Ruperto", "perro", 5, 'm', true); 
        
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
    }
}
