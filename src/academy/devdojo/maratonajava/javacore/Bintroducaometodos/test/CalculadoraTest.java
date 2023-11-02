package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaNumeros();
        calc.subtraiNumeros();
        calc.multiplicaNumeros(10, 20.5f);
        System.out.println(calc.divideNumeros(100, 5));
        calc.imprimeDivisaoNumeros(90, 0);

        /*
            Os numeros literais (que sao os que nos escrevemos diretamente no código)
            eles são considerados double. Então se quisermos inserir um numero de ponto flutuante
            igual ao metodo acima, nós temos que colocar um "F" na frente para sinalizar.
         */
    }
}
