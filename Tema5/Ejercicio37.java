/*
 * Ejercicio37.java
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 */

import java.util.Scanner;

public class Ejercicio37 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    long numeroIntroducido = 0;
    long numeroInvertido = 0;
    
    
    
    System.out.println("Introduce un numero");
    numeroIntroducido = teclado.nextLong();
    
    long numero = numeroIntroducido;
    
    while(numero > 0){
      
      numeroInvertido = (numeroInvertido * 10) + (numero % 10);
      numero /= 10;
      
      
    }
    int palos;
    
    while (numeroInvertido > 0) {
    palos = (int)(numeroInvertido % 10);    
      
    for (int i = 0; i < palos; i++) {
      
      System.out.print("|");
    }
      if (numeroInvertido > 10) { 
        System.out.print(" - "); 
      }
      numeroInvertido /= 10; 
    }
  }
}
   
    

  
  


