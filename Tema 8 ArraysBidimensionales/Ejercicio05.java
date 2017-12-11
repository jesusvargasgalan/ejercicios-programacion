/*
 * Ejercicio05.java
 * 
 * Jesus Vargas Galan
 */
public class Ejercicio05 {

  public static void main(String[] args) throws InterruptedException {

    int[][] numeros = new int[6][10];
    int f = 0;
    int c = 0;
    int aux = 0;
    int auxMinimo = 0;
    int filaMaxima = 0;
    int columnaMaxima = 0;
    int filaMinima = 0;
    int columnaMinima = 0;

    for (f = 0; f < 6; f++) {
      System.out.print("|");
      for (c = 0; c < 10; c++) {
        numeros[f][c] = (int) (Math.random() * 1001);
        aux = numeros[f][c];
        auxMinimo = numeros[f][c];
        Thread.sleep(500);
        System.out.printf("%7d ", numeros[f][c]);
        System.out.print("|");

      }


      System.out.println("");

    }
    for (f = 0; f < 6; f++) {
      for (c = 0; c < 10; c++) {
        if (numeros[f][c] > aux) {
          aux = numeros[f][c];
          filaMaxima = f;
          columnaMaxima = c;

        }
        if (numeros[f][c] < auxMinimo) {
          auxMinimo = numeros[f][c];
          filaMinima = f;
          columnaMinima = c;
        }
      }
    }
    System.out.println();
    System.out.println("El mayor numero es " + aux + " se encuentra en la fila " + filaMaxima
        + " en la " + "columna " + columnaMaxima);
    System.out.println("El menor numero es " + auxMinimo + " se encuentra en la fila " + filaMinima
        + " en la " + "columna " + columnaMinima);



  }

}
