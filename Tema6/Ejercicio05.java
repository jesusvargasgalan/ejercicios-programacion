/* Ejercicio05
 * 
 * Jesus Vargas Galan
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
   separados por espacios. Muestra también el máximo, el mínimo y la media
   de esos números.
 */
public class Ejercicio05 {

  public static void main(String[] args) {

    int numero = 0;
    int auxMayor = 0;
    int auxMenor = 199;
    int media = 0;
    

    for (int f = 0; f <= 50; f++) {
      numero = (int) (Math.random() * 100 + 100);
      media += numero / 50;
      if(numero > auxMayor){
        auxMayor = numero;
        
      }else if(numero < auxMenor){
        auxMenor = numero;
      }
      System.out.print(numero + " ");
      
    }
    System.out.println();
    System.out.println("El mayor es " + auxMayor);
    System.out.println("El menor es " + auxMenor);
    System.out.println("Y la media de esos numeros es " + media);
  }

}
