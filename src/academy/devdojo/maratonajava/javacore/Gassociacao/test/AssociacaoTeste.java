package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Centro");
        Aluno aluno1 = new Aluno("Charles", 29);
        Aluno aluno2 = new Aluno("Bella", 27);
        Aluno[] alunos = {aluno1, aluno2};

        Professor professor1 = new Professor("Jorge", "Data Science");
        Seminario seminario01 = new Seminario("Programadores", alunos, local);
        Seminario[] seminarios = {seminario01};
        professor1.setSeminario(seminarios);
        professor1.imprime();
    }
}
