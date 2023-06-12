package clase7;
import java.util.Scanner;

public class E7_arrays {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        int [] numeros = new int[5];
        System.out.print("Para probar tus conocimientos en Arrays ingresa 5 números \n");

        for(int i= 0; i<5;i++){
            System.out.print("Ingresa el número " + (i+1)+": ");
            numeros[i]=Sc.nextInt();
        }

        System.out.print("Tus números ingresados son: ");
        for(int i= 0; i<5;i++){
            System.out.print(numeros[i]+" ");
        }

        int nMayor=numeros[0];
        int nMenor=numeros[0];


        for(int i= 0; i<5;i++){
            if(nMayor < numeros[i]){
                nMayor = numeros[i];
            }
        }

        for(int i= 0; i<5;i++){
            if(nMenor > numeros[i]){
                nMenor = numeros[i];
            }
        }

        System.out.println("\nDe todos estos, el número mayor es "+nMayor+" y el menor es "+nMenor);
        
        double promedio;
        double sumatoria=0;

        for(int i= 0; i<5;i++){
            sumatoria+= numeros[i];
        }

        promedio = sumatoria/numeros.length;

        System.out.println("Además el promedio de todos es "+promedio);


    }
}
