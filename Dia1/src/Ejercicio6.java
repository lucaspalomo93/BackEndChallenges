import java.util.Scanner;

/*
 * Crea una aplicación que pida un número por teclado y después comprobaremos 
 * si el número introducido es capicúa, es decir, que se lee igual sin importar la dirección. 
 * Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicua. 
 * Piensa cómo puedes dar la vuelta al número. Una forma de pasar un número a un array es esta 
 * Character.getNumericValue(cadena.charAt(posicion)).
 */
public class Ejercicio6 {
	public static void main(String args[]) {
		int numero = 14041;
		Scanner sc = new Scanner(System.in);
		
		String palabra = String.valueOf(numero);

			for(int i = 0, j = palabra.length() -1; i <= j; i++, --j) {
				if(palabra.charAt(i) != palabra.charAt(j)) {
					System.out.println("No Es capicua");
				}else {
					System.out.println("Es capicua");
				}
			}


		

		
		
	}
}
