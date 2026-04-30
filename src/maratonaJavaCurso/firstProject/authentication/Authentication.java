package maratonaJavaCurso.firstProject.authentication;

import maratonaJavaCurso.firstProject.Membro;

public interface Authentication {
    boolean auth(String email, Membro membro);
}
