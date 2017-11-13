/* Ejercicio02
 * 
 * Jesus Vargas Galan
 * 
 * gual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
   de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    int numeroCarta = (int)(Math.random() * 10 + 1);
    int tipoPalo = (int)(Math.random() * 4 + 1);
  
    
    switch(numeroCarta){
    case 1:
    carta = "As";
    break;
    
    case 8:
    carta = "Sota";
    break;
    
    case 9:
    carta = "Caballo";
    break;
    
    case 10:
    carta = "Rey";
    break;
    
    
    default:
      carta = String.valueOf(numeroCarta);
    
    }
    switch (tipoPalo){
    case 1:
    palo = "basto";
    break;
    
    case 2:
    palo = "oro";
    break;
      
    case 3:
    palo = "copas";
    break;
      
    case 4:
    palo = "espadas";
    break;
    
    default:
    palo = String.valueOf(tipoPalo);
    
    }
    System.out.println(carta + " de " + palo );
    
    

  }

}
