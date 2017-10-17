
/*
 * 
 * Ejercicio06
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
   utilizando un bucle do while
 * 
 * 
 * 
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		
		int numero = 320;
		do{
			if( numero >=160){
				System.out.print(numero + " - ");
				numero-=20;
			}
		}while(numero >= 160);

	}

}
