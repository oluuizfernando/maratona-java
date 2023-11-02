package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Willian";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Professor: "+professor.nome + ", idade, " + professor.idade + ", sexo, "+professor.sexo);
    }
}
