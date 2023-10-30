package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        double n2 = 20;
        // A conta de 2 inteiros, sempre vai ser um inteiro, entao é necessario 1 variavel double nesse caso
        System.out.println(n1 / n2);

        // Padrao de convenção para booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        int contaCorrente = 2000;
        int contaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlayCompravel = contaCorrente >= valorPlaystation || contaPoupanca >= valorPlaystation;

    }
}
