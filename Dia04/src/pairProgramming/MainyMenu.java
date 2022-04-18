package pairProgramming;

import java.util.Scanner;


public class MainyMenu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int opcion1 = 0;
        int opcion2 = 0;
        int opcionPerso = 0;
        int turno = 0;

        int vida = 0;
        int vidaEnemigo = 0;
        int daño = 0;

        boolean termino = false;
        boolean gano = false;

        String nombre = "";
        do {
            menuPrincipal();
            opcion1 = scan.nextInt();
            System.out.println("Ingrese su nombre");
            nombre = scan.next();
            Personaje perso = new Personaje(nombre);
            System.out.println("Elija un personaje |1|. MAGO  |2|.GUERRERO  |3| ASESINO");
            opcionPerso = scan.nextInt();
            switch (opcionPerso) {
                case 1:
                    perso = new Mago(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese la vida que desea tener para agregar dificultad");
                    vida = scan.nextInt();
                    perso = new Guerrero(nombre, vida);
                    break;
                case 3:
                    System.out.println("Ingrese el daño deseado para saber la dificultad");
                    daño = scan.nextInt();
                    perso = new Asesino(nombre, daño);
                    break;
            }

            System.out.println("Ingrese la vida del enemigo");
            vidaEnemigo = scan.nextInt();
            Mago mag = new Mago("VALTAZAR", vidaEnemigo);

            System.out.println("Primer enemigo");
            System.out.println(mag.toString());

            switch (opcion1) {
                case 1:
                    do {

                        menuOpciones(turno);
                        opcion2 = scan.nextInt();
                        switch (opcion2) {
                            case 1:
                                perso.atacar(mag);
                                break;
                            case 2:
                                perso.defender();
                                break;
                            case 3:
                                perso.descansar();
                                break;
                            case 4:
                                perso.ataqueEspecial(perso);
                                break;

                        }
                        System.out.println("VALTAZAR STATUS");
                        System.out.println(mag.toString());

                        System.out.println("YOUR STATUS");
                        System.out.println(perso.toString());

                        if (mag.getVida() <= 0 || perso.getVida() <= 0) {
                            termino = true;
                        }
                        if (perso.getVida() > 0) {
                            gano = true;
                        }
                    } while (!termino);
                    if (gano) {
                        System.out.println("||| GANASTE LA BATALLA |||");
                    } else {
                        System.out.println("Perdiste");
                    }

                    break;
                case 2:
                    break;
            }

        } while (opcion1 != 0);

    }

    public static void menuPrincipal() {
        System.out.println("\n\n\t\t <<<Warriors>>>\n\n");
        System.out.println("|1|.QUE COMIENCE EL JUEGO");
        System.out.println("|0|SALIR...");
    }

    public static void menuOpciones(int nro) {
        System.out.println("\n\n\t\t <<<DECIDE TU MOVIMIENTO>>>\n\n");
        System.out.println("|1|.ATACAR!");
        System.out.println("|2|.DEFENDERSE!");
        System.out.println("|3|.DESCANSAR!");
        System.out.println("|4|.ATAQUE ESPECIAL!!!");
    }

}
