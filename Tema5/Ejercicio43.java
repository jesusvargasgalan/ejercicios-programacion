import java.util.Scanner;
public class Ejercicio43{

  public static void main (String args[]) {
    
    Scanner teclado = new Scanner(System.in);
    
    long numeroIntroducido = 0;
    long numeroInvertido = 0;
    int contador = 0;
    int numeroPartido;
    int numeroP;
    
    System.out.println("Introduce un numero el cual sera partido");
    numeroIntroducido = teclado.nextLong();
    teclado.nextLine();
    
    System.out.println("Introduce a partir de que posicion quieres partir el numero");
    numeroPartido = teclado.nextInt();
    
    long numero = numeroIntroducido;
    
    while(numero > 0){
      
      numeroInvertido = (numeroInvertido * 10) + (numero % 10);
      numero /= 10;
      contador++;
    }
    while (contador > 0) {
      numeroP = (int)(numeroInvertido % 10); 
      
    for(int f = 0; f < numeroP; f++){
      System.out.println(" - ");
    }
   

     
    }
  }
}
