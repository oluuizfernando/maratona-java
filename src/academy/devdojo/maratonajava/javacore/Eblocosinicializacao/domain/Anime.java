package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pra objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é iniciadoW

    {
        episodios = new int[100];
        for(int i = 0; i < 100; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime() {
        System.out.println(episodios);
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
