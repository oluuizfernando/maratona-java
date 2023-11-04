package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {
    public void imprime() {
        this.nome = "sasa";
    }

    public Funcionario2(String nome) {
        super(nome);
    }
}
