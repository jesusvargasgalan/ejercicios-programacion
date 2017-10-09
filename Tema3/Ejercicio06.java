/*
 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * 
 */

import java.util.Scanner ;

public class Ejercicio06 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
  
    System.out.println("Introduce la base de tu triangulo");
    int base = teclado.nextInt();
    
    
    System.out.println("Introduce la altura de tu triangulo");
    int altura = teclado.nextInt();
    
    
    System.out.println("El area de tu triangulo es "+(double)(base * altura) / (double)(2));

  }
}


