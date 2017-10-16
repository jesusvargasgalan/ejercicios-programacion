import java.util.Scanner;

/*
 * Ejercicio012.java
 * 
 * Jesus Vargas Galan
 * 
 *Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 *que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 *programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 *a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 *mientos en las diferentes asignaturas del curso.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int contador=0;
		String respuesta="";
		
		System.out.println("Vamos a realizar un test de infidelidad contesta con V o F ");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)\n" + 
				"");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo\n" + 
				"");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("9. Has notado que últimamente se perfuma más");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		respuesta=teclado.nextLine();
		if(respuesta.equals("V")) {
			contador+=3;
		}
		if(contador >= 0 && contador <=10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		else if(contador >=11 && contador <=22) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.\n" + 
					"");
		}
		else if(contador >= 22 && contador <=30) {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.\n" + 
					"");
		}
	
	}
}
