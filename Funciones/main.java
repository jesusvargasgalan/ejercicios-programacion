/*
 * Jesus Vargas
 * Falta corregir un par de numeros
 */

package claseprincipal;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
    int numero = 0;
    System.out.println("�Qu� deseas hacer?");
    System.out.println("0� - Salir");
    System.out.println("1� - Saber si el numero es capicua");
    System.out.println("2� - Saber si el numero es primo");
    System.out.println("3� - Siguiente primo");
    System.out.println("4� - Potencia");
    System.out.println("5� - Contar el numero de digitos");
    System.out.println("6� - Darle la vuelta a un numero");
    System.out.println("7� - Saber que posicion ocupa un numero introducido");
    System.out.println("8� - Primera ocurrencia de un numero introducido");
    System.out.println("9� - Quitar numero por detras");
    System.out.println("10� - Quitar numero por delante");
    System.out.println("11� - A�adir numeros por detras");
    System.out.println("12� - A�adir numeros por delante");
    System.out.println("13� - Trozo de un numero");
    System.out.println("14� - Juntar numeros");

    opcion = teclado.nextInt();
    teclado.nextLine();

    switch (opcion) {
    case 1:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.esCapicua(numero));
      break;
    case 2:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.esPrimo(numero));
      break;
    case 3:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.siguientePrimo(numero));
      break;
    case 4:
      int exp = 0;
      System.out.println("Introduzca la base");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Introduzca el exponente");
      exp = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.potencia(numero, exp));
      break;
    case 5:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      System.out.println(funciones.funcionesMatematicas.digitos(numero));
      break;
    case 6:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.voltea(numero));
      break;
    case 7:
      System.out.println("Este es el numero 987650431");
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.digitoN(987650431, numero));
      break;
    case 8:
      System.out.println("Este es el numero 7869423");
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.posicionDeDigito(7869423, numero));
      break;
    case 9:
      System.out.println("Este es el numero 56789542");
      System.out.println("Introduzca cuantos numeros quieres borrar");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.quitaPorDetras(56789542, numero));
      break;
    case 10:
      System.out.println("Este es el numero 870445672");
      System.out.println("A partir de que posicion quieres borrar");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.quitaPorDelante(870445672, numero));
      break;
    case 11:
      System.out.println("Este es el numero 143");
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.pegaPorDetras(143, numero));
      break;
    case 12:
      System.out.println("Este es el numero 065");
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.pegaPorDelante(065, 4));
    case 13:
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.trozoDeNumero(7, 2, numero));
      break;
    case 14:
      int numero1 = 0;
      System.out.println("Introduzca numero");
      numero = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Introduzca otro numero");
      numero1 = teclado.nextInt();
      teclado.nextLine();
      System.out.println(funciones.funcionesMatematicas.juntaNumeros(numero, numero1));
      break;
    default:
    }

  }

}
