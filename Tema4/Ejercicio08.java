/*
/*
 * Ejercicio08.java
 * 
 * Jesus Vargas Galan
 * 
 *Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 *suficiente, bien, notable o sobresaliente).
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio08 {

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
    
    if(media ==5){
      System.out.println("Suficiente");
    }
    if(media ==6){
      System.out.println("Bien");
    }
    if(media >= 7 && media <=8){
      System.out.println("Notable");
    }
    if(media >=9 && media <=10){
      System.out.println("Sobresaliente");
    }
    if(media >=0 && media <5){
      System.out.println("Insuficiente");
    }
  }
}
