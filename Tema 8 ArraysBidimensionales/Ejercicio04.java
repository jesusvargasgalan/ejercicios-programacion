/*
 * Ejercicio04.java
 * 
 * Jesus Vargas Galan
 * 
 */
public class Ejercicio04 {

  public static void main(String[] args) throws InterruptedException {

    int[][] numeros = new int[4][5];
    int f = 0;
    int c = 0;
    int sumaFilas = 0;
    

    for (f = 0; f < 4; f++) {
      for (c = 0; c < 5; c++) {
        int numeroAleatorio = (int) (Math.random() * 900) + 100;
        numeros[f][c] = numeroAleatorio;
        Thread.sleep(1000);
        System.out.printf("%7d ", numeros[f][c]);
        sumaFilas += numeros[f][c];

      }

      Thread.sleep(1000);
      System.out.printf("|%7d\n", sumaFilas);
    }
    for (c = 0; c < 5; c++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for (c = 0; c < 5; c++) {
      sumaColumna = 0;
      for (f = 0; f < 4; f++) {
        sumaColumna += numeros[f][c];
      }

      sumaTotal += sumaColumna;
      Thread.sleep(1000);
      System.out.printf("%7d   ", sumaColumna);
    }
    Thread.sleep(1000);
    System.out.printf("|%7d   ", sumaTotal);
  }


}
