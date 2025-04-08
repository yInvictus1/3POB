package L3.SomarN;

import java.util.Scanner;

/*Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total. */
public class Somar_Numeros {
    public static void main(String[] args) {
        int num, i,soma=0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha um Numero");
            num = scanner.nextInt();

            for(i=1;i<=num;i++){
                soma+=i;
            }

            System.out.println("A soma total foi : " + soma);
        }
    }
}
