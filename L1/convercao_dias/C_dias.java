package L1.convercao_dias;

/*5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias. */
import java.util.Scanner;

public class C_dias {
    public static void main(String[] args) {
        int ano,resul;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Ano que Você nasceu: ");
        ano = scanner.nextInt();
        resul = (2025 - ano) *365;

        System.out.println("Você viveu " + resul + " Dias");
        scanner.close();
    }
}
