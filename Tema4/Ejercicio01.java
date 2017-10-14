import java.util.Scanner;

/*
 * Ejercicio01.java
 * 
 * Jesus Vargas Galan
 * 
 *Escribe un programa que pida por teclado un día de la semana y que diga qué
 *asignatura toca a primera hora ese día.
 * 
 * 
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce un dia de lunes a viernes ");
		String dia = teclado.nextLine();
		
		
		if(dia.equals("lunes")){
			System.out.println("Toca programacion");
		}
		if(dia.equals("martes")) {
			System.out.println("Toca Sistemas Informaticos");
		}
		if(dia.equals("miercoles")) {
			System.out.println("Toca programacion");
		}
		if(dia.equals("jueves")) {
			System.out.println("Toca Entorno de desarrollo");
		}
		if(dia.equals("viernes")) {
			System.out.println("Toca Sistemas Informaticos");
		}
			
				
		
	}
}
