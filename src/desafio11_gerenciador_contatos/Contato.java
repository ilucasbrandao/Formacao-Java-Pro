package desafio11_gerenciador_contatos;

/*
☕ Desafio 11: O Gerenciador de Contatos (ArrayList e Listas Dinâmicas)
Até agora, usamos Arrays fixos (como o Animal animals[]). Mas e se não soubermos quantos itens teremos?
No mundo real, usamos o ArrayList.

📝 Enunciado:
Crie uma classe chamada Contato com os atributos nome e telefone (String).
No seu main, crie um ArrayList<Contato>.
Crie um pequeno menu interativo usando while e Scanner com as opções:
1 - Adicionar Contato: Pede nome/telefone e adiciona na lista.
2 - Listar Contatos: Percorre a lista e exibe todos os cadastrados.
3 - Sair: Encerra o programa.

Diferencial PRO: Antes de encerrar o programa, exiba quantos contatos foram
cadastrados no total usando o metodo .size().

💡 Dica do dia:
Para usar a lista dinâmica, você precisa importar java.util.ArrayList.
Para adicionar: lista.add(objeto);
Para saber o tamanho: lista.size();
Para percorrer: o for-each que você usou no desafio anterior funciona perfeitamente aqui!
*/

import java.util.ArrayList;

public class Contato extends ArrayList {
    private String nome;
    private String telefone;

    public Contato() {}

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
