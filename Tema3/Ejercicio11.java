import java.util.Scanner;

/*
 * Ejercicio11.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un conversor de Kb a Mb.
 * 
 * 
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce el numero de Kb(minimo 1024)");
		double kb = teclado.nextDouble();
		
		
		System.out.println(kb + " equivalen a " + (kb / 1024) + "Mb");
		
	}
}