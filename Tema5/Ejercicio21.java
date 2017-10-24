import java.util.Scanner;

/*
 * 
 * Ejercicio21
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 numero negativo y nos diga cuantos números se han introducido, la media de
 los impares y el mayor de los pares. El número negativo sólo se utiliza para
 indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * 
 * 
 */
public class Ejercicio21 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero = 0;
    int aux = 0;
    int contadorTotal = 0;
    int contadorImpar = 0;
    int impares = 0;
    double media = 0;

    do {

      System.out.println("Dame un numero por teclado");
      numero = teclado.nextInt();
      teclado.nextLine();
      if (numero > 0) {
        contadorTotal++;

      }
      if (numero > aux) {
        aux = numero;

      }
      if (numero % 2 != 0) {
        contadorImpar++;
        impares += numero;
        media = impares / contadorImpar;
      }
    } while (numero > 0);

    System.out.println("Has introducido " + contadorTotal + " numeros por teclado");
    System.out.println("El mayor numero par es " + aux);
    System.out.println("La media de los impares es " + media);

  }

}
