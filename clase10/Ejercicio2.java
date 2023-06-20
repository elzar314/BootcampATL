package clase10;

public class Ejercicio2 {

    public static void main(String[] args) {

    cuenta cuenta1 = new cuenta("Pedro Suarez",250);

    cuenta1.mostrar();

    cuenta1.ingresarCantidad(450);
    cuenta1.retirarCantidad(950);

    cuenta1.mostrar();

    }
}
