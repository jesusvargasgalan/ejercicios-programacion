/* Ejercicio01
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
   también la suma total (los puntos que suman entre los tres dados)
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    
    
    int dado1 = 0;
    int dado2 = 0;
    int dado3 = 0;
    int suma = 0;
    
    dado1 = (int)(Math.random()* 6 + 1);
    dado2 = (int)(Math.random()* 6 + 1);
    dado3 = (int)(Math.random()* 6 + 1);
    
    suma = dado1 + dado2 + dado3; 
    
    System.out.println(dado1);
    System.out.println(dado2);
    System.out.println(dado3);
    
    System.out.println("La suma de la tirada de tus dados es " + suma);

  }

}
