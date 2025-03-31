import java.util.Scanner;

public class SomarNumeros {

    public static void main(String[] args) {
        Scanner Resultado = new Scanner(System.in);
        int numero1, numero2, soma;
        System.out.println("Digite o primeiro número: ");
        numero1 = Resultado.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = Resultado.nextInt();
        soma= numero1 + numero2;
        System.out.println("A soma dos números " + numero1 + " + " + numero2 + " é: "   + soma);
        Resultado.close();
    }
}
