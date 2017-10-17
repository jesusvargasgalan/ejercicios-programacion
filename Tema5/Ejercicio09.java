/*
 * 
 * Ejercicio10
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. A priori, el programa no sabe cuántos números se
  introducirán. El usuario indicará que ha terminado de introducir los datos
  cuando meta un número negativo.
 * 
 * 
 * 
 */


import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero = 0 ;
		int numeroTotal = 0;
		int contador = 0;
		
		System.out.println("Vamos a calcular la media de tus numeros");
		
		while(numero >= 0) {
		System.out.println("Dame un numero por teclado");
		numero = teclado.nextInt();
		teclado.nextLine();
		
		if(numero > 0){
		contador++;
		numeroTotal+=numero;
		}
	}
		System.out.printf("La media es " + (double)(numeroTotal / contador));
  }

}
