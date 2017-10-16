import java.util.Scanner;

/**
 * 	Ejercicio20.java
 *
 *
 *	Jesus Vargas Galan
 *  Realiza un programa que nos diga cuántos dígitos tiene un núme
 * 
 *  Realiza un programa que diga si un número entero positivo
 *     introducido por teclado es capicúa. Se permiten números de
 *     hasta 5 cifras.
 *
 * 
 */
public class Ejercicio20 {

 public static void main(String[] args) {
 
	 
	 	Scanner teclado = new Scanner(System.in);
         int n;
   
   
        System.out.print("Introduce un numero de 5 cifras como maximo ");
        n = teclado.nextInt();
   
   
        if (n < 10) {  
        System.out.println("El numero introducido es capicua.");
        }
        else
        {
        System.out.println("El numero introducido no es capicua.");
   }
   
   
   if ((n >= 10) && (n < 100))  ((n / 10) == (n % 10)) {
       capicua = true;
     }
   }

   if ((n >= 100) && (n < 1000)) {
     if ((n / 100) == (n % 10)) {
       capicua = true;
     }
   }

   if ((n >= 1000) && (n < 10000)) {
     if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
       capicua = true;
     }
   }
   
   
   if (n >= 10000) {
     if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
       capicua = true;
     }
   }
   
  
   }
 }
}