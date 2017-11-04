/*
 * Ejercicio09.java
 * 
 * Jesus Vargas Galan
 * 
 * Introduce un numeroy y di cuantas cifras tiene
 * 
 * 
 */

import java.util.Scanner;
public class Ejercicio10 {

  public static void main (String args[]) {
    
    
    
    Scanner teclado = new Scanner(System.in);
    
    long numeroIntroducido = 0;
    long numeroInvertido = 0;
    int contador = 0;
    
    
    
    System.out.println("Introduce un numero");
    numeroIntroducido = teclado.nextLong();
    
    long numero = numeroIntroducido;
    
    while(numero > 0){
      
      numeroInvertido = (numeroInvertido * 10) + (numero % 10);
      numero /= 10;
      contador ++;
      
    }
    System.out.println("El numero tiene " + contador + " cifras");
    
  
  }
}

