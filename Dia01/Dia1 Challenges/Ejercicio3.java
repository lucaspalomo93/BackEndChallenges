import java.util.Scanner;

/*
 * Realizar un programa para calcular el promedio de tres notas, 
 * e indique si el promedio es menor de 10 que muestre reprobado, 
 * si es mayor que 10 pero menor que 15 aprobado, y mayor de 15 eximido.
 */
public class Ejercicio3 {
	public static void main(String args[]) {
		float nota1, nota2, nota3, promedio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese la primera nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("ingrese la segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("ingrese la tercera nota: ");
		nota3 = sc.nextFloat();
		
		promedio = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("El promedio de las tres notas es: 4" + promedio);
		
	}
}
