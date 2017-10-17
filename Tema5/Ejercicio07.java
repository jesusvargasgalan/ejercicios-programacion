
/*
 * 
 * Ejercicio07
 * 
 * Jesus Vargas Galan
 * 
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
	número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
	acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
	y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
	Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		String contraseña = "4762";
		int intentos = 4;
		int aciertos = 0;
		boolean flag = false;
		
		do{
			
			System.out.println("Introduce una clave para acceder a la cafa fuerte (cifras de 4 numeros  ");
			String digitos = teclado.nextLine();
			intentos--;
			aciertos++;
			
			if(digitos.equals(contraseña)){
				System.out.println("------------------");
				System.out.println("Has acertado en " + aciertos + " intento / s");
				
				flag = true;
			}
			else
			{
				System.out.println("Has fallado te quedan " + intentos + " intentos");
			}
			
		
			
		}while(intentos >0 && !flag);

		}

	}


