/*Descrição:
Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados.
Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList. */

import java.util.ArrayList;
import java.util.Scanner;

public class Adicionar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int resposta ;
        do{
            System.out.println("Digite um Numero:");
            resposta = scanner.nextInt();
            if(resposta == 0){
                System.out.println("Programa Encerrado!!");
            }
            else{
                numeros.add(resposta);
            }
        }while(resposta!=0);
        
        System.out.println("Numeros Inseridos com sucesso!!!");
        System.out.println("Numeros inseridos abaixo: ");
        System.out.println(numeros);
        scanner.close();
    }
}
