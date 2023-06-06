package clase5;

import java.util.Scanner;

public class E2_converMillas {
    public static void main(String[] args) {

        System.out.println("2) Conversor de millas a kilometros");
        System.out.print("Ingresa una distancia en millas y te la devuelvo en kilometros: ");
        double millas;
        Scanner scanner = new Scanner(System.in);
        millas = scanner.nextDouble();
        System.out.println("Respuesta: " + millas+" millas, son "+(millas*1.60934)+" kilometros.\n");
    }
}
