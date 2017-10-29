/*
 * Ejercicio39.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
   muestre a continuación los números desde el 1 al número introducido junto
   con su factorial.
 * 
 * 
 */


import java.util.Scanner;

public class Ejercicio39 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    int factorial = 1;
    
    System.out.println("Introduce un numero");
    numero = teclado.nextInt();
    teclado.nextLine();
    
    for (int f = 1; f < numero; f++){
      
      factorial *=f;
      
      System.out.println(f + " ! = " + factorial);
      
    }
    
      
    
  }
}

