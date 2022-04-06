package Ejercicios.ejercicio1;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamanño de la pila: ");
        int tamanio = sc.nextInt();
        int numero = 0, opc = 0;
        
        Pila pila1 = new Pila(tamanio);
        
        do{
            System.out.println("Que operacion desea realizar? ");
            System.out.println("1. Ingresar --- 2. Eliminar --- 3. Saber si esta vacia --- 4. Mostrar Pila --- 5. Salir");
            opc = sc.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Inserte un nuevo numero: ");
                    numero = sc.nextInt();
                    pila1.insertar(numero);
                    System.out.println("Dato insertado");
                    System.out.println("");
                    break;
                case 2:
                    pila1.eliminar();
                    System.out.println("Ultimo numero eliminado");
                case 3:
                    System.out.println("Estado de la pila (vacio o no): " + pila1.vacio());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Pila completa: ");
                    pila1.mostrarPila();            
            }
            
        }while(opc != 5);
    }
}
