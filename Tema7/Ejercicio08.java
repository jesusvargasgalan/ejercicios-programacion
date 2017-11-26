 /*
  * Ejercicio08
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int[] temperatura = new int[12];
    int f = 0;
    int i = 0;
    int aux = 0;
    String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    for (f = 0; f < 12; f++) {
      System.out.println("En " + mes[f] + " ha hecho una temperatura de ");
      temperatura[f] = teclado.nextInt();
      teclado.nextLine();
    }
    for (i = 0; i < 12; i++) {
      System.out.print(mes[i]);
      for (f = 0; f < temperatura[i]; f++) {
        System.out.print(" *");
      }
      System.out.println();
    }

  }
}


