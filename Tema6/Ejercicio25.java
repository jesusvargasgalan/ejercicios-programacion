/*
 * Ejercicio25
 * 
 * Jesus Vargas Galan
 * 
 * 100 numeros aleatorios del 10 al 200 que los primos se muestren entre # y los multiplos de 5 entre []
 */
public class Ejercicio25 {

  public static void main(String[] args) {

    for (int f = 0; f < 100; f++) {
      int numero = (int) (Math.random() * 191) + 10;

      boolean esPrimo = true;
      for (int j = 2; j < numero; j++) {
        if ((numero % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println("#" + numero + "#");
      } else if (numero % 5 == 0) {
        System.out.println("[" + numero + "]");
      } else {
        System.out.println(numero);
      }
    }
  }

}
