/*
 * Ejercicio41.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
  hay dentro de un número. Se recomienda usar long en lugar de int ya que el
  primero admite números más largos.
 * 
 */

import java.util.Scanner;

public class Ejercicio41 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    long numero = 0;
    
    
    System.out.println("Introduce un numero");
    numero = teclado.nextLong();
    teclado.nextLine();
    
    long n = numero;
    int contadorPares = 0;
    int contadorImpares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }
      n /= 10;
    }
    System.out.print("En el numero hay " + contadorPares + " numero pares y " + contadorImpares + " numeros impares");
  }
}

