package L1.Retangulo;
/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura */
import java.util.Scanner;

public class Calcular_Area {
    public static void main(String[] args) {
        int area, base, altura,perimetro;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Base e a Altura do Retângulo: ");
        base = scanner.nextInt();
        altura = scanner.nextInt();

        area = base * altura;
        perimetro = 2 * (altura * altura);

        System.out.println("A Area total do Retangulo é :\n" + area);
        System.out.println("O perimetro total do Retangulo é \n: " + perimetro);

        scanner.close();
    }
}
