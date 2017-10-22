/*
 * Ejercicio16
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		boolean primo = false;
		int numero = 0;
		
		do{
		System.out.println("Introduce un numero,el programa no se cerrara hasta haber encontrado un primo ");
		numero = teclado.nextInt();
		teclado.nextLine();
		
		if(numero % numero == 0 || numero % 1 == 0){
			primo = true;
		}
		if(numero % 2 == 0){
			primo = false;
			System.out.println("Tu numero no es primo");
			System.out.println();
		}
		
	    }while(!primo);
		
		if(primo){
			System.out.println("Tu numero es primo");
		}
		

	}
}
