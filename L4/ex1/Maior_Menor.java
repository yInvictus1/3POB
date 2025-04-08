package L4.ex1;

import java.util.Scanner;

/*Exercício 1: Maior e Menor Valor em um Array
Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.
Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array. */
public class Maior_Menor {

    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número 1:");
        vetor[0] = scanner.nextInt();
        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("O maior número é: " + maior + " e o menor é: " + menor);

        scanner.close();
    }
}
