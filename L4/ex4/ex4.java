package L4.ex4;
/*Exercício 4: Contagem de Números Pares em um Array

Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array.
Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são
pares.
• Exibir a quantidade de números pares encontrados. */
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        for(int i = 0 ; i < vetor.length; i++){
            System.out.println("Informe um Numero: ");
            vetor[i] = scanner.nextInt();
            if(vetor[i]%2==0){
                cont++;
            }
        }
        for(int i = 0 ; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("Total de Numeros pares: " + cont);

        scanner.close();
    }
}
