 /*
  * Ejercicio05
  * 
  * Jesus Vargas Galan
  * 
  * 
  */
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
        int  [] numeros = new int [10];
        int maximo = 0;
        int minimo = 0;
        int f = 0;
        for(f = 0; f < numeros.length; f++){
        System.out.println("Introduce un numero");
        numeros[f] = teclado.nextInt();
        teclado.nextLine();
        
         maximo = numeros[0];
         minimo = numeros[0];
        
        if(numeros[f] > maximo){
            maximo = numeros[f];
          
        }
        if(numeros[f] < minimo){
            minimo = numeros[f];
         
        }
        
        
        }
     
        
     System.out.println();
        
        for(f = 0; f < numeros.length; f++){
            System.out.println(numeros[f]);
            
            if(numeros[f] == maximo){
                System.out.print(" maximo");
            }
            if(numeros[f] == minimo){
                System.out.print( "minimo");
            }
           
       System.out.println();
        
        }
        
        

    }
    

}
