package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 320);
        Carro c2 = new Carro("Celta", 500);
        Carro c3 = new Carro("Fusca com Escada", 800);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
