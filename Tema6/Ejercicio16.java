/*
 * Ejercicio16
 * 
 * Jesus Vargas Galan
 * 
 * Generar maquina tragaperra
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        String nombreFigura = "";
        int aux = 0;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;

        for (int f = 0; f < 3; f++) {
            int figura = (int) (Math.random() * 5);
            switch (figura) {
            case 0:
                nombreFigura = "corazon";
                break;
            case 1:
                nombreFigura = "diamante";
                break;
            case 2:
                nombreFigura = "herradura";
                break;
            case 3:
                nombreFigura = "campana";
                break;
            case 4:
                nombreFigura = "limon";
                break;
            default:
                nombreFigura = String.valueOf(figura);

            }
            switch (f) {
            case 0:
                figura1 = figura;
                break;
            case 1:
                figura2 = figura;
                break;
            case 2:
                figura3 = figura;
                break;
            default:

            }
            System.out.print(nombreFigura + " ");
            System.out.println();

        }
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.println("Ha perdido su moneda");
        } else if (figura1 == figura2 && figura2 == figura3) {
            System.out.println("Has ganado 10 monedas");
        } else {
            System.out.println("Has recuperado tu moneda");

        }

    }
}
