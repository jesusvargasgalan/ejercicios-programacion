/*
 * 
 * Ejercicio03
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while
 * 
 * 
 * 
 */


public class Ejercicio03 {

	public static void main(String[] args) {
		 
		
		int numero = 0;
		
		do{
			if((numero % 5) == 0){
				System.out.print(numero + " - ");
				numero+=5;
			}
		}while(numero <=100);
		

	}

}
