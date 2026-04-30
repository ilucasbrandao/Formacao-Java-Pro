package desafio09_heranca_hierarquia_funcionario;

/*
☕ Desafio 09: A Hierarquia de Funcionários (Herança)
Já que você dominou as classes e a proteção de dados, vamos para a Herança.
Vamos criar uma estrutura onde classes compartilham código para evitar repetição.

📝 Enunciado:
Crie uma classe base chamada Funcionario.
Atributos protected: nome (String) e salarioBase (double).
Crie um construtor para inicializar esses dados.
Crie um metodo exibirDados() que mostre nome e salário.
Crie uma classe chamada Gerente que estende (extends) Funcionario.
Atributo próprio: bonus (double).
Crie um construtor que receba nome, salário e o bônus.
O Desafio: Sobrescreva o metodo exibirDados() para mostrar também o valor do bônus.

No main:
Instancie um Funcionario comum.
Instancie um Gerente.
Chame o exibirDados() de cada um para ver a diferença.*/

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalarioBase());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Atualização realizada com sucesso.");
        this.nome = nome;
        exibirDados();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        System.out.println("Atualização realizada com sucesso.");
        this.salarioBase = salarioBase;
    }
}

