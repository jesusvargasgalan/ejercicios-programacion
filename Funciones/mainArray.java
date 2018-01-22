/*
  Jesus Vargas Galan 20-28
*/

package clasePrincipalArrays;

public class mainArray {

  public static void main(String[] args) {
  
    
    
   int [] n = Array.Arrays.generaArrayAleatorio(40,10, 20);
   
   
   Array.Arrays.muestraArray(n);
   
   System.out.println("El numero minimo es: " + Array.Arrays.minimoArrayInt(n));
   System.out.println("El numero maximo es: " + Array.Arrays.maximoArrayInt(n));
   System.out.println("La media es: " + Array.Arrays.mediaArrayInt(n));
   System.out.println("Se comprobará si el siguiente número (15) se encuentra en el array: " + Array.Arrays.estaEnArrayInt(n, 15));
   System.out.println("Se indicará en que posición se encuentra el número 20 en el array: " + Array.Arrays.posicionEnArray(n, 20));
   System.out.println("Se mostrará el array rotado");
   Array.Arrays.volteaArrayInt(n);
   System.out.println();
   System.out.println(Array.Arrays.rotaDerechaArrayInt(n, 20));
   System.out.println(Array.Arrays.rotaIzquierdaArrayInt(n, 5));
  
  }
  }


