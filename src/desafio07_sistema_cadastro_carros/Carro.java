package desafio07_sistema_cadastro_carros;
/*
☕ Desafio 07: O Sistema de Cadastro de Carros

Objetivo: Sair do modelo de "apenas código no main" e criar sua primeira Classe.
Imagine que uma classe é o molde e o objeto é o que sai desse molde.

📝 Enunciado
Crie uma classe chamada Carro (fora do seu arquivo de teste, ou no mesmo arquivo, mas fora do bloco da classe Desafio07).

A classe Carro deve ter três atributos (características):
marca (String)
modelo (String)
ano (int)

Crie um metodo dentro da classe Carro chamado exibirDetalhes().
Esse metodo não recebe nada e apenas imprime os atributos do carro de forma bonitinha.
No seu metodo main (na sua classe de teste):
Instancie (crie) dois objetos do tipo Carro.
Atribua valores diferentes para cada um (ex: um Corolla e um Civic).
Chame o metodo exibirDetalhes() para os dois.*/

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes(){
        System.out.println("Dados do Veículo: ");
        System.out.println("Marca: " + this.marca + " || " + "Modelo: " + this.modelo + " || " + "Ano: " + this.ano);
    }
}
