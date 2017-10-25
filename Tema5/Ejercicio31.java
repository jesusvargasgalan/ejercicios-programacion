/*
 * Ejercicio31.java
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
  programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
  mitad (división entera entre 2) de la altura más uno.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio31 {
	
	public static void main (String args[]) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Que altura deseas que tenga tu L");
		int altura = teclado.nextInt();
		teclado.nextLine();
		
		for(int f = 1;f < altura; f++){
			System.out.println( " * ");	
		}
		for(int i = 0 ; i < (altura / 2) + 1;i++){
		System.out.print(" * ");
		}
		
	}
}

