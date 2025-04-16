package L5.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Adicionar_E_Exibir {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        System.out.println("Bem-vindo! Insira números no ArrayList. Digite 'sair' para parar.");

        // Loop para permitir múltiplas inserções
        do {
            System.out.print("Digite um número (ou 'sair' para finalizar): ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                numeros.add(numero);
            } else {
                continuar = scanner.next();
                if (continuar.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro ou 'sair'.");
                }
            }
        } while (true);

        // Exibe os números armazenados no ArrayList
        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
