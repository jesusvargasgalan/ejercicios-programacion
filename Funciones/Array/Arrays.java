package Array;

public class Arrays {
 /**
  * Muestra el array
  * @param Array unidimensional de numeros enteros
  */
  public static void muestraArray(int f []){
      
      for (int x : f){
        System.out.print(x + " ");
      }
      System.out.println();
    }
    
  /**
   *  Genera un array aleatorio entre un intervalo dado el número máximo y el mínimo
   * @param max Hasta que número como máximo llegará el array
   * @param min Hasta que número como mínimo llegará el array
   * @param x Número de elementos que tendrá el array
   * @return Array relleno con valores aleatorios dentro del intervalo dado por <code>max </code>
   * y <code>min</code>
   */
    public static int [] generaArrayAleatorio(int max,int min,int x ){
      int f = 0;
      int [] n = new int [x];
      for(f = 0; f < n.length; f++){
        n[f] = (int)(Math.random() * (max - min + 1 ) + min);
        
        
      }
      return n;

  }
    /**
     * Nos dice el el valor del menor número  que hay en nuestro array 
     * @param n Array unidimensional de números enteros 
     * @return Nos devuelve el número más pequeño encontrado en el array
     */
    public static int  minimoArrayInt(int n []){
      int minimo = Integer.MAX_VALUE;
    
      for (int f : n){
        if(f < minimo){
          minimo = f;
        }
      }
      return minimo;
        
      }
    /**
     * Nos dice el el valor del mayor número  que hay en nuestro array 
     * @param n Array unidimensional de números enteros 
     * @return Nos devuelve el número más grande encontrado en el array
     */
    
    public static int maximoArrayInt(int n []){
      int maximo = Integer.MIN_VALUE;
      
      for(int f : n){
        if(f > maximo){
          maximo = f;
        }
      }
      return maximo;
    }
    /**
     * Suma todos los valores presentes en el array y realiza una media de ellos
     * @param n Array unidimensional donde se encuentran los valores
     * @return Devuelve el valor medio del array 
     */
    public static double mediaArrayInt(int n []){
      double contador = 0;
      double media = 0;
      double suma = 0;
      for(int f : n){
        suma += f;
        contador++;
      }
      
      media = suma / contador;
      return media;
    }
    /**
     * Nos dice si un numero se encuentra en el array o no
     * @param n Es el array unidimensional que contiene los números
     * @param x Es el número que queremos buscar dentro del array 
     * @return verdadero si el número dado <code> x </code> se encuentra en el array <code>n </code> o false en el caso contrario
     */
    public static boolean estaEnArrayInt(int n[],int x) {
      
      for (int f : n) {
      if( f == x) {
        
        return true;
        
      }
      }
        return false;
      }  
    /**
     * Introducimos un número y nos dice en que posición se encuentra dentro del array
     * @param n Un array unidimensional de números enteros
     * @param x El número que queremos descubrir en la posición en la que se encuentrar
     * @return Nos devuelve la posición de <code> x </code> si se encuentra en <code>n</code>,si este no se encontrara nos devolvería 
     * - 1
     */
    public static int posicionEnArray(int n[],int x) {
      int pos = 0;
      for(int f = 0; f < n.length; f++) {
        if(n[f] == x) {
          return f;
          
        
       }
      }
      return -1;
    }
    
    /**
     * Voltea el array unidimensional
     * @param n Array unidimensional de numeros enteros
     */
    public static void volteaArrayInt(int n[]){
      for(int f = n.length -1 ; f >= 0; f--){
      
        System.out.print(n[f] + " ");
      }
    
    
  }
    /**
     * Rota nuestro array <code> n </code> a la derecha el número de veces que se le haya indicado como parámetro
     * @param n Array unidimensional de números enteros
     * @param x número de rotaciones a la derecha a realizar
     * @return array rotado <code>n</code>
     */
    public static int [] rotaDerechaArrayInt(int n [],int x){
      int[] a = n.clone(); 
      int i;
      int aux = 0;
      
      while (x-- > 0) {
        aux = a[a.length - 1];
        for(i = a.length - 1; i > 0; i--) {
          a[i] = a[i - 1];
       
        }
        a[0] = aux;
        
      }
        
        
      return (int [])a;
    }
    /**
     * Rota nuestro array <code>n</code> a la izquierda el número de veces que se le haya indicado como parámetro
     * @param n Array unidimensional de números enteros
     * @param x número de rotaciones a la izquierda a realizar
     * @return array rotado a la izquierda <code>n</code>
     */
    public static int [] rotaIzquierdaArrayInt(int n [] , int x){
      int [] a = n.clone();
      int i;
      int aux = 0;
      
      while(x-- > 0){
        aux = a[0];
        for(i = 0; i < a.length - 1; i++){
          a[i] = a[i + 1];
          
        }
        a[a.length - 1] = aux;
      }
      return a;
    }
  }
    
    
   



