package L7.ex2;

import java.util.Scanner;

public class LeituraNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;

        while (i < 5) {
            try {
                System.out.print("Digite um número inteiro: ");
                numeros[i] = Integer.parseInt(scanner.nextLine());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
            }
        }

        System.out.println("Números digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
