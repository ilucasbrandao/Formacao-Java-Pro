import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false; // Controla se o loop deve continuar

        while (!sucesso) { // Enquanto NÃO tiver sucesso, repita
            try {
                System.out.print("Digite o dividendo: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o divisor: ");
                int num2 = scanner.nextInt();

                int resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);

                sucesso = true; // Se chegou aqui sem erro, deu sucesso! O loop vai parar.

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros! Tente novamente.\n");
                scanner.nextLine(); // A "DESCARGA": limpa a letra do buffer para evitar o loop infinito

            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não permitida! Tente novamente.\n");
                // Aqui não precisa de scanner.nextLine() porque o erro foi matemático,
                // os números digitados eram válidos para o Scanner.
            }
        }

        System.out.println("Obrigado por usar o sistema!");
        scanner.close();
    }
}