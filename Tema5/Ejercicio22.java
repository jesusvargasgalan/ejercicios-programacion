import java.util.Scanner;

/*
 * Ejercicio22
 * 
 * Jesus Vargas Galan
 * 
 *Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
public class Ejercicio22 {

  public static void main(String[] args) {

  
  Scanner teclado = new Scanner(System.in);
  
  for(int f = 2; f <= 100;f++){
    if(f % 1 == 0 && f % f == 0 && f % 2 !=0){
      System.out.print(f + (" "));
  
    }
      
  }
  }

}

