package L2.Calculadora;

/*Exercício 3: Calculadora Simples com switch-case
Descrição:
Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.
Requisitos:
• O programa deve solicitar dois números e a operação desejada.
• Deve usar switch-case para executar a operação correspondente.
• Caso a operação não seja válida, exibir "Operação inválida.".
• Se a operação for divisão (/), verificar se o segundo número é zero antes de
calcular. */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1, num2, formula;
        String opcao = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois Numeros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Escolha uma opcão para conta (+, -, *, /) ");
        opcao = scanner.next();

        switch (opcao) {
            case "+":
                formula = num1 + num2;
                System.out.println("Resultado é: " + formula);
                break;
            case "-":
                formula = num1 - num2;
                System.out.println("Resultado é: " + formula);
                break;

            case "/":
                formula = num1 / num2;
                System.out.println("Resultado é: " + formula);

                break;
            case "*":
                formula = num1 * num2;
                System.out.println("Resultado é: " + formula);

                break;

            default:

                System.out.println("Opção Invalida");
                break;
        }
        scanner.close();

    }
}
