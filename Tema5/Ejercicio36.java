/*
 * Ejercicio36.java
 * 
 * Jesus Vargas Galan
 * 
  Escribe un programa que diga si un número introducido por teclado es o no
  capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
  programa debe aceptar números de cualquier longitud siempre que lo permita
  el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
  long en lugar de int ya que el primero admite números más largos.
 * 
 * 
 */


import java.util.Scanner;

public class Ejercicio36 {

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
     if(numeroInvertido == numeroIntroducido){
        System.out.println("El numero es capicua");
      }else{
        System.out.println("El numero no es capicua");
  }
  }
}
