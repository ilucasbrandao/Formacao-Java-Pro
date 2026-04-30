package desafio08_conta_bancaria_segura;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc1 = new ContaBancaria("Lucas S Brandao", 100);
        cc1.imprimir();

        System.out.println("\n----- Primeira Ação da Classe ------");
        cc1.depositar(50.50);

        System.out.println("\n----- Segunda Ação da Classe ------");
        cc1.setNome("Lucas de Sousa Brandão");
        cc1.imprimir();

        System.out.println("\n----- Terceira Ação da Classe ------");
        cc1.saque(120);

        System.out.println("\n----- Quarta Ação da Classe ------");
        System.out.println("Tratamento de exception para saque");
        cc1.saque(90);

        System.out.println("\n----- Quinta Ação da Classe ------");
        System.out.println("Tratamento de exception para deposito()");
        cc1.depositar(-56);

        System.out.println("\nDados Finais da conta:");
        cc1.imprimir();
    }
}
