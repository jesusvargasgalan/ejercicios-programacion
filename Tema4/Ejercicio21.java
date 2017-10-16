import java.util.Scanner;

/*
 * 
 * 
 *  Ejercicio21.java
 *  
 *  Jesus Vargas Galan 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 *Si la media de los dos controles da un número mayor o igual a 5, el alumno
 *está aprobado y se mostrará la media. En caso de que la media sea un número
 *menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 *que se califica como apto o no apto, por tanto se debe preguntar al usuario
 *¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 *resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 *mantiene la nota media anterior.
 * 
 * 
 * 
 */
public class Ejercicio21 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que nota sacaste en el primer examen");
		double examen1 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Que nota sacaste en el segundo examen");
		double examen2 = teclado.nextDouble();
		teclado.nextLine();
		
		double media = (examen1 + examen2) / 2;
		
		if(media >= 5){
			System.out.println("Has aprobado con una media de " + media);
		}
		else
		{
			System.out.println("Parece que has suspendido,¿Has aprobado la recuperacion? Responde con apto/no apto");
			String recuperacion = teclado.nextLine();
			if(recuperacion.compareToIgnoreCase("apto") == 0){
				System.out.println("Enhorabuena has recuperado tienes un 5");
			}
			else
			{
				System.out.println("Lastima suspendiste la recuperacion,tu media es de " + (examen1 + examen2) / 2);
			}
			
		}
	}

}
