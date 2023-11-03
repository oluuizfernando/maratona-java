package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, String genero, int episodios) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio) {
        this(nome, tipo, genero, episodios); //sempre tem que ser a primeira linha
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos.");
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios); //poupar codigo
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getTipo() {
        return this.tipo;
    }
}
