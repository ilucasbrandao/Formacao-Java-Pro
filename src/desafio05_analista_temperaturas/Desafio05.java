package desafio05_analista_temperaturas;

/*
☕ Desafio 05: O Analista de Temperaturas
Objetivo: Aprender a declarar, preencher e percorrer uma Array.

📝 Enunciado
Crie um programa que peça ao usuário para inserir as temperaturas máximas de 7 dias (uma semana).
Armazene essas 7 temperaturas em uma Array do tipo double.

Após a leitura, o programa deve calcular e exibir a média das temperaturas da semana.
O programa também deve informar qual foi a maior temperatura registrada no período.

💡 Dica do dia
Para percorrer uma Array e encontrar o maior valor, você pode criar uma variável chamada maior e
inicializá-la com a primeira posição da Array (temperaturas[0]). Depois, use um laço for para comparar
essa variável com todas as outras posições. Se encontrar um número maior, atualize a variável!

📤 Requisitos de Saída
Exibir a lista das temperaturas digitadas.
Exibir a média aritmética: "Média semanal: [valor]°C".
Exibir o pico de calor: "A maior temperatura foi: [valor]°C".*/

import java.util.Arrays;
import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] temps = new double[7];
        double somaTemp = 0.0;

        for (int i = 0; i < temps.length; i++){
            System.out.println("Digite a temperatura máx. do dia: " + (i+1) + "º dia");
            temps[i] = leitor.nextDouble();
            somaTemp += temps[i];
        }

        double maiorTemp = temps[0];
        for (int i = 1; i < temps.length; i++){
            if (temps[i] > maiorTemp){
                maiorTemp = temps[i];
            }
        }

        double mediaTemp = somaTemp / temps.length;

        System.out.println("----------- RESULTADO DO DESAFIO -----------");
        System.out.println("Lista das temperaturas digitadas" + Arrays.toString(temps));
        System.out.printf("Média semanal: %.2f °C\n", mediaTemp);
        System.out.println("A maior temperatura foi: " +maiorTemp+ " °C");

        leitor.close();
    }
}
