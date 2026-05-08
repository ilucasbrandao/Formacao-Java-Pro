package desafio12_gestor_estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // instanciando o scanner
        ArrayList <Produto> listaDeProdutos = new ArrayList<>(); // criando um arraylist para produtos
        System.out.println("Bem-vindo ao sistema de controle de estoque");
        System.out.println("Selecione uma das opções abaixo:");
        System.out.println("1 - Adicionar | 2 - Listar | 3 - Remover | 0 - Sair");
        int opcao = input.nextInt();

        do{
            input.nextLine();
            if(opcao == 1) {
                System.out.println("Digite o nome do produto: ");

                String nomeDigitado = input.nextLine(); // armazenando o valor digitado para busca
                boolean existe = listaDeProdutos.stream().anyMatch(p -> p.getNome().equalsIgnoreCase(nomeDigitado)); // verificando se o nome digitado consta na lista de produtos

                // condicional para validar a inserção do produto
                if(existe){
                    System.out.println("Produto já consta na lista.");
                    return;
                }

                Produto newProduct = new Produto();
                newProduct.setNome(nomeDigitado); // setando o nome do produto
                System.out.println("Digite a quantidade de estoque inicial do produto: ");
                newProduct.setQuantidadeEstoque(input.nextInt()); // setando a quantidade do estoque

                listaDeProdutos.add(newProduct); // adicionando o produto na lista de produtos

                System.out.println("Produto "+ newProduct.getNome()+ " adicionado!");
            }

            if(opcao == 2) {
                if(listaDeProdutos.isEmpty()) {
                    System.out.println("Lista está vazia!");
                }
                System.out.println("--- Lista de Produtos ---");
                for (Produto p : listaDeProdutos) {
                    System.out.println("Produto: " + p.getNome() + " | Qtd Estoque: " + p.getQuantidadeEstoque());
                }
                System.out.println("---------------------------------");
                System.out.println("Quantidade de produtos: " + listaDeProdutos.size());
            }

            System.out.println("\n1 - Adicionar | 2 - Listar | 3 - Remover | 0 - Sair");
            opcao = input.nextInt();

        } while (opcao !=0);

    }
}
