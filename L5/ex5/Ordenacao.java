package L5.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira números no ArrayList (digite -1 para finalizar):");

        // Loop para permitir inserções até o usuário digitar -1
        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        // Ordena os números em ordem crescente
        Collections.sort(numeros);

        // Exibe a lista ordenada
        System.out.println("\nLista ordenada em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
