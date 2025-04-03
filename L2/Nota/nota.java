package L2.Nota;
/*Exercício 5: Conversão de Notas para Conceito
Descrição:
Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case.
Tabela de Conceitos:
• 9 a 10 → A
• 7 a 8 → B
• 5 a 6 → C
• 3 a 4 → D
• 0 a 2 → E
Requisitos:
• Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.". */

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Sua Nota: ");
        nota = scanner.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Conceito: E");
                break;
            case 3:
            case 4:
                System.out.println("Conceito: D");
                break;
            case 5:
            case 6:
                System.out.println("Conceito: C");
                break;
            case 7:
            case 8:
                System.out.println("Conceito: B");
            case 9:
            case 10:
                System.out.println("Conceito: A");
                break;

            default:
            System.out.println("Nota Invalida");
                break;
        }
        scanner.close();
    }

}
