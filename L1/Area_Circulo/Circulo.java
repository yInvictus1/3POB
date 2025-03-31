import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        // Declaração de variáveis
        double raio, area, pi = 3.14;
        
        // Criação do objeto Scanner para entrada de dados
        Scanner calculo = new Scanner(System.in);
        
        // Solicitação do raio ao usuário
        System.out.print("Digite o valor do raio do círculo: ");
        raio = calculo.nextDouble();
        
        // Cálculo da área do círculo
        area = pi * Math.pow(raio, 2);
        
        // Exibição do resultado
        System.out.println("A área do círculo é: " + area);
        
        // Fechamento do scanner
        calculo.close();
    }
}
