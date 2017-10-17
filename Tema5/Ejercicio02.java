
/*
 * 
 * Ejercicio02
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while 
 * 
 * 
 * 
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		System.out.println("A continuacion se van a mostrar todos los numeros multiplos de 5");
		System.out.println("--------------");
		
		while(numero <= 100){
			if((numero % 5) == 0){
				System.out.print(numero + " - ");
				
			numero+=5;
			}
		}
	}

}
