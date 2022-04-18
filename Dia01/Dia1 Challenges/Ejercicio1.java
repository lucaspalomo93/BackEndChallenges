import java.util.Scanner;

/*
 * Realizar un algoritmo que permita calcular el índice de masa corporal de una persona, 
 * ingresando sus valores del peso y la altura,  indique su valor según la siguiente tabla:
 */

public class Ejercicio1 {
	
	public static void main(String args[]) {
		float peso, altura, masaCorporal;
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Ingrese su peso: ");
		peso = sc.nextFloat();
		
		System.out.println("Ingrese su altura: ");
		altura = sc.nextFloat();
		
		masaCorporal = (float) (peso / Math.pow(altura, 2));
		System.out.println("masa corporal: " + masaCorporal);
		
		if(masaCorporal < 20) {
			System.out.println("Mal estado.");
		}else if(masaCorporal >= 20 && masaCorporal <= 22) {
			System.out.println("Bajo de peso.");
		}else if(masaCorporal > 22 && masaCorporal <= 25) {
			System.out.println("Peso normal.");
		}else if(masaCorporal > 25 && masaCorporal <= 30) {
			System.out.println("Sobrepeso");
		}else if(masaCorporal > 30 && masaCorporal <= 40) {
			System.out.println("Sobrepeso cronico");
		}else{
			System.out.println("Hospitalizado");
		}
		
		
	}
	

}
