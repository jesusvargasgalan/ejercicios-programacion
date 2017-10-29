/*
 * Ejercicio34.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
  dos números diferentes los dígitos pares y los impares. Se van comprobando
  los dígitos de la siguiente manera: primer dígito del primer número, primer
  dígito del segundo número, segundo dígito del primer número, segundo
  dígito del segundo número, tercer dígito del primer número... Para facilitar
  el ejercicio, podemos suponer que el usuario introducirá dos números de la
  misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
  long en lugar de int donde sea necesario para admitir números largos.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio34 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    long numero1 = 0;
    long numero2 = 0;
    
    System.out.println("Introduce un numero");
    numero1 = teclado.nextLong();
    teclado.nextLine();
    
    System.out.println("Introduce un segundo numero");
    numero2 = teclado.nextLong();
    teclado.nextLine();
    
    long numeroIntroducido = numero1;
    long volteado1 = 0;
    int longitud = 0;
    
    /* Le da la vuelta al primero numero introducido */
    while(numeroIntroducido > 0){
      volteado1 = (volteado1 * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
      longitud++;
    }
    
    numeroIntroducido = numero2;
    long volteado2 = 0;
    
    /* Le da la vuelta al segundo numero */
    while(numeroIntroducido > 0){
      volteado2 = (volteado2 * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
      longitud++;
    }
    
    long resultadoPares = 0;
    long resultadoImpares = 0;
    int digito;
    
    /*Se recorre el numero dependiendo de su longitud*/
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado1 % 10);

      if ((digito % 2) == 0 ){
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      digito = (int)(volteado2 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }
    
  
    
    System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
    System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
  }
}

