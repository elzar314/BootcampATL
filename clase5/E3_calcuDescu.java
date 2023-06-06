package clase5;

import java.util.Scanner;

public class E3_calcuDescu {
    public static void main(String[] args) {

        System.out.println("3) Calculadora de descuentos");
        System.out.print("Primero ingresa el precio de la prenda que vas a comprar: ");
        double precio;
        Scanner scan = new Scanner(System.in);
        precio = scan.nextDouble();

        System.out.print("Ahora ingresa el porcentaje de descuento a descontar: ");
        double descuento;
        Scanner scanner1 = new Scanner(System.in);
        descuento = scanner1.nextDouble();
        System.out.println("Respuesta: Tu descuento es " + (precio*(descuento/100))+" soles el monto que pagarás es "+(precio-(precio*(descuento/100)))+" soles.\n");

    }
}
