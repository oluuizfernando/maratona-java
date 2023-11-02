package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante; // variavel de referencia do tipo estudante
        // e para criar o objeto sempre vai utilizar a palavra new

        // ou seja quando damos um new, nos criamos umn link de algo que referencia aquele espaço em momeoria
        // que foi criado

        estudante = new Estudante();

        estudante.nome = "Luiz";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
