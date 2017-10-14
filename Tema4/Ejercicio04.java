/*
 * 
 * Ejercicio04.java
 * 
 * Jesus Vargas Galan
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 *las horas extras. Escribe un programa que calcule el salario semanal de un
 *trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 *trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 *euros la hora.
 * 
 */
import java.util.Scanner;
public class Ejercicio04 {

	


		public static void main(String[] args) {
			
			
			Scanner teclado = new Scanner(System.in);
			
			
			System.out.println("Cuantas horas trabajas al dia");
			int horas = teclado.nextInt();
			
			
			System.out.println("Cuantos dias trabajas a la semana");
			int dias = teclado.nextInt();
			
			double cobroTotal= horas * 12 * dias;
			
			
			if((horas * dias) >= 41) {
				System.out.println("Eres apto al plus por trabajar mas de 41 horas");
				System.out.println("Cobraras "+(horas * 16 * dias)+ " €");
			}
			else
			{
			System.out.println("Cobraras " +(horas * 12 * dias) + " €");
			}
			
		}

	}