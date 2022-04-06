package Ejercicios;

import java.util.Scanner;

/*
Vamos a crear el juego del ahorcado por consola.
Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será para el jugador 1.
Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y escribirá una palabra, sino lo acierta el jugador actual suma un punto y escribe de nuevo otra palabra.
Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por ejemplo si la palabra es Madrid, la pista puede ser “Ciudad”.
El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, cuerpo, brazos y piernas). No es necesario dibujar nada por pantalla, 
solo mostrar el número de oportunidades restantes.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String nombrep1, nombrep2, palabra;
        int puntosp1 = 0, puntosp2 = 0;
        String letra, pista;
        int oportunidadesJugador1 = 6, oportunidadesJugador2 = 6, cambio = 0;
        String [] letras;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador 1:");
        nombrep1 = sc.nextLine();

        System.out.println("Ingrese el nombre del jugador 2: ");
        nombrep2 = sc.nextLine();

        System.out.println("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        letras = palabra.split("");
                
        System.out.println("Ingrese una pista: ");
        pista = sc.nextLine();
        
        while (oportunidadesJugador1 > 0 && oportunidadesJugador2 > 0 && puntosp1 < 6 && puntosp2 < 6) {
            
            if (cambio % 2 == 1) {
                System.out.println("************* Turno jugador 2: **************");
                System.out.println("Recuerde la pista: " + pista);
                System.out.println("Que letra elige? ");
                letra = sc.nextLine();
                if (checkLetra(letra, palabra)) {
                    System.out.println("La letra estaba en la palabra!");
                    puntosp2++;
                    System.out.println("El jugador 2 tiene: " + puntosp2 + " puntos");
                    System.out.println("Le quedan " + oportunidadesJugador2 + " oportunidades");
                } else {
                    System.out.println("No estaba la letra");
                    System.out.println("El jugador 2 tiene: " + puntosp2 + " puntos");
                    oportunidadesJugador2--;
                    System.out.println("Le quedan " + oportunidadesJugador2 + " oportunidades");
                    
                }
            } else if (cambio % 2 == 0) {
                System.out.println("********* Turno jugador 1: ************");
                System.out.println("Recuerde la pista: " + pista);
                System.out.println("Que letra elige? ");
                letra = sc.nextLine();
                if (checkLetra(letra, palabra)) {
                    System.out.println("La letra estaba en la palabra!");
                    puntosp1++;
                    System.out.println("El jugador 1 tiene: " + puntosp1 + " puntos");
                    System.out.println("Le quedan " + oportunidadesJugador1 + " oportunidades");
                } else {
                    System.out.println("No estaba la letra");
                    System.out.println("El jugador 1 tiene: " + puntosp1 + " puntos");
                    oportunidadesJugador1--;
                    System.out.println("Le quedan " + oportunidadesJugador1 + " oportunidades");
                    
                }
            }
            cambio++;
        }

        if (puntosp1 > puntosp2) {
            System.out.println("Gana el jugador 1: " + nombrep1 + " con " + puntosp1 + " puntos");
        } else if (puntosp2 > puntosp1) {
            System.out.println("Gana el jugador 2: " + nombrep2 + " con " + puntosp2 + " puntos");
        } else {
            System.out.println("Ambos tienen la misma cantidad de puntos. Es un empate!");
        }
    }

    public static boolean checkLetra(String letra, String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.contains(letra)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
