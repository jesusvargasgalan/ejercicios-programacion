package clasePrincipal;

import java.util.Scanner;

public class clasePrincipal {
  
  

    public static void main(String[] args) {
      int numero = 0;
      int base = 0;
      int exponente = 0;
      Scanner teclado = new Scanner(System.in);
     
       /** System.out.println("Introduce un numero por teclado");
        numero = teclado.nextInt();
        teclado.nextLine();
        
        if(numeros.esPrimo.Primo(numero)){
          System.out.println("El " + numero + " es primo");
        }else{
          System.out.println("El " + numero + " no es primo"); 
        }*/
      
        System.out.println(numeros.funcionesMatematicas.calculoPotencia(2,2));
        
        System.out.println( "Su numero tiene " + numeros.funcionesMatematicas.digitos(1234) + " cifras");

        System.out.println("Le diremos si su numero se lee igual del reves " + numeros.funcionesMatematicas.esCapicua(123321));
        
        System.out.println(numeros.funcionesMatematicas.posicionDeDigito(1235678, 9));
        
    }

  }

  


