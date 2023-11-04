package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;


// Herança voce está acoplando fortemente seu código
// Evite usar

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("36190-290");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setCpf("15316347931");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario func = new Funcionario();
        func.setCpf("12598668908");
        func.setSalario(513.6f);
        func.setNome("Julia");
        func.setEndereco(endereco);

        func.imprime();
    }
}
