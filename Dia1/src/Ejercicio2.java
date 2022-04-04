import java.util.Scanner;

/*
 * Realizar un programa para el cálculo de las raíces de ecuación de segundo grado, 
 * el programa debe diferenciar entre las raíces imaginarias, raíces distintas, raíces iguales.
 */
public class Ejercicio2 {
	public static void main(String args[]) {
		float incognitaPositivo, incognitaNegativo, discriminante;
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ecuacion: ax^2 + bx + c ");
		System.out.println("Ingrese el valor de a: ");
		a = sc.nextInt();
		System.out.println("Ingrese el valor de b: ");
		b = sc.nextInt();
		System.out.println("Ingrese el valor de c: ");
		c = sc.nextInt();
		
		discriminante = (float) Math.sqrt(Math.pow(b, 2)- 4 * (a*c));
		incognitaPositivo = (float) (-b + discriminante / (2*a));
		incognitaNegativo = (float) (-b - discriminante / (2*a));
		
		System.out.println("x1 = " + incognitaPositivo);
		System.out.println("x2 = " + incognitaNegativo);
		
		if(discriminante > 0) {
			System.out.println("Hay dos raices distintas");
		}else if(discriminante == 0) {
			System.out.println("Hay una raiz doble");
		}else if(discriminante < 0) {
			System.out.println("No hay raices reales");
		}
		
		
		
	}
}
