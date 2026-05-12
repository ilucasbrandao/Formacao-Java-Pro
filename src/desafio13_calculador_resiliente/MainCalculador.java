package desafio13_calculador_resiliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.println("Digite o primeiro número: ");
                int n1 = input.nextInt();

                System.out.println("Digite o segundo número: ");
                int n2 = input.nextInt();

                if (n2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitido");
                }

                double resultado = (double) n1 / n2;
                System.out.println("O resultado é " + resultado);
                sucesso = true;

            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
                input.nextLine(); // Limpa o buffer do scanner
            }
        }
        input.close();
    }
}
