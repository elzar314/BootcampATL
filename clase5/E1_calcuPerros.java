package clase5;

import java.util.Scanner;

public class E1_calcuPerros {
    public static void main(String[] args) {

        System.out.println("1) Calculadora de edad de perros");
        System.out.print("Llegó el momento de conocer los años perrunos de tu mascota, \npara ello ingresa su edad: ");
        int edadMascota;
        Scanner sc = new Scanner(System.in);
        edadMascota = sc.nextInt();
        System.out.println("Respuesta: Los años perrunos de tu mascota son "+(edadMascota*7)+".\n");
    }
}
