package L3.Tabuada;

import java.util.Scanner;

/*Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração. */
public class CalcularTabuada {
    public static void main(String[] args) {
        int num,i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um Numero");
        num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ": \n");

        while(i<=10){
            int resul = num * i;
            System.out.println(num + " x " + i + " = " + resul);
            i++;
        }
        scanner.close();
}
}
