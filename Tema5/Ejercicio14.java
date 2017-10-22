/*
 * Ejercicio14
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.
 */
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		
		 Scanner teclado = new Scanner(System.in);
		    
		    double base = 0;
		    double exponente = 0;
		  
		    while(base >= 0 && exponente >=0){
		    System.out.println("Dame el numero base");
		    base = teclado.nextDouble();
		    teclado.nextLine();
		  
		    System.out.println("Dame el numero del exponente");
		    exponente = teclado.nextDouble();
		  
		    double  potencia = Math.pow(base,exponente);
		  
		  if(base >= 0 && exponente >= 0)
		  System.out.println("El resultado es " + potencia);
		}
		  
	}

}
