package L1.Salario_Bruto;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        double Salario, Inss, total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe O seu Salario Bruto e o Desconto do INSS");
        Salario = scanner.nextDouble();
        Inss = scanner.nextDouble();

        total = Salario- Inss;

        System.out.println("Seu Salário Líquido é de :" + total);

        scanner.close();


    }
}
