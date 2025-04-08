package L4.ex3;

/*Exercício 3: Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.
Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa. */
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < vetor.length; i++){
            System.out.println("Informe um Numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Numeros em ordem inversa:");

        for(int i = vetor.length-1 ; i>=0; i--){
            System.out.println(vetor[i]);
        }
        scanner.close();
    }
}
