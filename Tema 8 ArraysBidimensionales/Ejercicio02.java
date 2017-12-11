
public class Ejercicio02 {

  public static void main(String[] args) {

    int[][] numeros = new int[4][5];
    int f = 0;
    int c = 0;
    int sumaFilas = 0;
   
   

    for (f = 0; f < 4; f++) {
      for (c = 0; c < 5; c++) {
        int numeroAleatorio = (int) (Math.random() * 21);
        numeros[f][c] = numeroAleatorio;
        System.out.printf("%7d ", numeros[f][c]);
        sumaFilas += numeros[f][c];

      }


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
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }



}

