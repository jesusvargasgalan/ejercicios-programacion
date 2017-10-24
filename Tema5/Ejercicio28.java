/*
 * Ejercicio28.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por
  teclado.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio28 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    int factorial = 1;
    
    System.out.println("Introduce un numero entero");
    numero = teclado.nextInt();
    
    for(int f = 1; f <= numero; f++){
      
      factorial *= f;
       
      }
      System.out.println(numero + " ! = " + factorial);
  
      
    
    

 }
}

