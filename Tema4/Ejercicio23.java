import java.util.Scanner;

/*
 * Ejercicio23.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que calcule el precio final de un producto según su
 *base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 *reducido o superreducido) y el código promocional. Los tipos de IVA general,
 *reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
 *gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 *se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 *muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Ejercicio23 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		double auxIva = 0;
		double auxCod = 0;
		int ivaAplicado= 0;
		
		System.out.println("Introduce la base imponible de su producto");
		double base = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Introduce tipo de IVA (general,reducido o superreducido)");
		String iva = teclado.nextLine();
		
		
		System.out.println("Introduce codigo promocional (nopro,mitad,meno5 o 5porc)");
		String codigo= teclado.nextLine();
		
		
		if(iva.compareToIgnoreCase("general") == 0){
			auxIva =(base * 21 ) / 100 + base;
			
		}
		else if(iva.compareToIgnoreCase("reducido") == 0){
			auxIva =(base * 10 ) / 100 + base;
		}
		else if(iva.compareToIgnoreCase("superreducido") == 0){
			auxIva = (base * 4) / 100 + base;
		}
		if(codigo.compareToIgnoreCase("nopro") == 0){
			
		}
		else if(codigo.compareToIgnoreCase("mitad") == 0){
			auxCod = auxIva / 2;
		}
		else if(codigo.compareToIgnoreCase("meno5") == 0){
			auxCod = auxIva - 5;
		}
		else if(codigo.compareToIgnoreCase("5porc") == 0){
			auxCod = auxIva % 5;
		}
		System.out.println("-----------------------------");
		System.out.println("La base imponible de tu producto es: " +base+ " €");
		System.out.printf("Has elegido el iva " + iva +" por lo tanto el precio con el iva aplicado es de: %.3f€ ",auxIva);
		System.out.println();
		System.out.printf("Has elegido el descuento" + codigo +" por lo que tu producto se reduce en: %.3f€",auxCod);
		System.out.println();
		System.out.printf("Tu producto costara un total de "+(auxCod + auxIva) + " €" );

	}

}
