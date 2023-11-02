package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2012;
        carro1.modelo = "Civic";
        carro1.nome = "Honda";

        carro2.ano = 2020;
        carro2.modelo = "Senna";
        carro2.nome = "McLaren";

        System.out.println("Carro 1 | nome: "+carro1.nome+" | modelo: " + carro1.modelo + " | ano: " + carro1.ano);
        System.out.println("Carro 2 | nome: "+carro2.nome+" | modelo: " + carro2.modelo + " | ano: " + carro2.ano);
    }
}
