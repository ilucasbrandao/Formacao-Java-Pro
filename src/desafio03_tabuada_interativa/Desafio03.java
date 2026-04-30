package desafio03_tabuada_interativa;
import java.util.Scanner;

/*
☕ Desafio 03: A Tabuada Interativa
Objetivo: Dominar o laço de repetição for e a concatenação de Strings.

📝 Enunciado - Crie um programa que peça ao usuário para digitar um número inteiro.
   O programa deve, então, imprimir a tabuada desse número de 1 a 10.

   O Diferencial: Antes de exibir a tabuada, o programa deve verificar se o número inserido é positivo.
   Se for negativo, peça para o usuário digitar um número válido.

💡 Dica do dia
   O laço for é perfeito quando sabemos exatamente quantas vezes queremos repetir algo (neste caso, 10 vezes).
   A estrutura básica é:

*/

public class Desafio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // obj instanciado para comunicar com o usuario
        int numeroUsuario = -1;

        // Enquanto o número for negativo, ele continua pedindo
        while (numeroUsuario < 0) {
            System.out.println("Digite um valor positivo para mostrar a tabuada:");
            numeroUsuario = leitor.nextInt();

            if (numeroUsuario < 0) {
                System.out.println("Valor inválido!");
            }
        }

        System.out.println("--- Tabuada do " + numeroUsuario + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroUsuario + " x " + i + " = " + (numeroUsuario * i));
        }

        leitor.close();
    }
}