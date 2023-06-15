package clase8;

public class primerasFunciones {

    public static int areaRect(int n1, int n2){
        int area=n1*n2;
        imprimir("el area de tu rectangulo es " + area);
        return n2;
    }

    public static int areaTrian(int n1, int n2){
        int area=n1*n2;
        imprimir("el area de tu triangulo es " + area);
        return n2;
    }

    public static void imprimir(String imprimir){
        System.out.println(imprimir);
    }

    public static void main(String[] args) {

        areaRect(15,6);
        areaTrian(15,22);

    }


}
