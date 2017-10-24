/*
 * Ejercicio30.java
 * 
 * Jesus Vargas Galan
 * 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
   dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
   El día de la semana se puede pedir como un número (del 1 al 7) o como una
   cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
   los datos correctamente y que el segundo día es posterior al primero.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio30 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora = 0;
    int segundaHora = 0;
    boolean diaCorrecto = false;
    boolean horaCorrecta = false;
    int horasTotales = 0;
    do{
    System.out.println("Introduce el dia");
    primerDia= teclado.nextInt();
    teclado.nextLine();
    
    
    System.out.println("Introduce la hora");
    primeraHora = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Introduce el dia al que quieres llegar");
    segundoDia= teclado.nextInt();
    teclado.nextLine();
    
    
    System.out.println("Introduce la hora a la que quieres llegar");
    segundaHora = teclado.nextInt();
    teclado.nextLine();
    
    if ( (primerDia < segundoDia) && (primerDia <= 7) && (segundoDia <=7)){
      diaCorrecto = true;
    }
    if ((primeraHora <= 24) && (segundaHora <= 24)){
      horaCorrecta = true;
    }
      
    
  
      }while((!diaCorrecto) && (!horaCorrecta));
      
     if((diaCorrecto) && (horaCorrecta)){
      horasTotales =(((segundoDia * 24) + segundaHora) - ((primerDia * 24 ) + segundaHora));
      
      System.out.println("Entre el dia " + primerDia + " a las " + primeraHora +
      " :00 horas hasta el dia " + segundoDia + " y a las " + segundaHora + " :00 horas hay "
       + horasTotales + " horas");
     }else{
       System.out.println("Datos incorrectos");
       
     }
      
    }
  }



