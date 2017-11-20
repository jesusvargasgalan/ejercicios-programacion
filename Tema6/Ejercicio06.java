/*

 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
   debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
   fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
   es menor o mayor que el número secreto.
 */
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero = (int) (Math.random() * 101);
    int numeroIntroducido = 0;
    int intentos = 5;
    boolean acierto = false;
    boolean acabado = false;

    System.out.println(numero);

    do {
      System.out.println("Introduce un numero");
      numeroIntroducido = teclado.nextInt();
      teclado.nextLine();
      intentos--;

      if (numeroIntroducido == numero) {
        acierto = true;
        acabado = true;
      }

      else if (numeroIntroducido > numero) {
        System.out.println("Tu numero es mayor al numero secreto");
      } else {
        System.out.println("Tu numero es menor al numero secreto");
      }
      if (intentos > 0) {
        System.out.println("Te quedan " + intentos + " intentos");
        
      }else if(intentos == 0){
        System.out.println("Has agotado todos tus intentos lo siento");
        acabado = true;
        acierto = true;

      }
      System.out.println("-----------------");

    } while (!acierto || !acabado);
    if(acierto){
      System.out.println("Enhorabuena has acertado");
    }
  }

}
