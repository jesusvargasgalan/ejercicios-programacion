import java.util.Scanner;

/* 
 * 
 * 
 * Ejercicio22.java
 * 
 *	Jesus Vargas Galan
 *
 *
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
 * semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
 *Se da por hecho que el usuario introducirá un día y hora correctos,
 *anterior al viernes a las 15:00h.
 *
 * 
 */

public class Ejercicio22 {
  public static void main(String[] args) {

	  
	 Scanner teclado = new Scanner(System.in);
	 
	 int diaNumero = 0;
	 
    System.out.println("Introduce un dia de la semana de lunes a viernes ");
    String dia = teclado.nextLine();
    

    
    switch(dia) {
      case "lunes":
        diaNumero = 1;
        break;
        
      case "martes":
        diaNumero = 2;
        break;
        
      case "miercoles":
    	diaNumero = 3;
        break;
        
      case "jueves":
        diaNumero = 4;
        break;
        
      case "viernes":
    	diaNumero = 5;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    
    System.out.print("Introduce la hora: ");
    int horas = teclado.nextInt();
    teclado.nextLine();
    
    System.out.print("Introduce los minutos: ");
    int minutos = teclado.nextInt();
    
    int minutosTotales = (111 * 3600 );/*en 5 dias hay 120 horas por lo que le quito 9 para que sean las 15 del viernes*/
    int minutosActuales = (diaNumero * 24 * horas * minutos * 60);
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " segundos para el fin de semana.");
  }
}