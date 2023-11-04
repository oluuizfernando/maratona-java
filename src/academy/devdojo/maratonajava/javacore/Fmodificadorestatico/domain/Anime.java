package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a Classe
    // 1 - Alocado espaço em memória pra objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é iniciado

    /*
    * Com o bloco de inicialização estático voce so vai ver ele sendo executado uma vez
    * poupando assim processamento.
    *
    * Os blocos inicialização estaticos são executados na ordem que são escritos (de cima para baixo)
    * */

    static {
        System.out.println("Dentro bloco inicialização");
        Anime.episodios = new int[100];
        for(int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco Inicialização 2");
    }

    static {
        System.out.println("Bloco Inicialização 3");
    }

    {
        System.out.println("Nao estatico 1");
    }

    {
        System.out.println("Nao estatico 2");
    }

    {
        System.out.println("Nao estatico 3");
    }

    public Anime() {
        for(int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome, int epi) {
        this.nome = nome;
        episodios = new int[epi];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public int[] getEpisodios() {
        return this.episodios = episodios;
    }
}
