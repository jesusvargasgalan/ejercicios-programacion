/*  
 * 
 * Ejercicio19
 * 
 * Jesus Vargas Galan
 * 
 * Aleatorizar 50 numeros del -100 a 200 y sacar maximo de los pares y minimos de los impares
 * 
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        int maximo = 0;
        int minimo = 0;
        int sumaNumeros = 0;
        double media = 0;

        for (int f = 0; f < 50; f++) {
            int numeros = (int) (Math.random() * 301) - 100;
            System.out.print(numeros + " ");

            sumaNumeros += numeros;

            if ((numeros % 2 == 0) && (numeros > maximo)) {
                maximo = numeros;
            }
            if ((numeros % 2 != 0) && (numeros < minimo)) {
                minimo = numeros;

            }
            media = sumaNumeros / 50.0;

        }

        System.out.println();
        System.out.println("El numero mas grande de los pares es " + maximo);
        System.out.println("El numero menor de los impares es " + minimo);
        System.out.println("La media de todos los numeros es " + media);
    }

}
