package desafio04_somador_numeros_infinitos;

/*
☕ Desafio 04: O Somador de Números Infinitos
Objetivo: Praticar o laço while e o conceito de acumulador (variável que guarda a soma total).

📝 Enunciado
Crie um programa que peça ao usuário para digitar números inteiros continuamente.
O programa só deve parar de pedir números quando o usuário digitar o número 0.

Ao final (quando o 0 for digitado), o programa deve exibir a soma total de todos os
números inseridos e a quantidade de números que foram digitados (excluindo o zero).

💡 Dica do dia
Use uma variável soma e uma variável contador inicializadas com 0.
Dentro do while, atualize esses valores a cada repetição.

*/

import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroUsuario;
        int somaValores = 0;
        int acc = 0;

        do{
            System.out.println("Digite um número inteiro (O - para sair)");
            numeroUsuario = leitor.nextInt();

            if(numeroUsuario != 0 ){
                somaValores += numeroUsuario;
                acc++;
            }

        } while(numeroUsuario != 0);

        System.out.println("------ RESULTADO DO DESAFIO -------------");
        System.out.println("Valor acumulado: " + somaValores);
        System.out.println("Qtd de números inseridos: " + acc);
        System.out.println("-----------------------------------------");

        leitor.close();
    }
}
