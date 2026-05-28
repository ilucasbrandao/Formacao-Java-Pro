package revisaoDeConceitos3a6;

import java.util.Objects;
import java.util.Scanner;

public class MainAnalisadorRedacao {
    public static void main(String[] args) {
        String[] proibidas = {"inutil", "fracasso", "desistir", "desconheco", "preguiçoso" };

        // Acumuladores de palavras
        int totalPalavras = 0;
        int totalCensuradas = 0;

        // String para manipular o texto após a analise
        String textoLimpo = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando o Analisador de Redação");
        System.out.println("Digite um texto para ser analisado.");
        String textoDigitado = input.nextLine();

        while (!textoDigitado.equals("FIM")) {
            String[] arrayTexto = textoDigitado.split(" ");
            for(int i = 0; i < arrayTexto.length; i++){
                totalPalavras++;
                for (int j = 0; j < proibidas.length; j++){
                    if(arrayTexto[i].toLowerCase().equals(proibidas[j])){
                        arrayTexto[i] = "****";
                        totalCensuradas++;
                        break;
                    }
                }
                textoLimpo += arrayTexto[i] + " ";
            }
            System.out.println("Digite um texto para ser analisado.");
            textoDigitado = input.nextLine();
        }
        System.out.println("Frase corrigida: ");
        System.out.println(textoLimpo);
        System.out.println("Palavras acumuladas: " + totalPalavras);
        System.out.println("Palavras censuradas: " + totalCensuradas);

        input.close();
    }
}
