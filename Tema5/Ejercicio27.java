/*
 * Ejercicio27.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
   entre 1 y un número leído por teclado.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio27 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    int contador = 0;
    int suma = 0;
    
    System.out.println("Introduce un numero por teclado separados por espacio");
    numero = teclado.nextInt();
    
    for(int f = 1; f < numero; f++){
      if(f % 3 == 0){
        contador++;
        suma +=f;
        System.out.println(f);
       
      }
    }
    System.out.println("Hay un total de " + contador + " numeros multiplos de 3");
    System.out.println("Entre todos suman la cantidad de " + suma);
  
      
    
    

 }
}

