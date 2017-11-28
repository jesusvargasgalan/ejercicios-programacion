
/*
 * Ejercicio11.java
 * 
 * Jesus Vargas Galan
 * 
 * 
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int[] array = new int [10];
    int [] numerosPrimos = new int [10];
    int primos = 0;
    int f = 0;
    
    for(f = 0; f < array.length; f++){
      System.out.println("Introduce un numero por teclado");
      array[f] = teclado.nextInt();
      teclado.nextLine();
    }
    
    boolean esPrimo = true;
    for (int j = 2; j < 10; j++) {
      if ((array[j] % j) == 0) {
        esPrimo = false;
      }
    for(f = 0; f < array.length; f++){
      if(esPrimo){
        numerosPrimos[primos++] = array[f];
      }
      
      
    }
    for(f = 0; f < primos; f++){
      array[f] = numerosPrimos[f];
    }
    for(f = 0 ; f < array.length; f++){
      System.out.println(array[f]);
    }
    
  }
  }
}
