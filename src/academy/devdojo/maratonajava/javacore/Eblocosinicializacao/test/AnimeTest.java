package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {


    //
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int ep: anime.getEpisodios()) {
            System.out.println("Ep: " + ep);
        }

        Anime anime2 = new Anime("Jorge", 15);

        for (int ep: anime2.getEpisodios()) {
            System.out.println(ep);
        }
    }
}
