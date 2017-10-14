import java.util.Scanner;

/*
 * 
 * Ejercicio05.java
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +b = 0)
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¿Cuanto vale a ? ");
		int a = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Cuanto vale b ? ");
		int b = teclado.nextInt();
		
		
		if(a == 0) {
			System.out.println("No se puede resolver la ecuacion");
		}
		else
		{
			System.out.println("X es igual a "+ (-b / a));
		}

	}

}
