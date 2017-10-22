/*
 * Ejercicio13
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que lea una lista de diez números y determine cuántos
  son positivos, y cuántos son negativos.
   
 */
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		int contador = 0;
	do {
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		contador++;
		
			if(numero > 0){
				positivos++;
			}
			else
			{
				negativos++;
			}
		
		}while(contador < 10);
	System.out.println("Numeros positivos : " + positivos);
	System.out.println("Numero negativos: " + negativos);
		
	}

}
