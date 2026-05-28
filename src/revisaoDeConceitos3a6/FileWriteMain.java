package revisaoDeConceitos3a6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Diário de tarefas");
        System.out.println("Bem vindo ao nosso sistema");

        while (opcao != 3) {
            System.out.println("\n1 - Adicionar Frase");
            System.out.println("2 - Mostrar Diário");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                System.out.print("Adicione uma frase no seu diário: ");
                String tarefaParaAdicionar = input.nextLine();

                try {
                    FileWriter tarefas = new FileWriter("tarefas.txt", true);
                    tarefas.append(tarefaParaAdicionar + "\n");
                    tarefas.close();
                    System.out.println("Tarefa salva com sucesso!");
                } catch (IOException e) {
                    System.out.println("Erro crítico ao salvar a tarefa no HD: " + e.getMessage());
                }

            } else if (opcao == 2) {
                try {
                    File arquivo = new File("tarefas.txt");
                    Scanner leitor = new Scanner(arquivo);

                    System.out.println("\n--- CONTEÚDO DO DIÁRIO ---");
                    while (leitor.hasNextLine()) {
                        String linha = leitor.nextLine();
                        System.out.println(linha);
                    }
                    System.out.println("--------------------------");
                    leitor.close();

                } catch (FileNotFoundException e) {
                    System.out.println("[!] O diário ainda não existe. Adicione a primeira frase na opção 1!");
                }
            } else if (opcao == 3) {
                System.out.println("Sistema encerrado. Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        input.close();
    }
}