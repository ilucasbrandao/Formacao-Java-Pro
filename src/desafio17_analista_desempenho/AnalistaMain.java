package desafio17_analista_desempenho;
/*
☕ Desafio 17: O Analista de Desempenho (Métricas de Lista)
Objetivo: Praticar a iteração sobre uma lista dinâmica para extrair informações estatísticas
(médias, máximos e mínimos) com base em condições.

📝 Enunciado
O programa deve permitir que o usuário digite uma série de notas (valores do tipo double).
O usuário pode digitar quantas notas quiser. Para encerrar a entrada de dados, ele deve digitar -1.
Armazene todas as notas válidas em um ArrayList<Double>.

O Desafio: Ao final, o programa deve calcular e exibir:
-> A Média das notas da turma.
-> A Maior nota cadastrada.
-> A Menor nota cadastrada.
-> A quantidade de alunos que ficaram acima da média calculada.
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnalistaMain {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>(); // inicializando a lista dinamica de notas
        Scanner input = new Scanner(System.in); // instânciando o input

        double addNota; // variável de controle do sistema
        System.out.println("=== SISTEMA DE ANÁLISE DE NOTAS ===");

        try {
            while (true) {
                System.out.println("Digite as notas (ou -1 para encerrar):");
                addNota = input.nextDouble();

                // encerrar o programa
                if (addNota == -1) {
                    break;
                }
                // não aceita nota negativa != -1
                if (addNota < 0) {
                    System.out.println("Nota inválida! Digite apenas valores positivos.");
                    continue;
                }
                // adiciona a nota digitada na lista de notas
                notas.add(addNota);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
            input.close();
            return;
        }

        // se a lista estiver vazia, encerra o programa.
        if (notas.isEmpty()) {
            System.out.println("\nNenhuma nota foi cadastrada. Sistema encerrado.");
            input.close();
            return;
        }

        double somaDasNotas = 0.0; // variável para adicionar a soma das notas
        double maiorNota = notas.get(0); // variável maiorNota apontando para o primeiro indice
        double menorNota = notas.get(0); // variável menor apontando para o primeiro indice

        // Primeiro mapeamento de notas
        for (Double nota : notas) {
            somaDasNotas += nota;

            // atualiza a maior nota a cada interação
            if (nota > maiorNota) {
                maiorNota = nota;
            }

            // atualiza a menor nota a cada interação
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double mediaTurma = somaDasNotas / notas.size(); // obtem a média da turma

        int acimaDaMedia = 0; // variável de incrementação

        // Segundo mapeamento para saber quem ficou acima da média da turma
        for (Double nota : notas) {
            if (nota > mediaTurma) {
                acimaDaMedia++;
            }
        }
        input.close();

        // Exibição do Resultado
        System.out.println("--- Relatório de Desempenho ---");
        System.out.println("Total de notas lidas: " + notas.size());
        System.out.println("Média da Turma: " + mediaTurma);
        System.out.println("Maior Nota: " + maiorNota);
        System.out.println("Menor Nota: " + menorNota);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
        System.out.println("===============================");
    }
}
