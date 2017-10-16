import java.util.Scanner;

/*
 * 
 * Ejercicio05.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que diga cuál es la primera cifra de un número entero
 *introducido por teclado. Se permiten números de hasta 5 cifras.
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero de 5 cifras como maximo por teclado");
		int numero = teclado.nextInt();
		
		if(numero <=99) {
			System.out.println("La primera cifra de tu numero es "+(numero/10 % 10));
			
		}
		if(numero >=100 && numero <= 999)
		{
			System.out.println("La primera cifra de tu numero es "+(numero / 100 %10));
		}
		if(numero >= 1000 && numero <= 9999) {
			System.out.println("La primera cifra de tu numero es "+(numero / 1000 %10));
		}
		if(numero >= 10000 && numero <=99999) {
			System.out.println("La primera cifra de tu numero es "+(numero / 10000 %10));
		}
		}
	
}
