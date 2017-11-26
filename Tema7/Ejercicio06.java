 /*
  * Ejercicio06
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int[] array = new int[15];
    int aux = 0;
    int f = 0;

    for (f = 0; f < array.length; f++) {
      System.out.println("Introduce un numero");
      array[f] = teclado.nextInt();
      teclado.nextLine();

    }

    for (f = 0; f < 15; f++) {

      System.out.print("Posicion " + f + "= " + array[f] + " ");
    }
    System.out.println();

    for (f = 0; f < 15; f++) {
      if (f < 14) {
        aux = array[f + 1];
      } else {
        aux = array[0];
      }
      System.out.print("Posicion " + f + "= " + aux + " ");
    }


  }

}
