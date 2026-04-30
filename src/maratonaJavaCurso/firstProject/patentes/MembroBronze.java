package maratonaJavaCurso.firstProject.patentes;
import maratonaJavaCurso.firstProject.Membro;

public class MembroBronze extends Membro {
    private String patente;
    public MembroBronze(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
        this.patente = "bronze";
    };

    @Override
    public double calcularDesconto(double valor){
        return valor * 0.95; // 5% de desconto
    }

    @Override
    public String getPatente(){
        return patente;
    }

    @Override
    public boolean auth(String email, Membro membro){
        return false;
    }
}
