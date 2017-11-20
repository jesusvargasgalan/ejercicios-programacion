
public class Ejercicio23 {

  public static void main(String[] args) {

    String figura = "";

    for (int f = 0; f < 5; f++) {
      int cara = (int) (Math.random() * 5);

      switch (cara) {
      case 0:
        figura = "Q";
        break;
      case 1:
        figura = "AS";
        break;
      case 2:
        figura = "K";
        break;
      case 3:
        figura = "7";
        break;
      case 4:
        figura = "8";
        break;
      default:
        figura = String.valueOf(cara);

      }
      System.out.print(figura + " ");
    }

  }

}
