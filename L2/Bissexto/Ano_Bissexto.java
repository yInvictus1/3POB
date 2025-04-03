package L2.Bissexto;
/*Exercício 4: Verificação de Ano Bissexto

Descrição:
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
utilizando if-else.
Critérios para ser bissexto:
• Deve ser divisível por 4.
• Se for divisível por 100, deve também ser divisível por 400. */
import java.util.Scanner;

public class Ano_Bissexto {
    public static void main(String[] args) {
        int ano;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um Ano: ");
        ano = scanner.nextInt();

        if(ano%4==0){
            if(ano%100==0 && ano%400==0){
                System.out.println("O ano é Bissexto");
            }
        }
        else{
            System.out.println("Não é ano Bissexto");
        }

        scanner.close();
    }
}
