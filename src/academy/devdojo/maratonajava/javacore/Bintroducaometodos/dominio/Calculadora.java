package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiNumeros() {
        System.out.println(10 - 7);
    }

    public void multiplicaNumeros(int a, float b) {
        System.out.println(a * b);
    }

    public double divideNumeros(double a, double b) {
        return a / b;
    }

    public void imprimeDivisaoNumeros(double a, double b) {
        if (b == 0) {
            System.out.println("Nao existe divisao por 0");
            return;
        }
        System.out.println("Chegamos aqui");
    }

    public void somaArray(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
