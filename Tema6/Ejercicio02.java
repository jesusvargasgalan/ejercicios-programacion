/* Ejercicio02
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la
   baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
   diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
   cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
   sería el 1). Para convertir un número en una cadena de caracteres podemos
   usar String.valueOf(n).
 */
public class Ejercicio02 {

  public static void main(String[] args) {

    String palo = "";
    String carta = "";
    int numeroCarta = (int) (Math.random() * 13 + 1);
    int tipoPalo = (int) (Math.random() * 4 + 1);

    switch (numeroCarta) {

    case 11:
      carta = "J";
      break;

    case 12:
      carta = "Q";
      break;

    case 13:
      carta = "K";
      break;

    case 14:
      carta = "A";
      break;

    default:
      carta = String.valueOf(numeroCarta);

    }
    switch (tipoPalo) {
    case 1:
      palo = "picas";
      break;

    case 2:
      palo = "diamantes";
      break;

    case 3:
      palo = "corazones";
      break;

    case 4:
      palo = "treboles";
      break;

    default:
      palo = String.valueOf(tipoPalo);

    }
    System.out.println("La carta del palo " + palo + " con el valor " + carta);

  }

}
