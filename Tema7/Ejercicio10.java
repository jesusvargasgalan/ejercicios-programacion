/*
 * Ejercicio10.java
 * 
 * Jesus Vargas Galan
 */
public class Ejercicio10 {

  public static void main(String[] args) {


    int[] numeros = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int pares = 0;
    int impares = 0;
    int f = 0;
    int numerosAleatorios = 0;
   

    for (f = 0; f < numeros.length; f++) {
      numerosAleatorios = (int) (Math.random() * 101);
      numeros[f] = numerosAleatorios;


      if (numeros[f] % 2 == 0) {
        par[pares++] = numeros[f];
      } else {
        impar[impares++] = numeros[f];
      }

    }
    for (f = 0; f < pares; f++) {
      numeros[f] = par[f];
    }
    for (f = pares; f < 20; f++) {
      numeros[f] = impar[f - pares];

    }
    for (f = 0; f < numeros.length; f++) {
      System.out.println(numeros[f]);
    }

  }



}


