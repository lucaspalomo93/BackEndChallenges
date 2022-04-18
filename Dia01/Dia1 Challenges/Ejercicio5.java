import java.util.Scanner;

/*
 * Realizar un programa que indique el menor de tres valores numéricos. 
 */
public class Ejercicio5 {
	public static void main(String args[]) {
		int numero1, numero2, numero3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Ingrese otro numero: ");
		numero2 = sc.nextInt();
		
		System.out.println("Ingrese un ultimo numero: ");
		numero3 = sc.nextInt();
		
		if(numero1 < numero2 && numero1 < numero3 ) {
			System.out.println("El primer numero es el menor: " + numero1);
		}else if(numero2 < numero1 && numero2 < numero3) {
			System.out.println("El segundo numero es el menor: " + numero2);
		}else if(numero3 < numero1 && numero3 < numero2) {
			System.out.println("El tercer numero es el menor: " + numero3);
		}else {
			System.out.println("Los tres numeros son iguales");
		}
	}
}
