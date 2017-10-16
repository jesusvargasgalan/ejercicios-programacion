import java.util.Scanner;

/*  Ejercicio14	
 *  
 *  Jesus Vargas Galan
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 * 
 */

public class Ejercicio14
{

    public Ejercicio14()
    {
    }

    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = teclado.nextInt();
        int par = numero % 2;
        int divisible = numero % 5;
        if(par == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero no es par");
        if(divisible == 0)
            System.out.println("El numero es divisible de 5");
        else
            System.out.println("El numero no es divisible de 5");
    }
}
