import java.util.Scanner;

/* 
  * 
  * 
  * Ejercicio15.java
  * 
  * Jesus Vargas Galan
  * 
  * Escribe un programa que pinte una pirámide rellena con un carácter
 *  introducido por teclado que podrá ser una letra, un número o un
 *  símbolo como *, +, -, $, &, etc. El programa debe permitir al
 *  usuario mediante un menú elegir si el vértice de la pirámide está
 *  apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
 *  derecha.
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
				
		
				 Scanner teclado = new Scanner(System.in);
		
		System.out.println("Con que caracter quiere rellenar la piramide ");
		char c = teclado.next().charAt(0);
		
		
		System.out.println("1. Con el vertice hacia la izquierda");
		System.out.println("2. Con el vertice hacia la derecha");
		System.out.println("3. Con el vertice hacia arriba");
		System.out.println("4. Con el vertice hacia abajo");
		int pos = teclado.nextInt();
	

		switch(pos) {
		
		case 1:
	        System.out.println("    " + c);
	        System.out.println("  " + c + " " + c);
	        System.out.println(c + " " + c + " " + c);
	        System.out.println("  " + c + " " + c);
	        System.out.println("    " + c);
	        break;
	        
		case 2:
	        System.out.println(c);
	        System.out.println(c + " " + c);
	        System.out.println(c + " " + c + " " + c);
	        System.out.println(c + " " + c);
	        System.out.println(c);
	        break;
	        
		case 3:	
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c +""+ c+"" + c +""+ c +"" +c);
        break;
        
		case 4:
        System.out.println(c +""+ c+"" + c +""+ c +"" +c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
		
      default:
		}
	}
}