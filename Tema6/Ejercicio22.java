/*
 * Ejercicio22.java
 * 
 * Jesus Vargas Galan
 * 
 * Pinta una serpiente que este situada a 13 espacios y que vaya serpenteando
 */
import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String serpiente = " ";

    System.out.println("Introduce la longitud de la serpiente");
    int longitud = teclado.nextInt();
    teclado.nextLine();

    System.out
        .print("             "); /* Pinta los 13 espacios para la cabeza */
    System.out.println("@");
    for (int f = 0; f < longitud; f++) {

      int serpenteo = (int) (Math.random() * 3);
      if ((serpenteo == 0) || (serpenteo == 2)) {
        System.out.print(
            "             ");/*
                              * Pinta los 13 espacios para cada parte del cuerpo
                              */
      } else {
        System.out.print("            ");/*
                                          * Aqui pinta 12 espacios para que se
                                          * situe a la izquierda del centro
                                          */
      }

      switch (serpenteo) {
      case 0:
        serpiente = "*";
        break;
      case 1:
        serpiente = "*";
        break;
      case 2:
        serpiente = " *";
        break;
      default:
        serpiente = String.valueOf(serpenteo);
      }
      System.out.println(serpiente);

    }

  }

}
