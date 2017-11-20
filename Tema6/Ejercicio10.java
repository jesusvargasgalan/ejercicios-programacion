/*
 * Ejercicio10.java
 * 
 * Jesus Vargas Galan
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
   El carácter con el que se pinta cada línea se elige de forma aleatoria
   entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
   aleatoria entre 1 y 40 caracteres.
 * 
 * 
 * 
 * 
 */
public class Ejercicio10 {

  public static void main(String[] args) {

    String simboloCaracter = "";

    for (int f = 0; f < 10; f++) {
      System.out.println();
      int linea = (int) (Math.random() * 41);
      for (int i = 0; i <= linea; i++) {
        int caracter = (int) (Math.random() * 6);

        System.out.print(simboloCaracter);

        switch (caracter) {
        case 0:
          simboloCaracter = "*";
          break;
        case 1:
          simboloCaracter = "-";
          break;
        case 2:
          simboloCaracter = "=";
          break;
        case 3:
          simboloCaracter = ".";
          break;
        case 4:
          simboloCaracter = "|";
          break;
        case 5:
          simboloCaracter = "@";
          break;

        default:
          simboloCaracter = String.valueOf(caracter);

        }

      }
    }

  }

}
