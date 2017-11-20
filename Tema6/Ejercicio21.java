/*
 * Ejercicio21.java
 * 
 * Jesus Vargas Galan
 * 
 * Una moneda tiene el valor de 1,5,10,20 o 50 centimos y 1 o 2 euros y puede salir cara o cruz
 * Hacerlo en un bucle de 5
 * 
 */
public class Ejercicio21 {

  public static void main(String[] args) {

    String valorMoneda = "";
    String nombreLado = "";

    for (int f = 0; f < 5; f++) {
      int valor = (int) (Math.random() * 8);
      int lado = (int) (Math.random() * 2);

      switch (valor) {
      case 0:
        valorMoneda = "1 centimo";
        break;
      case 1:
        valorMoneda = "2 centimos";
        break;
      case 2:
        valorMoneda = "5 centimos";
        break;
      case 3:
        valorMoneda = "10 centimos";
        break;
      case 4:
        valorMoneda = "20 centimos";
        break;
      case 5:
        valorMoneda = "50 centimos";
        break;
      case 6:
        valorMoneda = "1 euro";
        break;
      case 7:
        valorMoneda = "2 euros";
        break;
      default:
        valorMoneda = String.valueOf(valor);

      }
      switch (lado) {
      case 0:
        nombreLado = "cara";
        break;
      case 1:
        nombreLado = "cruz";
        break;
      default:
        nombreLado = String.valueOf(lado);
      }
      System.out.println("Ha salido la moneda de " + valorMoneda + " - " + nombreLado);
    }

  }

}
