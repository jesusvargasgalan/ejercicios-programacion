/*
 * Ejercicio15
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
   
 */
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		  double base = 0;
		  double exponente = 0;
		  
		    
		  System.out.println("Dame un numero base positivo");
		  base = teclado.nextDouble();
		  teclado.nextLine();
		  
		  System.out.println("Dame un  numero de exponente positivo");
		  exponente = teclado.nextDouble();
		  
		  
		    
		  for(int f = 1;f <= exponente;f++){
		     double  potencia = Math.pow(base,f);
		     
		     System.out.println("El resultado es " + (int)potencia);
		    }
		
		

	}

}
