package L3.Media;
/*Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma. */

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de alunos na turma
        System.out.println("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        // Valida se a quantidade de alunos é maior que zero
        if (quantidadeAlunos <= 0) {
            System.out.println("A quantidade de alunos deve ser maior que zero.");
        } else {
            double somaNotas = 0;

            // Loop para receber as notas de cada aluno
            for (int i = 1; i <= quantidadeAlunos; i++) {
                System.out.println("Digite a nota do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota; // Acumula as notas
            }

            // Calcula a média da turma
            double media = somaNotas / quantidadeAlunos;

            // Exibe a média da turma
            System.out.println("A média da turma é: " + media);
        }

        scanner.close();
    }
}
