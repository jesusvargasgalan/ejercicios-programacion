/*
/*
 * Ejercicio07.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un programa que calcule la media de tres notas
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio07 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce la primera nota");
    int nota1 = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Introduce la segunda nota");
    int nota2 = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Introduce la tercera nota");
    int nota3 = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("--------------------------");
    double media = (nota1 + nota2 + nota3) / 3;
    
    if(media >= 5){
      System.out.println("Enhorabuena has aprobado, con una media de "+media);
    }
    else
    {
      System.out.println("Has suspendido , con una media de "+media);
    }
    
  }
}
