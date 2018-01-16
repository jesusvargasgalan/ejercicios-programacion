package Array;

public class Arrays {
 
  public static void muestraArray(int f []){
    
    for (int x : f){
      System.out.print(x + " ");
    }
    System.out.println();
  }
  
  public static int [] generaArrayAleatorio(int max,int min,int x ){
    int f = 0;
    int [] n = new int [x];
    for(f = 0; f < n.length; f++){
      n[f] = (int)(Math.random() * (max - min + 1 ) + min);
      
      
    }
    return n;

}
  public static int  minimoArrayInt(int n []){
    int minimo = Integer.MAX_VALUE;
  
    for (int f : n){
      if(f < minimo){
        minimo = f;
      }
    }
    return minimo;
      
    }
  public static int maximoArrayInt(int n []){
    int maximo = Integer.MIN_VALUE;
    
    for(int f : n){
      if(f > maximo){
        maximo = f;
      }
    }
    return maximo;
  }
  public static int mediaArrayInt(int n []){
    int contador = 0;
    int media = 0;
    int suma = 0;
    for(int f : n){
      suma += f;
      contador++;
    }
    
    media = suma / contador;
    return media;
  }
 }

