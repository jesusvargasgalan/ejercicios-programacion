/* Ejercicio01.java

  Jesus Vargas Galan

*/
public class Ejercicio01 {

  public static void main(String[] args) {

    int[][] num = new int[3][6];
    int f = 0;
    int c = 0;

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    for (f = 0; f < 3; f++) {
      System.out.print("Fila " + f + " ");
      System.out.println();
      for (c = 0; c < 6; c++) {
        System.out.print("Columna " + c + " = ");
        System.out.print(num[f][c] + " ");



      }
      System.out.println();



    }



  }
}
