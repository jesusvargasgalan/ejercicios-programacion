/*
 * Ejercicio09.java
 * 
 * Jesus Vargas Galan
 */

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int[] numeros = new int[8];
    int f = 0;

    for (f = 0; f < numeros.length; f++) {
      System.out.println("Introduce un numero ");
      numeros[f] = teclado.nextInt();
      teclado.nextLine();


    }

    for (f = 0; f < numeros.length; f++) {
      if ((numeros[f] % 2) == 0) {
        System.out.println(numeros[f] + " par");
      } else {
        System.out.println(numeros[f] + " impar");
      }
    }


  }

}
