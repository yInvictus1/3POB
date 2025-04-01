package L1.Esfera;

/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159. */

import java.util.Scanner;

public class Calcular_esfera {
    public static void main(String[] args) {
        double PI = 3.14;
        double formula, raio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio da Esfera: ");
        raio = scanner.nextDouble();

        formula=(4/3)*PI*(raio*raio*raio);

        System.out.println("A area total da Esfera é de : " + formula);

        scanner.close();
    }

}
