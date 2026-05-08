package desafio11_gerenciador_contatos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainContato {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>(); // criado um array list com tamanho dinâmico;
        Scanner input = new Scanner(System.in); // instanciado o obj para interação
        System.out.println("Bem-vindo ao sistema de cadastro de contatos");
        System.out.println("Selecione uma das opções abaixo:");
        System.out.println("1 - Adicionar | 2 - Listar | 3 - Sair");
        int opcao = input.nextInt();

        do{
            input.nextLine();

            if (opcao == 1) {
                Contato novoContato = new Contato();

                // solicita o usuário o nome
                System.out.println("Digite o nome do novo contato: ");
                novoContato.setNome(input.nextLine());

                // solicita o usuário o número:
                System.out.println("Digite o número do novo contato: ");
                novoContato.setTelefone(input.nextLine());

                // adiciona o novo contato no array de contatos.
                contatos.add(novoContato);

                // feedback para o usuário
                System.out.println("Contato adicionado com sucesso!");
            } else if(opcao == 2) {
                if (contatos.isEmpty()) {
                    System.out.println("A agenda está vazia!");
                } else {
                    System.out.println("--- Lista de Contatos ---");
                    for (Contato c : contatos) {
                        System.out.println("Nome: " + c.getNome() + " | Tel: " + c.getTelefone());
                    }
                    System.out.println("-------------------------");
                    System.out.println("Total de contatos: " + contatos.size());
                }
            }
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Adicionar | 2 - Listar | 3 - Sair");
            opcao = input.nextInt();
        }
        while (opcao != 3);
        System.out.println("Programa encerrado!");
        input.close();
    }
}
