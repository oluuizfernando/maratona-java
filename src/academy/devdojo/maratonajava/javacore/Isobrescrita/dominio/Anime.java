package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    // 1 - O nome precisa ser o mesmo
    // 2 - O tipo de retorno tem que ser a classe ou uma subclasse (covariancia de retorno)
    // 3 - Modificador de acesso nunca pode ser mais restritivo
    @Override
    public String toString(){
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
