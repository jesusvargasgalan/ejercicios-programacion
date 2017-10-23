import java.util.Scanner;

/*
 * Ejercicio23
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que permita ir introduciendo una serie indeterminada
  de números mientras su suma no supere el valor 10000. Cuando esto último
  ocurra, se debe mostrar el total acumulado, el contador de los números
  introducidos y la media.
 *
 *
 */
public class Ejercicio23 {

  public static void main(String[] args) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int numero = 0;
    int contador = 0;
    int cantidadDeNumeros = 0;


    
    do{
      System.out.println("Introduce un numero por teclado(el maximo es 10000)");
      numero = teclado.nextInt();
      teclado.nextLine();
      
      
      cantidadDeNumeros +=numero;
      contador++;
  
     
    }while((cantidadDeNumeros < 10000));
   
    System.out.println("Has introducido " + contador + " numeros");
    System.out.println("Has sumado la cantidad de " + cantidadDeNumeros);
    System.out.println("La media de tus numeros introducidos es de " + ( cantidadDeNumeros / contador));
   
      
    }
  }

