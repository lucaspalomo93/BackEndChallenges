package pairprogramming1;

/*
* Inciso 2: Pedir por consola la temperatura de los últimos 3 días y en base a esta calcular su promedio. 
* Además, en base al promedio, mostrar por consola si la temperatura fue fría cuando el promedio sea menor a 0, que fue templada 
* cuando el promedio fue entre 0 y 20 y que fue cálida cuando el promedio sea mayor a 20.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float temperatura, tempTotal=0, promedio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura de los ultimos 3 dias: ");
        for(int i = 0; i<3; i++){
            System.out.println("Temperatura: ");
            temperatura = sc.nextFloat();
            tempTotal += temperatura;
        }
        
        promedio = tempTotal / 3;
        
        System.out.println("El promedio de las 3 temperaturas es: " + promedio);
        
        if(promedio < 0){
            System.out.println("La temperatura fue fria");
        }else if(promedio >=0 && promedio <= 20){
            System.out.println("La temperatura fue templada");
        }else{
            System.out.println("La temperatura fue calida");
        }

        
    }
}
