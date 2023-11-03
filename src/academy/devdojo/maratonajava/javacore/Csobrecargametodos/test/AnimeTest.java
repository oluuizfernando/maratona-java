package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("YuGiOh", "TV", 352, "Cartas");
        /*
        anime.setTipo("TV");
        anime.setEpisodios(22);
        anime.setNome("OnePiece");
        */
        anime.imprime();
    }
}
