/*
 * Ejercicio12.java
 * 
 * Jesus Vargas Galan
 * 
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    for (int i = 0; i < 3000; i++) {
      System.out.println(" ");
      for (int f = 0; f < 3000; f++) {
        int numero = (int) (Math.random() * 32 + 90);
        char caracter = 'c';
        System.out.print((char) numero);
      }
    }
  }

}
