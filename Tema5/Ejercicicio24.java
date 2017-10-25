

import java.util.Scanner;

public class Ejercicicio24 {

  public static void main(String[] args) {
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce un numero por teclado");
    int numero = teclado.nextInt();
 do {   
   
    int digito = numero % 10;
    numero /= 10;    
    int numeroInverso  = 0 ;
    numeroInverso = numeroInverso * 10 + digito;
    
    
    
    System.out.print(numeroInverso);
      
      
    
    

  }while(numero > 0);

}
}
