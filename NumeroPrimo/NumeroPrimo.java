package triangulo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        int numero, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont > 2) {
            System.out.println("No es un numero primo");
        } else {
            System.out.println("Es un numero primo");
        }
        
        
//***********************SWITCH*********************************
//        System.out.println("Ingrese un numero del 1 al 14");
//        numero = sc.nextInt();
//
//        for (int i = numero; i >= 1; i--) {
//            if (numero % i == 0) {
//                cont++;
//            }
//        }

//        if (numero > 0 && numero <= 14) {
//            switch (numero) {
//                case 1:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 2:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 3:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 5:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 7:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 11:
//                    System.out.println("Es un numero primo");
//                    break;
//                case 13:
//                    System.out.println("Es un numero primo");
//                    break;
//                default:
//                    System.out.println("No es un numero primo");
//            }
//        } else {
//            System.out.println("Numero invalido, ingrese un numero del 1 al 14. Reinicie el programa.");
//        }
//    }
    }
}
