/*
 * Ejercicio25.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que pida un número por teclado y que luego muestre ese
  número al revés.
 * 
 * 
 */


import java.util.Scanner;
public class Ejercicio25 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numeroIntroducido = 0;
    int numero = 0;
    int numeroInvertido = 0;
    
    System.out.println("Introduce un numero");
    numeroIntroducido = teclado.nextInt();
    teclado.nextLine();
    
    numero = numeroIntroducido;
    
    while(numero > 0){
      
      numeroInvertido = (numeroInvertido * 10) + (numero % 10);
      numero /= 10;
    }
    System.out.println(numeroInvertido);
  

  }
}

