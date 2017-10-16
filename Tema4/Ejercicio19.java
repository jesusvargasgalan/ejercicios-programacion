import java.util.Scanner;

/*
 * 
 * Ejercicio05.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 *puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
		
public class Ejercicio19 {

	public static void main(String[] args) {
		 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero de hasta 5 cifras");
		int numero = teclado.nextInt();
		
		if(numero >=-9 && numero <=0 || numero >=1 && numero <=9) {
			System.out.println("Tu numero tiene 1 cifra");
		}
		if(numero >=-99 && numero <=-10 || numero >=10 && numero <=99) {
			System.out.println("Tu numero tiene 2 cifra");
		}
		if(numero >=-999 && numero <=-100 || numero >=100 && numero <=999) {
			System.out.println("Tu numero tiene 3 cifra");
		}
		if(numero >=-9999 && numero <=-1000 || numero >=1000 && numero <=9999) {
			System.out.println("Tu numero tiene 4 cifra");
		}
		if(numero >=-99999 && numero <=-10000 || numero >=10000 && numero <=99999) {
			System.out.println("Tu numero tiene 5 cifra");
		}

	}

}
