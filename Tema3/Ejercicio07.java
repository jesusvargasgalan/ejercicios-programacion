/*
 * Ejercicio07.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que calcule el total de una factura a partir de la base
 *imponible.
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio07 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce el precio de tu factura");
    double factura = teclado.nextDouble();
    
    
    System.out.println("Introduce la base imponible");
    double baseImponible = teclado.nextDouble();
    
    
    double facturatotal = factura % baseImponible;
    
    
    System.out.println("El precio a pagar sera de "+(facturatotal+factura)+" €");
    
  }
}

