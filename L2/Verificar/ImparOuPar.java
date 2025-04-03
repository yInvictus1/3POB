package L2.Verificar;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        num = scanner.nextInt();

        if(num%2==0){
            System.err.println("Numero é par");
        }
        else{
            System.out.println("Numero é Ímpar");
        }

        scanner.close();
    }
}
