package L2.ClassIdade;
/*Exercício 2: Classificação de Idade
Descrição:
Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:
• Menor de idade (menos de 18 anos)
• Adulto (entre 18 e 60 anos)
• Idoso (mais de 60 anos) */
import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua Idade: ");
        idade = scanner.nextInt();

        if(idade<18){
            System.out.println("Adolescente");
        }
        else if(idade<=60){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }

        scanner.close();
    }

}
