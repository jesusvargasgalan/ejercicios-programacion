/*
 * Ejercicio03.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 *convertir debe ser introducida por teclado.
 * 
 * 
 */


public class Ejercicio03 {

  public static void main (String args[]) {
  
     
    System.out.println("Introduce cuantas pesetas quieres pasar a euros");
    int pesetas = Integer.parseInt( System.console().readLine() );
     
    
    System.out.println(pesetas+" pesetas equivalen a " +(double)(pesetas / 166.386)+ " euros"); 

  }
}
