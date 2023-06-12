package clase5;

import java.util.Scanner;

public class E5_juegoAdivina {
    public static void main(String[] args) {

        System.out.println("5) Juego de adivinar el número");
        int adivinador =((int) (Math.random()*100));
        boolean encontrado=false;

        System.out.print("Ingresa un número entre 1 y 100 y verifica si adivinaste: ");
        int numero;
        Scanner scanner3 = new Scanner(System.in);
        numero = scanner3.nextInt();

        if(numero==adivinador){
            System.out.print("¡Felicidades acertaste! el número elegido era "+adivinador);
        }
        else{
            while(!encontrado){
                if(numero==adivinador){
                    System.out.print("¡Ahora si lo conseguiste felicidades! el numero es "+adivinador);
                    encontrado = true;
                }
                if(numero>adivinador){
                    System.out.print("Ahora intenta con un número menor: ");
                    Scanner Scan4 = new Scanner(System.in);
                    numero = Scan4.nextInt();
                }
                if(numero<adivinador){
                    System.out.print("Ahora intenta con un número mayor: ");
                    Scanner Scan4 = new Scanner(System.in);
                    numero = Scan4.nextInt();
                }

            }


        }

    }
}
