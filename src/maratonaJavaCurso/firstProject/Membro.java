package maratonaJavaCurso.firstProject;

import maratonaJavaCurso.firstProject.authentication.Authentication;

public abstract class Membro implements Authentication {
    private int id;
    private String nome;
    private String cpf;
    private String email;

    public Membro(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int id(){
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo abstrato, obriga cada classe a implemetarem a própria lógica de desconto.
    public abstract double calcularDesconto(double valorProduto);

    // Metodo abstrato para pegar a patente de acordo com o tipo de membro
    public abstract String getPatente();

    @Override
    public boolean auth(String emailDigitado, Membro membro) {
        if(this.email==null) return false;
        return this.getEmail().equals(emailDigitado);
    }
}
