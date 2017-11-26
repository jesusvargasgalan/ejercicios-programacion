 /*
  * Ejercicio03
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {

    int[] numeroIntroducido = new int[10];


    int f = 0;
    Scanner teclado = new Scanner(System.in);

    for (f = 0; f < 10; f++) {
      System.out.println("Introduce un numero");
      numeroIntroducido[f] = teclado.nextInt();
      teclado.nextLine();

    }
    System.out.println();

    for (int j = 9; j >= 0; j--) {
      System.out.println(numeroIntroducido[j]);

    }

  }
}
