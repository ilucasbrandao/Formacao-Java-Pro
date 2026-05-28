/*📝 Desafio 14: O Diário de Bordo (Escrita em Arquivo)
Foco: Persistência de dados básica.

Enunciado: Peça para o usuário digitar uma frase e salve-a em um
arquivo chamado diario.txt.

O Desafio: Use FileWriter com o parâmetro true (append) para que o programa não apague
o que já foi escrito antes. Cada execução deve adicionar uma nova linha.

Dica: Não esqueça do out.close() para o Windows liberar o arquivo.
*/
package desafio14_diario_bordo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainDiario {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- Diário de Bordo ---");
            System.out.println("1 - Adicionar Frase");
            System.out.println("2 - Mostrar Diário");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1) {
                System.out.print("Adicione uma frase no seu diário: ");
                String frase = input.nextLine();

                // Abre o arquivo em modo append, escreve e fecha imediatamente
                FileWriter diario = new FileWriter("diario.txt", true);
                diario.write(frase + "\n");
                diario.close(); // Libera o arquivo para o Windows
                System.out.println("Frase salva com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- Conteúdo do Diário ---");
                try {
                    // Lê o arquivo direto do disco para mostrar o histórico real
                    File arquivo = new File("diario.txt");
                    Scanner leitorArquivo = new Scanner(arquivo);

                    while (leitorArquivo.hasNextLine()) {
                        System.out.println(leitorArquivo.nextLine());
                    }
                    leitorArquivo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("O diário ainda está vazio. Adicione uma frase primeiro!");
                }
            } else if (opcao == 3) {
                System.out.println("Sistema encerrado. Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        input.close(); // Fecha o scanner principal
    }
}
