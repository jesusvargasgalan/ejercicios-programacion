 /*
  * Ejercicio07
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
public class Ejercicio07 {

  public static void main(String[] args) {

    int[] numeros = new int[100];
    int f = 0;
    for (f = 0; f < numeros.length; f++) {
      int numeroAleatorio = (int) (Math.random() * 21);
      numeros[f] = numeroAleatorio;

      System.out.println(numeros[f]);
    }

  }

}
