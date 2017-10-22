import java.util.Scanner;
/*
 * Ejercicio11
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
   los 5 primeros números enteros a partir de uno que se introduce por teclado.
   
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Introduce un numero por teclado");
		int numero = teclado.nextInt();
		
		
		for(int f = 0; f < 5;f++){
			numero++; /*Sumo el numero aqui y no tras mostrarlo por pantalla ya que el ejercicio pide los 5 siguientes numeros respecto al introducido por el teclado*/
			System.out.print("\n" + numero + " - " + (numero * numero) + " - " + (numero * numero * numero));
			
			
		}

	}

}
