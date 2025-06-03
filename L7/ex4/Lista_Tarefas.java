package L7.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista_Tarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a tarefa: ");
                        tarefas.add(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Digite o índice da tarefa a remover: ");
                        int indice = Integer.parseInt(scanner.nextLine());
                        tarefas.remove(indice);
                        break;
                    case 3:
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i));
                        }
                        break;
                    case 4:
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Erro: Entrada inválida.");
            }
        }
        scanner.close();
    }
}
