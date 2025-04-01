package L1.media;

import java.util.Scanner;
public class Calcular_media {
    public static void main(String[] args) {
        double n1,n2,n3,media;

        Scanner Calculo = new Scanner(System.in);

        System.out.println("Informe 3 Notas:");
        n1=Calculo.nextDouble();
        n2=Calculo.nextDouble();
        n3=Calculo.nextDouble();

        media=(n1+n2+n3)/3;

        System.out.println("A média final é: " + media);

        Calculo.close();
    }
}
