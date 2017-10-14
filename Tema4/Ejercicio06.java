/*
 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que calcule el 
 *tiempo que tardará en caer un objeto desde
 *una altura h. Aplica la fórmula t = √2h/g
 * siendo g = 9.81m/s
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio06 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Desde que altura arrojara el objeto");
    double altura = teclado.nextDouble();
    
    if(altura <= 0){
      System.out.println("Dato incorrecto");
    }
    else
    {
      double resultado = Math.sqrt(2 * altura / 9.8);
      System.out.printf("El objeto tardara en caer %.3f segundos",resultado);
    }
  }
}

