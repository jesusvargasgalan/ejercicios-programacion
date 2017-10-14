/*
 * Ejercicio13.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que ordene tres números enteros introducidos por
 *teclado.
 * 
 * 
 */


import java.util.Scanner ;


public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int aux;
		
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introduce un numero");
		 int numero1 = teclado.nextInt();
		 teclado.nextLine();
		 
		 System.out.println("Introduce un numero");
		 int numero2 = teclado.nextInt();
		 teclado.nextLine();
		 
		 System.out.println("Introduce un numero");
		 int numero3 = teclado.nextInt();
		 
		 if(numero1 > numero2){
			 aux=numero1;
			 numero1=numero2;
			 numero2=aux;
		 }
		 if(numero2 > numero3){
			 aux=numero2;
			 numero2=numero3;
			 numero3=aux;
		 }
		 if(numero1 > numero2){
			 aux=numero1;
			 numero1=numero2;
			 numero2=aux;
		 }
		 
		 System.out.println("Los numero ordenados son "+numero1+"-"+numero2+"-"+numero3);
	}

}
