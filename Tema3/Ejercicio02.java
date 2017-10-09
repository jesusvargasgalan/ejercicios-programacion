/*
 * Ejercicio02.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 *convertir debe ser introducida por teclado.
 * 
 * 
 * 
 */


public class Ejercicio02 {

  public static void main (String args[]) {
  
     
    System.out.println("Introduce cuantos euros quieres pasar a pesetas");
    int euros = Integer.parseInt( System.console().readLine() );
     
    
    System.out.println(euros+" euros equivalen a " +(double)(euros * 166.386)+ " pesetas"); 

  }
}

