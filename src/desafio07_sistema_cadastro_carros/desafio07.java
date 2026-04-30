package desafio07_sistema_cadastro_carros;

public class desafio07 {
    public static void main(String[] args) {
        Carro meuCorolla = new Carro("Toyota", "Corolla", 2022);
        Carro meuCivic = new Carro("Honda", "Civic", 2023);

        meuCorolla.exibirDetalhes();
        meuCivic.exibirDetalhes();
    }
}
