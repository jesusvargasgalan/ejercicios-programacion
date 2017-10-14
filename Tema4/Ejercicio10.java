/*
 * Ejercicio06.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 *nacimiento.
 * 
 * 
 */


import java.util.Scanner ;

public class Ejercicio10 {

  public static void main (String args[]) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Escribe el mes en el que naciste (1 al 12)");
    int mes = teclado.nextInt();
    teclado.nextLine();
    
    System.out.println("Escribe el dia en el que naciste");
    int dia = teclado.nextInt();
    
    switch(mes){
    case 1:
    	if( dia < 20 ){
    		System.out.println("Eres capricornio");
    	}
    	else
    	{
    		System.out.println("Eres acuario");
    	}
    	break;
    case 2:
    	if( dia < 19 ){
    		System.out.println("Eres acurio");
    	}
    	else
    	{
    		System.out.println("Eres piscis");
    	}
    	break;
    case 3:
    	if(dia < 20 ){
    		System.out.println("Eres piscis");
    	}
    	else
    	{
    		System.out.println("Eres aries");
    	}
    	break;
    case 4:
    	if( dia < 20 ){
    		System.out.println("Eres aries");
    	}
    	else
    	{
    		System.out.println("Eres tauro");
    	}
    	break;
    case 5:
    	if(dia < 21 ){
    		System.out.println("Eres tauro");
    	}
    	else
    	{
    		System.out.println("Eres geminis");
    	}
    	break;
    case 6:
    	if( dia < 22 ){
    		System.out.println("Eres geminis");
    	}
    	else
    	{
    		System.out.println("Eres cancer");
    	}
    	break;
    case 7:
    	if( dia < 22 ){
    		System.out.println("Eres cancer");
    	}
    	else
    	{
    		System.out.println("Eres leo");
    	}
    	break;
    case 8:
    	if( dia < 24 ){
    		System.out.println("Eres leo");
    	}
    	else
    	{
    		System.out.println("Eres virgo");
    	}
    	break;
    case 9:
    	if( dia < 24 ){
    		System.out.println("Eres virgo");
    	}
    	else
    	{
    		System.out.println("Eres libra");
    	}
    	break;
    case 10:
    	if( dia < 24 ){
    		System.out.println("Eres libra");
    	}
    	else
    	{
    		System.out.println("Eres escorpio");
    	}
    	break;
    case 11:
    	if( dia < 24 ){
    		System.out.println("Eres escorpio");
    	}
    	else
    	{
    		System.out.println("Eres sagitario");
    	}
    	break;
    case 12:
    	if( dia < 23 ){
    		System.out.println("Eres sagitario");
    	}
    	else
    	{
    		System.out.println("Eres capricornio");
    	}
    	break;
    }
  }
}