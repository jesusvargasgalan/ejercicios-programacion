/*
 * Ejercicio07.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que calcule el salario semanal de un empleado en base
 *a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * 
 */



import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Cuantas horas trabajas al dia");
		int horas = teclado.nextInt();
		
		
		System.out.println("Cuantos dias trabajas a la semana");
		int dias = teclado.nextInt();
		
		
		System.out.println("Cobraras " + (horas * 12 * dias)+ " €");

	}

}
