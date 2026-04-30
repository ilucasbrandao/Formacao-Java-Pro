package maratonaJavaCurso.firstProject.patentes;
import maratonaJavaCurso.firstProject.Membro;

public class MembroPrata extends Membro {
    private String patente;
    public MembroPrata(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
        this.patente = "prata";
    }

    @Override
    public double calcularDesconto( double valor){
        return valor * 0.90; // 10% de desconto
    }

    @Override
    public String getPatente(){
        return patente;
    }

}
