package L1.Dolar;

import java.util.Scanner;

public class Convercao_Moeda {

    public static void main(String[] args) {
        double dolar = 5.70;
        double dinheiroReal,total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe Uma quantia de Dinheiro em Real");
        dinheiroReal = scanner.nextDouble();

        total = dinheiroReal * dolar;

        System.out.println("Dinheiro Convertido: " + total);

        scanner.close();
    }
}
