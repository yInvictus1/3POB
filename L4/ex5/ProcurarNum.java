package L4.ex5;

/*Exercício 5: Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.
Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado." */
import java.util.Scanner;

public class ProcurarNum {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num,achou = 0;
        for(int i = 0 ; i < vetor.length; i++){
            System.out.println("Informe um Numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Escolha um numero para procurar no array:");
        num = scanner.nextInt();

        for(int i = 0 ; i < vetor.length && achou==0; i++){
            if(vetor[i]==num){
                System.out.println("Numero Encontrado na posição " + i);
                achou=1;
            }
        }
        if(achou == 1){
            System.out.println("Numero não esta no Array");
        }


        scanner.close();
    }
}
