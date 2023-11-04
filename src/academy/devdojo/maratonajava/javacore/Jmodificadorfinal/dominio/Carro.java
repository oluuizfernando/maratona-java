package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    //public static final double VELOCIDADE_LIMITE = 250;
    public final double VELOCIDADE_LIMITE;
    private String nome;
    //A Referencia se torna imutavel e não os dados do objeto
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println("Nao pode ser sobrescrito");
    }

    {
        VELOCIDADE_LIMITE = 230;
    }

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
