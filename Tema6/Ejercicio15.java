/*
 * Ejercicio15
 * 
 * Jesus Vargas Galan
 * 
 * Generar melodia ,tiene que coincidir la primera nota con la ultima y tener || en las ultimass 4 notas
 */

public class Ejercicio15 {

    public static void main(String[] args) {

        int melodia = 4 * (int) (Math.random() * 7);
        String nombreNota = "";
        int primeraNota = 0;

        for (int f = 1; f <= melodia; f++) {

            int nota = (int) (Math.random() * 6 + 1);
            switch (nota) {

            case 1:
                nombreNota = "do";
                break;
            case 2:
                nombreNota = "re";
                break;
            case 3:
                nombreNota = "mi";
                break;
            case 4:
                nombreNota = "fa";
                break;
            case 5:
                nombreNota = "sol";
                break;
            case 6:
                nombreNota = "la";
                break;
            case 7:
                nombreNota = "si";
                break;

            default:
                nombreNota = String.valueOf(nota);

            }

            if (f == 1) {
                primeraNota = melodia;
            }

            else if (f == melodia) {
                melodia = primeraNota;
            }

            System.out.print(nombreNota + " ");

            if (f == melodia) {
                System.out.print("||");
            } else if (f % 4 == 0) {
                System.out.print("| ");
            }

        } // for
    }

}
