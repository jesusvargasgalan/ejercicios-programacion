/*
 * Ejercicio01.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que pida dos números y que luego muestre el resultado
 *de su multiplicación.
 * 
 * 
 */


public class Ejercicio01 {
	
	public static void main (String args[]) {
	
	
		System.out.println("Introduce un numero");
		int primerNumero = Integer.parseInt( System.console().readLine() );
		System.out.println("Introduce otro numero");
		int segundoNumero = Integer.parseInt( System.console().readLine() );
		System.out.println("La multiplicacion de ambos es igual a " + (
		primerNumero * segundoNumero));
		
	}
}

