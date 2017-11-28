/*
 * Ejercicio12.java
 * 
 * Jesus Vargas GAlan
 */
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int[] numeros = new int[10];
    int[] resultado = new int[10];
    int f = 0;
    int posicionInicial = 0;
    int posicionFinal = 0;
    int avance = 0;
    int aux = 0;

    for (f = 0; f < numeros.length; f++) {
      System.out.println("Introduce un numero");
      numeros[f] = teclado.nextInt();
      teclado.nextLine();


    }

    System.out.println();
    for (f = 0; f < numeros.length; f++) {
      System.out.print("Indice " + f + " valor: " + numeros[f] + " -- ");

    }
    System.out.println();
    System.out.println("Introduce Posicion Inicial");
    posicionInicial = teclado.nextInt();
    teclado.nextLine();

    System.out.println("Introduce Posicion Final");
    posicionFinal = teclado.nextInt();
    teclado.nextLine();



    for (f = 0; f < numeros.length; f++) {
      resultado[f] = numeros[f];

    }
    resultado[posicionFinal] = numeros[posicionInicial];


    for (f = posicionFinal + 1; f < 10; f++) {
      resultado[f] = numeros[f - 1];

      resultado[0] = numeros[9];


      for (f = 0; f < 10; f++) {

        System.out.println("Posicion : " + f + " el valor es: " + resultado[f]);
      }
    }
  }
}

