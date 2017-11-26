 /*
  * Ejercicio04
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
public class Ejercicio04 {

  public static void main(String[] args) {

    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];


    for (int f = 0; f < 20; f++) {
      int numeroAleatorio = (int) (Math.random() * 100);
      numero[f] = numeroAleatorio;
      cuadrado[f] = (int) Math.pow(numeroAleatorio, 2);
      cubo[f] = (int) Math.pow(numeroAleatorio, 3);

      System.out.println(numero[f] + " " + cuadrado[f] + " " + cubo[f]);
    }

  }

}
