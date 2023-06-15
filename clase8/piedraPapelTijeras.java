package clase8;

import java.util.Scanner;

public class piedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] opciones = { "piedra", "papel", "tijeras" };

        System.out.println("Bienvenido al juego de Piedra, Papel y Tijeras!");

        boolean jugarDeNuevo = true;
        while (jugarDeNuevo) {
            System.out.print("Elige tu opción (piedra, papel, tijeras): ");
            String eleccionJugador = scanner.nextLine().toLowerCase();

            if (!esValida(eleccionJugador, opciones)) {
                System.out.println("¡Opción inválida! Inténtalo de nuevo.");
                continue;
            }

            String eleccionComputadora = opciones[(int) (Math.random() * opciones.length)];

            System.out.println("Jugador: " + eleccionJugador);
            System.out.println("Computadora: " + eleccionComputadora);

            if (eleccionJugador.equals(eleccionComputadora)) {
                System.out.println("Empate!");
            } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijeras"))
                    || (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra"))
                    || (eleccionJugador.equals("tijeras") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            jugarDeNuevo = respuesta.equals("s");
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }

    public static boolean esValida(String opcion, String[] opciones) {
        for (String o : opciones) {
            if (o.equals(opcion)) {
                return true;
            }
        }
        return false;
    }
}
