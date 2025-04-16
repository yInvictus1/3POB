package L5.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir 5 nomes
        System.out.println("Insira 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        // Exibe a lista de nomes
        System.out.println("\nLista de nomes: " + nomes);

        // Solicita o nome a ser removido
        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        // Verifica se o nome existe na lista e remove
        if (nomes.remove(nomeParaRemover)) {
            System.out.println("\nO nome '" + nomeParaRemover + "' foi removido com sucesso.");
        } else {
            System.out.println("\nO nome '" + nomeParaRemover + "' não foi encontrado na lista.");
        }

        // Exibe a lista após a remoção
        System.out.println("\nLista atualizada: " + nomes);

        scanner.close();
    }
}
