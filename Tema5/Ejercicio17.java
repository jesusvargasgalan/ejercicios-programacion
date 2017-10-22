/*
 * Ejercicio17
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero = 0;
	
		
		do{
			
			System.out.println("Introduce un numero por teclado");
			numero = teclado.nextInt();
			teclado.nextLine();
			
			if (numero < 0)
			System.out.println("Numero incorrecto");
		}while(numero < 0);
		
		int total = 0;
		
		for(int f = numero ; f < numero + 100 ;f++){
			
			total += f;
			
			
			
		}
		System.out.println("La suma de los 100 siguientes numeros a " + numero + " es " + total );
	}
}
