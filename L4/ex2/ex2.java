package L4.ex2;

import java.util.Scanner;

/* Exercício 2: Cálculo da Média de Notas
Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.
Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
"Reprovado".*/
public class ex2 {
    public static void main(String[] args) {
        double[] vetor = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media,total=0;

        for(int i = 0;i < vetor.length;i++){
            System.out.println("Informe A sua Nota do " + (i+1) + " Bimestre: ");
            vetor[i] = scanner.nextInt();
            total+=vetor[i];
        }

        media=total/4;

        System.out.println("A Sua média é : " + media);

        scanner.close();
    }
}
