package L5.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soma_E_Calculo {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Insira números no ArrayList (digite -1 para finalizar):");

        // Loop para permitir inserções até o usuário digitar -1
        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        // Calcula a soma e a média dos números
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = numeros.isEmpty() ? 0 : soma / numeros.size();

        // Exibe os resultados
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
