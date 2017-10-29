/*
 * Ejercicio42.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
   muestre a continuación los 5 números consecutivos a partir del número
   troducido. Al lado de cada número se debe indicar si se trata de un primo o
   no.
 * 
 * 
 */

import java.util.Scanner;
public class Ejercicio42{

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    boolean primo = false;
    
    System.out.println("Introduce u nnumero por teclado");
    numero = teclado.nextInt();
    teclado.nextLine();
    
    /* Igualo f al numero + 1 ya que pide que empiece a contar a partir del siguiente numero
     * y hago que sume 6 en vez de 5 ya que sino solo contaria 4 numero */
    for(int f = numero + 1 ; f < numero + 6;f++){
    if((f % 2 != 0) && (f % 1 == 0)  && (f % f == 0)){
      System.out.println(f + " es primo");
    }else{
      System.out.println(f + " no es primo");
    }
  }
  }
}


