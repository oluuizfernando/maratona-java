package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// classe de dominio - representam o mapeamento do mundo real
// dominio, ou model, ou domain - sao classes que geralmente representam sua logica de negocio que vai geralmente o banco de dados
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
