package maratonaJavaCurso.firstProject.Test;

import maratonaJavaCurso.firstProject.Membro;
import maratonaJavaCurso.firstProject.patentes.MembroBronze;
import maratonaJavaCurso.firstProject.patentes.MembroOuro;
import maratonaJavaCurso.firstProject.patentes.MembroPrata;

public class Testador {
    public static void main(String[] args) {
        Membro m1 = new MembroBronze(1, "Alberto", "456.547.333-01", "alberto@email.com");
        Membro m2 = new MembroPrata(456, "Maria Alice", "856.478.233-01", "mariaalice@email.com");
        Membro m3 = new MembroOuro(988, "Sophia Luz", "123.653.457-99", "sophialuz@email.com" );

        imprimirRelatorio(m1, 200);
        imprimirRelatorio(m2, 200);
        imprimirRelatorio(m3, 200);

        fazerLogin(m3, "sophialuz@email.com");
        fazerLogin(m3, "alberto@email.com");
    }

    public static void imprimirRelatorio(Membro membro, double valor){
        System.out.println("Membro: " + membro.getNome());
        System.out.println("Valor com desconto: " + membro.calcularDesconto(valor));
        System.out.println("---------------------------------");
    }

    public static void fazerLogin(Membro membro, String emailDigitado){
        if(membro.auth(emailDigitado, membro)){
            System.out.println("Acesso PERMITIDO para: " + membro.getNome());
        } else {
            System.out.println("Acesso NEGADO para: " + membro.getNome());
            if(!emailDigitado.equals(membro.getEmail())){
                System.out.println("Email incorreto. Tente novamente.");
            }
        }
    }
}
