package L3.Nprimos;
/*Exercício 5: Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados. */

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário
        System.out.println("Digite o início do intervalo (número inteiro positivo): ");
        int inicio = scanner.nextInt();

        System.out.println("Digite o fim do intervalo (número inteiro positivo): ");
        int fim = scanner.nextInt();

        // Valida se os números são positivos
        if (inicio <= 0 || fim <= 0 || inicio > fim) {
            System.out.println("Intervalo inválido. Certifique-se de que os números são positivos e que o início é menor ou igual ao fim.");
        } else {
            System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

            // Loop externo para percorrer o intervalo
            for (int i = inicio; i <= fim; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
