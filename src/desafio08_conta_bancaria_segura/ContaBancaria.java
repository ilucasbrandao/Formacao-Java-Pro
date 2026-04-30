package desafio08_conta_bancaria_segura;
/*
☕ Desafio 08: Conta Bancária Segura
Objetivo: Praticar modificadores de acesso (private), métodos getter/setter e construtores.

📝 Enunciado
Crie uma classe chamada ContaBancaria.

Atributos (todos devem ser private): titular (String) e saldo (double).

Crie um Construtor que receba o nome do titular e o saldo inicial como parâmetros.
Crie métodos Getters para ambos os atributos, mas crie apenas o Setter para o titular (o saldo não deve ser alterado diretamente).
Crie um metodo chamado depositar(double valor) que aumenta o saldo, e um metodo sacar(double valor) que diminui o saldo apenas se houver dinheiro suficiente.

💡 Dica do dia
O construtor é um metodo especial que tem o mesmo nome da classe e não possui tipo de retorno. Ele é executado no momento em que você dá o new.
Para o metodo de saque, use um if para verificar se o valor é menor ou igual ao saldo. Se não for, exiba uma mensagem de "Saldo Insuficiente".

📤 Requisitos de Saída
No main, crie uma conta com um saldo inicial.

Tente fazer um depósito e exiba o novo saldo.

Tente fazer um saque maior que o saldo e verifique se a mensagem de erro aparece.

Exiba os dados finais usando os métodos get.
*/

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void imprimir(){
        System.out.println("Titular da conta: " + getNome());
        System.out.println("Saldo atual da conta: " + getSaldo());
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome){
        System.out.println("Alteração realizada com sucesso.");
        this.nome = nome;
    }

    public void depositar(double valorDeposito){
        if(valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println("Depósito de: R$ " + valorDeposito + " realizado com sucesso.");
            imprimir();
        } else {
            System.out.println("Depósito recusado, verifique o valor inserido.");
        }
    }

    public void saque(double valorSaque){
        if(saldo <= 0 || valorSaque > saldo){
            System.out.println("Saldo insuficiente, verifique seu saldo.");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saque de: R$ "+ valorSaque +" realizado com sucesso.");
            imprimir();
        }
    }

}
