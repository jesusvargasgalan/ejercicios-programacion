/*
 * Ejercicio22.java
 * 
 * Jesus Vargas Galan
 * 
 * Pinta una serpiente que este situada a 13 espacios y que vaya serpenteando
 */
import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

   import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    

    System.out.println("Introduce la longitud de la serpiente");
    int longitud = teclado.nextInt();
    teclado.nextLine();

    System.out.print("             "); /* Pinta los 13 espacios para la cabeza */
    System.out.println("@");
    
    int espacios = 13;
    for (int f = 0; f < longitud; f++) {

      espacios += (int) (Math.random() * 3) - 1;
      
    for(int j = 0; j < espacios; j++){
      System.out.print(" ");
     }
    System.out.println("*");
    
    }
    }
    }
