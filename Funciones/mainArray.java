package clasePrincipalArrays;

public class mainArray {

  public static void main(String[] args) {
  
    
    
   int [] n = Array.Arrays.generaArrayAleatorio(40,10, 20);
   
   
   Array.Arrays.muestraArray(n);
   
   System.out.println("El numero minimo es: " + Array.Arrays.minimoArrayInt(n));
   System.out.println("El numero maximo es: " + Array.Arrays.maximoArrayInt(n));
   System.out.println("La media es: " + Array.Arrays.mediaArrayInt(n));
    }
  }


