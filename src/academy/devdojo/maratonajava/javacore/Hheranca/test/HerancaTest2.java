package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest2 {
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da SUBclasse é executado quando a JVM carregar classe filha
    // 2 - Alocado espaço em moemoria pro objeto da superclasse
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem de escrita
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em moemoria pro objeto da SUBclasse
    // 7 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe filha
    // 8 - Bloco de inicialização da SUBclasse é executado na ordem de escrita
    // 9 - Construtor é executado da SUBclasse
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Jorge");
    }
}
