package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private float salario;

    static {
        System.out.println("Estatico Bloco inicializacao Funcionario");
    }

    {
        System.out.println("Bloco inicializacao Funcionario 1");
    }

    {
        System.out.println("Bloco inicializacao Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.getSalario());
    }

    public void relatorioPagamento() {
        System.out.println("Eu: " + this.nome + " recebi o salário: " + this.salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
