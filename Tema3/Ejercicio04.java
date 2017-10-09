/*
 * Ejercicio04.java
 * 
 * Jesus Vargas Galan
 *Escribe un programa que sume, reste, multiplique y divida dos números
 *introducidos por teclado.
 * 
 * 
 */
import java.util.Scanner ;

public class Ejercicio04 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    
    System.out.println("Introduce un numero por teclado");
    double numero1=teclado.nextDouble();
    
    
    System.out.println("Introduce un numero por teclado");
    double numero2=teclado.nextDouble();
    
    
    System.out.println(numero1+" + "+numero2+" = "+(numero1 + numero2));
    System.out.println(numero1+" - "+numero2+" = "+(numero1 - numero2));
    System.out.println(numero1+" * "+numero2+" = "+(numero1 * numero2));
    System.out.println(numero1+" / "+numero2+" = "+(numero1 / numero2));
  }
}

