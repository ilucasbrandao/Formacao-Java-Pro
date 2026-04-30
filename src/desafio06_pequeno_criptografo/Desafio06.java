package desafio06_pequeno_criptografo;
/*
☕ Próximo Nível: Desafio 06 (O Pequeno Criptógrafo)
Agora que você dominou as Arrays e os números, vamos para o mundo das Strings.
Esse desafio é excelente para entender que, por baixo dos panos, um texto é uma sequência de caracteres que podemos manipular um a um.

📝 Enunciado:

Peça ao usuário para digitar uma frase.
O programa deve criar uma nova versão dessa frase onde todas as vogais (a, e, i, o, u) sejam substituídas por um asterisco (*).
O programa não deve diferenciar maiúsculas de minúsculas (ex: 'A' e 'a' viram *).
Bônus: Mostre a frase original, a nova frase e quantos caracteres a frase tem no total (contando espaços).
*/

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String fraseOriginal = input.nextLine();

        String fraseCodificada = "";
        int contadorEspaco = 0;


        for (int i = 0; i < fraseOriginal.length(); i++){
            char letra = fraseOriginal.charAt(i);
            char letraMinuscula = Character.toLowerCase(letra);

            if(letraMinuscula == 'a' || letraMinuscula == 'e' ||letraMinuscula == 'i' ||letraMinuscula == 'o' ||letraMinuscula == 'u'){
                fraseCodificada += "*";
            } else {
                fraseCodificada += letraMinuscula;
            }

            if (letraMinuscula == ' ') {
                contadorEspaco++;
            }
        }

        System.out.println("----------- Frase Criptografada -----------");
        System.out.println("Original: "+fraseOriginal);
        System.out.println("Codificada: "+fraseCodificada);
        System.out.println("Total de caracteres: " + fraseCodificada.length());
        System.out.println("Total de espaço: " + contadorEspaco);
        System.out.println("--------------------------------------------");

        input.close();
    }

}
