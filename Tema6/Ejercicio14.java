
/*
 * Ejercicio14
 * 
 * Jesus Vargas Galan
 * 
 * El ordenador intenta adivinar tu numero
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int intentos = 5;
        int numeroIntroducido = 0;
        boolean acierto = false;
        int numero = 0;
        int maximo = 100;
        int minimo = 0;
        int mayorMenorIgual;

        System.out.println("Introduce un numero");
        numeroIntroducido = teclado.nextInt();
        teclado.nextLine();

        do {
            numero = (int) (Math.random() * (maximo - minimo) + minimo);
            System.out.println("¿Es el " + numero + "?");
            System.out.print("El numero es 1- Mayor 2- Menor 3-Igual");
            mayorMenorIgual = teclado.nextInt();
            teclado.nextLine();
            intentos--;

            if ((mayorMenorIgual == 1) && (intentos > 0))
                minimo = numero + 1;

            if ((mayorMenorIgual == 2) && (intentos > 0))
                maximo = numero - 1;

            if (mayorMenorIgual == 3) {
                acierto = true;
                System.out.println("Acierto");
            }
        } while (!acierto && (intentos > 0));

        if (!acierto) {
            System.out.println("Fracaso absoluto");
        }
    }
}