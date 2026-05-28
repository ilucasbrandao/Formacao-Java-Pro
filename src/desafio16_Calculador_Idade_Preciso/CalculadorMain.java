package desafio16_Calculador_Idade_Preciso;

/*
☕ Desafio 16: O Calculador de Idade Preciso
Objetivo: Praticar a captura de dados numéricos para construir um objeto de data e calcular intervalos de tempo reais.

📝 Enunciado
O programa deve pedir para o usuário digitar o dia, o mês e o ano de seu nascimento (três valores inteiros separados).
Use esses três números para gerar um objeto do tipo LocalDate.
O programa deve obter a data atual do sistema automaticamente.

O Desafio: Calcule e exiba a idade exata do usuário formatada em Anos, Meses e Dias de vida.
💡 Dica do dia
Para criar a data de nascimento, use LocalDate dataNasc = LocalDate.of(ano, mes, dia);.
Para calcular o intervalo entre a data de nascimento e a data de hoje, use a classe Period da seguinte forma:
Period diferenca = Period.between(dataNasc, LocalDate.now());
Depois, basta usar os métodos diferenca.getYears(), diferenca.getMonths() e diferenca.getDays() para exibir o resultado.

📤 Requisitos de Saída
=== CALCULADOR DE IDADE CRONOLÓGICA ===
Digite o dia do seu nascimento: 15
Digite o mês do seu nascimento: 10
Digite o ano do seu nascimento: 2004

--- Resultado ---
Data de Nascimento cadastrada: 15/10/2004
Data de Hoje: 22/05/2026

Sua idade exata é: 21 anos, 7 meses e 7 dias.
========================================
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadorMain {
    public static void main(String[] args) {
        java.time.format.DateTimeFormatter formatador = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        System.out.println("=== CALCULADOR DE IDADE CRONOLÓGICA ===");
        int dia = 0;
        int mes = 0;
        int ano = 0;

        System.out.println("Digite o dia do seu nascimento: ");
        dia = input.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        mes = input.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        ano = input.nextInt();

        LocalDate dataNasc = LocalDate.of(ano, mes, dia);
        Period diferenca = Period.between(dataNasc, LocalDate.now());

        System.out.println("=============== Resultado ===================");
        System.out.println("Data de Nascimento cadastrada: " + dataNasc.format(formatador));
        System.out.println("Data de Hoje: " + LocalDate.now().format(formatador));
        System.out.println("Sua idade exata é: " + diferenca.getYears() + " anos, " + diferenca.getMonths() + " meses, " + diferenca.getDays() + " dias.");
        System.out.println("========================================");
        input.close();
    }
}
