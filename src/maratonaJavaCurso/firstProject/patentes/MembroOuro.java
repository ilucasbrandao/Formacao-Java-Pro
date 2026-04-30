package maratonaJavaCurso.firstProject.patentes;

import maratonaJavaCurso.firstProject.Membro;

public class MembroOuro extends Membro {
    private String patente;
    public MembroOuro(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
        this.patente = "ouro";
    };

    @Override
    public double calcularDesconto(double valor){
        return valor * 0.80; // 20% de desconto
    }

    @Override
    public String getPatente(){
        return patente;
    }

}
