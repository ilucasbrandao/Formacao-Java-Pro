package desafio09_heranca_hierarquia_funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario comum = new Funcionario("Carlos Alberto", 1645.60);
        Gerente gerente1 = new Gerente("Lucas de S Brandão", 5400, 1200);

        System.out.println("\n----- Primeira Ação da Classe ------");
        comum.exibirDados();
        gerente1.exibirDados();

        System.out.println("\n----- Segunda Ação da Classe ------");
        comum.setNome("Carlos Alberto de Nobrega");
        System.out.println("----------------");
        gerente1.setNome("Lucas de Sousa Brandão");
    }
}
