package clase5;

import java.util.Scanner;

public class E4_calcuPropi {
    public static void main(String[] args) {

        System.out.println("4) Calculadora de propinas");
        System.out.print("Primero ingresa el total de la cuenta del restaurante: ");
        double cuenta;
        Scanner scan1 = new Scanner(System.in);
        cuenta = scan1.nextDouble();

        System.out.print("Ahora ingresa el porcentaje de propina que deseas dar: ");
        double propina;
        Scanner scanner2 = new Scanner(System.in);
        propina = scanner2.nextDouble();
        System.out.println("Respuesta: Tu propina es " + (cuenta*(propina/100))+" soles.\n");
    }
}
