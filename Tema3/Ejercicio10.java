import java.util.Scanner;

/*
 * Ejercicio10.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un conversor de Mb a Kb.
 * 
 * 
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce el numero de Mb");
		int mb = teclado.nextInt();
		
		
		System.out.println(mb + " equivalen a " + (double)(1024 * mb) + "Kb");

	}

}
