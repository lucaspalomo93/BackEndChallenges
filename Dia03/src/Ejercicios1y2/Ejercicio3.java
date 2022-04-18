package Ejercicios1y2;


import java.util.Scanner;

/*
Construir una función que imprima los elementos de una lista enlazada de enteros en orden inverso a partir de una posición p
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] lista;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la lista: ");
        lista = new int[sc.nextInt()];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese un valor: ");
            lista[i] = sc.nextInt();
        }

        System.out.println("************* Pila ingresada ************");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Pos " + i + " = " + lista[i]);
        }
        
        System.out.println("*********** Pila invertida ************");
        imprimir(lista);

    }

    public static void imprimir(int[] lista) {
        int[] listaInvertida = new int[lista.length];
        int rango = lista.length;
        System.out.println("Rango " + rango);
        for (int i = rango-1, j = 0; i >= 0; i--, j++) {
            listaInvertida[j] = lista[i];
            System.out.println("Pos " + i + " = " + listaInvertida[j]);
        }
    }
}
