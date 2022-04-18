package Ejercicios;

import java.util.Scanner;

/*
Se quiere simular un juego en el que participan N jugadores y otra persona que hace de árbitro. Cada jugador elige 4 números en el rango [1, 10], pudiendo estar repetidos. 
A continuación, el árbitro, sin conocer los números que ha elegido cada jugador, selecciona 2 números A y B.
El programa debe ser capaz de calcular cuántos números de los seleccionados por cada jugador están comprendidos entre los valores A y B. Ganará el jugador que más números tenga 
en dicho intervalo.
Se pide implementar un programa modular que simule el juego para 3 jugadores, teniendo en cuenta que:
Tanto los 4 datos de cada jugador, como los valores para A y B se introducirán por teclado. En todos los casos, el programa detectará la entrada de números erróneos, 
solicitando nuevamente el dato hasta que sea válido.
Se deben mostrar por pantalla no solo los aciertos de cada jugador sino los datos que ha introducido cada jugador y los que ha seleccionado el árbitro. Por último, 
hay que imprimir la media aritmética de los aciertos de todos los jugadores

 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] numerosJugador1 = new int[4];
        int[] numerosJugador2 = new int[4];
        int[] numerosArbitro = new int[2];
        int contp1 = 0, contp2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("********** NUMEROS DEL JUGADOR 1 **************");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            numerosJugador1[i] = sc.nextInt();
        }

        System.out.println("*************** NUMEROS DEL JUGADOR 2 ******************");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            numerosJugador2[i] = sc.nextInt();
        }

        System.out.println("********** NUMEROS DEL ARBITRO ***********");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese un numero: ");
            numerosArbitro[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (numerosJugador1[j] == numerosArbitro[i]) {
                    contp1++;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (numerosJugador2[j] == numerosArbitro[i]) {
                    contp2++;
                }
            }
        }
        
        if(contp1 > contp2){
            System.out.println("Gana el jugador uno con: " + contp1 + " puntos!");
        }else if(contp2 > contp1){
            System.out.println("Gana el jugador dos con: " + contp2 + " puntos!");
        }else{
            System.out.println("Empate!!");
        }

    }

}
