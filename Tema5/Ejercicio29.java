/*
 * Ejercicio29.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros
   positivos menores a uno leído por teclado que no sean divisibles entre otro
   también leído de igual forma.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio29 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    int divisor = 0;
    
    System.out.println("Introduce un numero");
    numero = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Introduce un divisor");
    divisor = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Los siguientes numero son menores que " + numero + " y no se pueden dividir entre " + divisor);
    
    for(int f = 0; f < numero; f++){
      if((f  % divisor != 0)){
        System.out.print(f + " ");
      }
      
    }
  }
}
