package pairprogramming1;

import java.util.Scanner;

/*
* Se desea crear una biblioteca con 3 autores cargados preciamente. Luego el usuario por teclado puede elegir entre estos y visualizar los libros que ha escrito. 
* Si el autor no se encuentra entre las posibilidades, mostrar un mensaje de error por consola.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String autor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vea los libros escritos por los siguientes autores: ");
        System.out.println("Ingrese segun desee: Rowling, Tolkien, Shakespeare");
        autor = sc.next();
        
        switch(autor){
            case "Rowling":
                System.out.println("Harry Potter y la piedra filosofal");
                System.out.println("La camara de los secretos");
                System.out.println("Criaturas fantasticas y donde encontrarlas");
                break;
            case "Tolkien":
                System.out.println("La comunidad del anillo");
                System.out.println("Las dos torres");
                System.out.println("El retorno del rey");
                break;
            case "Shakespeare":
                System.out.println("Romeo y Julieta");
                System.out.println("Hamlet");
                System.out.println("Macbeth");
                break;
            default:
                System.out.println("Ese autor no esta en nuestra lista!");
        }
    }
}
