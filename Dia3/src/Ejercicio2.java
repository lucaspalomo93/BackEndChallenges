
import java.util.Scanner;

/*
Crear un programa que sume los elementos de una lista de enteros recursivamente.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int cantidadElementos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos de la lista: ");
        cantidadElementos = sc.nextInt();
        int[] lista = new int[cantidadElementos];
        
        for(int i = 0; i<cantidadElementos; i++){
            System.out.println("Ingrese un numero: ");
            lista[i] = sc.nextInt();
        }
        
        System.out.println("La suma de los elementos de la lista es: " + suma(lista));
    }
    
    public static int suma(int[] lista){
        int suma = 0;
        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
        }
        return suma;
    }

}
