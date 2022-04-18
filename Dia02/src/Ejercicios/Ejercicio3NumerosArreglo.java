package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un programa que permita ingresar por teclado 10 números en un arreglo y debe:

Mostrar el número mayor
Mostrar el número menor
Mostrar los números pares
Mostrar los números impares
Ordenarlos de manera Ascendente
Ordenarlos de manera Descendente

 */
public class Ejercicio3NumerosArreglo {

    public static void main(String[] args) {
        int arregloNumeros[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("************* LLENANDO ARRAY ***************");
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            arregloNumeros[i] = sc.nextInt();
        }
        //paresImpares(arregloNumeros);
        //menor(arregloNumeros);
        //mayor(arregloNumeros);
        //ascendente(arregloNumeros);
        descendente(arregloNumeros);

    }

    public static void paresImpares(int[] arreglo) {
        System.out.println("*********NUMEROS PARES E IMPARES ***********");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                System.out.println("\nNumero par: " + arreglo[i]);
            } else {
                System.out.println("\nNumero impar: " + arreglo[i]);
            }
        }
    }

    public static void mayor(int[] arreglo) {
        int mayor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                mayor = arreglo[i];
            } else if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    public static void menor(int[] arreglo) {
        int menor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                menor = arreglo[i];
            } else if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
    }

    public static void ascendente(int[] arreglo) {
        Arrays.sort(arreglo);
        int[] arregloOrdenado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloOrdenado[i] = arreglo[i];
        }

        mostrar(arregloOrdenado);
    }

    public static void descendente(int[] arreglo) {
        Arrays.sort(arreglo);
        int[] arregloOrdenado = new int[arreglo.length];
        for (int i = 9, j = 0; i >= 0; i--, j++) {
            arregloOrdenado[j] = arreglo[i];
        }

        mostrar(arregloOrdenado);
    }

    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + " = " + arreglo[i]);
        }
    }

}
