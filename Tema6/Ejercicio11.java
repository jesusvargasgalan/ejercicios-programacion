/*
 * Ejercicio11.java
 * 
 * Jesus Vargas Galan
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
   aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
   final aparecerá el número de suspensos, el número de suficientes, el número
   de bienes, etc.
 * 
 * 
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    String nota = "";
    int suspenso = 0;
    int insuficiente = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    
    for(int f = 0; f <= 20; f++){
      int puntuacion = (int)(Math.random()*11);
      
      switch(puntuacion){
      case 0:
      nota = "suspenso";
        break;
      case 1:
        nota = "suspenso";
        break;
      case 2:
      nota = "suspenso";
      break;
      case 3:
      nota = "suspenso";
      break;
      case 4:
      nota = "insuficiente";
      break;
      case 5:
      nota = "suficiente";
      break;
      case 6:
      nota = "bien";
      break;
      case 7:
      nota = "notable";
      break;
      case 8:
      nota = "notable";
      break;
      case 9:
      nota = "sobresaliente";
      break;
      case 10:
      nota = "sobresaliente";
      break;
      default:
        nota = String.valueOf(puntuacion);
      
    }
      if(puntuacion < 4){
        suspenso++;
      }else if(puntuacion == 4){
        insuficiente++;
      }else if(puntuacion == 5){
        suficiente++;
      }else if((puntuacion > 5) && (puntuacion < 7)){
        bien++;
      }else if((puntuacion > 7 ) && (puntuacion <9)){
        notable++;
      } else if (puntuacion >= 9){
        sobresaliente++;
      }
      System.out.println("Las notas son las siguientes " + nota);
      
      
    }
    System.out.println("---------------------------");
    System.out.println("Hay " + suspenso + " suspensos");
    System.out.println("Hay " + insuficiente + " insuficientes");
    System.out.println("Hay " + suficiente + " suficiente");
    System.out.println("Hay " + bien + " bien");
    System.out.println("Hay " + notable + " notable");
    System.out.println("Hay " + sobresaliente + " sobresalientes");

  }

}
