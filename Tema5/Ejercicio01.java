/*
 * 
 * Ejercicio01
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		System.out.println("A continuacion se van a mostrar todos los numeros multiplos de 5");
		System.out.println("--------------");
		
		
		for(int f=0;f <= 100;f++){
			if((f % 5) == 0){
				System.out.print(f+" - ");
				
			}
			
		}

	}

}
