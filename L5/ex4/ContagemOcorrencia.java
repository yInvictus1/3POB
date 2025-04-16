package L5.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrencia {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir 10 números inteiros
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        // Solicita o número a ser contado
        System.out.print("\nDigite um número para verificar sua ocorrência: ");
        int numeroParaContar = scanner.nextInt();

        // Conta as ocorrências do número na lista
        int ocorrencias = 0;
        for (int numero : numeros) {
            if (numero == numeroParaContar) {
                ocorrencias++;
            }
        }

        // Exibe o resultado
        System.out.println("\nO número " + numeroParaContar + " aparece " + ocorrencias + " vez(es) na lista.");

        scanner.close();
    }
}
