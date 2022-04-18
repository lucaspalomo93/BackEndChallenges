package Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que simule una calculadora, donde realice las operaciones básicas (suma, resta, multiplicación, división), el usuario 
debe primero ingresar dos valores, y especificar con un carácter la operación a realizar, para el uso del ejercicio debe usar la sentencia switch.
*/

public class Ejercicio1Calculadora {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        while(opcion != 5){
            System.out.println("********** CALCULADORA ******************");
            System.out.println("\n 1- Suma");
            System.out.println("\n 2- Resta");
            System.out.println("\n 3- Multiplicacion");
            System.out.println("\n 4- Division");
            System.out.println("\n 5- Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("\nIngrese un valor: ");
                    a = sc.nextInt();
                    System.out.println("\nIngrese otro valor: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + suma(a,b)); 
                    break;
                case 2:
                    System.out.println("\nIngrese un valor: ");
                    a = sc.nextInt();
                    System.out.println("\nIngrese otro valor: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + resta(a,b)); 
                    break;
                case 3:
                    System.out.println("\nIngrese un valor: ");
                    a = sc.nextInt();
                    System.out.println("\nIngrese otro valor: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + multiplicacion(a,b));   
                    break;
                case 4:
                    System.out.println("\nIngrese un valor: ");
                    a = sc.nextInt();
                    System.out.println("\nIngrese otro valor: ");
                    b = sc.nextInt();
                    System.out.println("\nResultado: " + division(a,b)); 
                case 5:
                    System.out.println("Gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("Opcion incorrecta"); 
                    break;
            }
            
        }
        
        
        
    }
    
    public static int suma(int a, int b){
        int total = a + b;
        return total;
    }
    
    public static int resta(int a, int b){
        int total = a - b;
        return total;
    }
    
    public static int multiplicacion(int a, int b){
        int total = a * b;
        return total;
    }
    
    public static float division(int a, int b){
        float total = a / b;
        return total;
    }
}
