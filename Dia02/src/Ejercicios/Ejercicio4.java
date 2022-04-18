package Ejercicios;

import java.util.Scanner;

/*
Crea un programa que pida por pantalla cinco países y a continuación tres ciudades de cada uno de estos países. 
Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada país y 
el segundo índice el número asignado a cada ciudad, mostrar por pantalla el resultado.
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        int cantPaises = 5, cantCiudades = 3;
        String[][] paisesYCiudades = new String[5][3];
        String pais, ciudad;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un pais: ");
            pais = sc.nextLine();
            paisesYCiudades[i][0] = pais;
            for(int j = 0; j<3; j++){
                System.out.println("Ingrese una ciudad: ");
                ciudad = sc.nextLine();
                paisesYCiudades[i][j] = ciudad;
            }
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("Pais: " + paisesYCiudades[i][0]);
            for(int j = 0; j < 3; j++){
                System.out.println("Ciudad: " + paisesYCiudades[i][j]);
            }
        }
        
        
    }
}
