/*
 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que dada una hora determinada (horas y minutos),
 *calcule los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio11 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Que hora es (de 0 a 24)");
    int horas = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Que minutos ");
    int minutos = teclado.nextInt();
    
  double segundosTotales=(horas * 3600) + (minutos * 60);
  double segundosRestantes=((24 * 3600)- segundosTotales);
    
    System.out.printf("Para llegar a medianoche quedan %.3f segundos",segundosRestantes);
  }
}

