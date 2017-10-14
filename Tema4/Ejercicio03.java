import java.util.Scanner;

/*
 * Ejercicio01.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 *diente nombre del día de la semana.
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dime un numero del 1 al 7");
		int numero = teclado.nextInt();
		
		
		if(numero == 1) {
			System.out.println("Lunes");
		}
		if(numero == 2) {
			System.out.println("Martes");
		}
		if(numero == 3) {
			System.out.println("Miercoles");
		}
		if(numero == 4) {
			System.out.println("Jueves");
		}
		if(numero == 5) {
			System.out.println("Viernes");
		}
		if(numero == 6) {
			System.out.println("Sabado");
		}
		if(numero == 7) {
			System.out.println("Domingo");
		}
		else if(numero > 7){
			System.out.println("El numero es mayor que 7 no es valido");
		}
	}
}