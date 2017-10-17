

/*
 * 
 * Ejercicio08
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("De que numero deseas ver la tabla de multiplicar");
		int numero = teclado.nextInt();
		
		for(int f = 0; f<=10 ; f++){
			System.out.println(numero + " x " +f + " = " +(numero * f ));
			
			
		}

	}

}
