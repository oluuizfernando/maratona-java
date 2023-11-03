package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("YuGiOh", "TV", "Cartas", 378);
        Anime anime2 = new Anime();
        Anime anime3 = new Anime("OnePiece", "TV", "Porrada", 135319, "Sao Paulo");

        //anime.init("YuGiOh", "TV", 352, "Cartas");
        /*
        anime.setTipo("TV");
        anime.setEpisodios(22);
        anime.setNome("OnePiece");
        */

        anime.imprime();
        anime2.imprime();
        System.out.println("=======================================");
        anime3.imprime();
    }
}
