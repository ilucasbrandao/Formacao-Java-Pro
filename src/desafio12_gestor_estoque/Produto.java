package desafio12_gestor_estoque;

/*☕ Desafio 12: Gestor de Estoque Simplificado
Objetivo: Praticar a remoção de itens (.remove()), busca (.contains()) e
manipulação de índices em um ArrayList.

📝 Enunciado
Crie um programa que mantenha uma lista de produtos em estoque (já comece a lista com
3 produtos de sua escolha: "Arroz", "Feijão", "Macarrão"). O programa deve oferecer um menu simples ao usuário:

Listar: Exibir todos os produtos.
Adicionar: Pedir o nome de um novo produto e adicionar à lista.
Remover: Pedir o nome de um produto. Se ele existir na lista, remova-o. Se não existir, exiba uma mensagem de erro.
Sair: Encerra o programa.

O Diferencial: Antes de adicionar um produto, o programa deve verificar se ele já existe na lista.
Se já existir, não adicione e avise o usuário: "Produto já cadastrado".

💡 Dica do dia
Para verificar se algo existe na lista, use o metodo lista.contains(nomeDoProduto). Para remover,
você pode usar lista.remove(nomeDoProduto), que retorna um valor booleano (verdadeiro/falso) indicando se a remoção deu certo.
Use um laço do-while para manter o menu funcionando até que o usuário escolha a opção de sair.

📤 Requisitos de Saída
Menu visível após cada ação (exceto na saída).

Confirmação de ações (ex: "Produto removido com sucesso!" ou "Produto 'X' adicionado").

Tratamento de erro caso o usuário tente remover algo que não existe.
*/
public class Produto {
    private String nome;
    private int quantidadeEstoque;

    public Produto(){};

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
