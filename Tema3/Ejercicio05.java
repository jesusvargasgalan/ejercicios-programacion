/*
 * Ejercicio05.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que calcule el área de un rectángulo.
 * 
 * 
 */

import java.util.Scanner ;

public class Ejercicio05 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
  
    System.out.println("Introduce la base de tu rectangulo");
    int base = teclado.nextInt();
    
    
    System.out.println("Introduce la altura de tu rectangulo");
    int altura = teclado.nextInt();
    
    
    System.out.println("El area de tu rectangulo es "+(base * altura));

  }
}

