/*
 * Ejercicio19
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Que altura desea que tenga su piramide");
		int altura = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Con que caracter quiere que se rellene su piramide");
		String caracter = teclado.nextLine();
		
		  for(int i=0;i<altura;i++){
	            for(int j=0;j<i+1;j++)
	            {
	                System.out.print(caracter);
	            }
	            System.out.println("");
	        }
	    }
		
	}
	

