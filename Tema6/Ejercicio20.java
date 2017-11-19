import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la capacidad de la cuba");
        int capacidad = teclado.nextInt();
        teclado.nextLine();
        
        int litros = (int)(Math.random() * capacidad);
       
        
        for(int f = 0; f < capacidad; f++){
            System.out.print("*====*");
            System.out.println();
        }
        
        System.out.print("******");

    }

}
