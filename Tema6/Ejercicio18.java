/*
 * Ejercicio18
 * 
 * Jesus Vargas Galan
 * 
 * Generar dormitorios de colores diferentes
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        String nombreColor = "";
        int dormitorio1 = 0;
        int dormitorio2 = 0;
        int dormitorio3 = 0;

        System.out.println(
                "Se generaran diseños de cuartos hasta que se encuentre aquella que no tenga colores repetidos");
        System.out.println();

        while ((dormitorio1 == dormitorio2) || (dormitorio2 == dormitorio3) || (dormitorio1 == dormitorio3)) {

            for (int dormitorio = 0; dormitorio < 3; dormitorio++) {

                int color = (int) (Math.random() * 6);

                switch (color) {

                case 0:
                    nombreColor = "rojo";
                    break;
                case 1:
                    nombreColor = "azul";
                    break;
                case 2:
                    nombreColor = "verde";
                    break;
                case 3:
                    nombreColor = "amarillo";
                    break;
                case 4:
                    nombreColor = "violeta";
                    break;
                case 5:
                    nombreColor = "naranja";
                    break;
                default:
                    nombreColor = String.valueOf(color);
                }
                switch (dormitorio) {
                case 0:
                    dormitorio1 = color;
                    break;
                case 1:
                    dormitorio2 = color;
                    break;
                case 2:
                    dormitorio3 = color;
                    break;
                default:
                }
                System.out.println(nombreColor);

            }
            System.out.println();

        }

    }

}
