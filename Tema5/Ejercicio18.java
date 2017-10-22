/*
 * Ejercicio18
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
 */
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		
Scanner teclado = new Scanner(System.in);
		
		
		int numero = 0;
		int numero2 = 0;
		int aux = 0;
		
		do{
			
			System.out.println("Introduce un numero por teclado");
			numero = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Introduce un numero por teclado");
			numero2 = teclado.nextInt();
			teclado.nextLine();
			
			
			if (numero == numero2){
			System.out.println("Numero incorrecto");
			}
		}while(numero == numero2);
		
		if(numero > numero2){
			aux = numero;
			numero = numero2;
			numero2 = aux;
		}
		for(int f = numero; f < numero2 ;f +=7){
			System.out.println(f);
			
			
			
		}
	}

}
