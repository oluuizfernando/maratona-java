package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 22;
        System.out.println("Eu tenho " + idade + " anos.");

        // casting - forçando valor entrar no int, sendo long
        int longInInteger = (int) 10000000000L;
        // ele vai cortar bits, entao o valor que voce vai obter vai ser totalmente nada a ver
        System.out.println(longInInteger);

        float doubleInInteger = (float) 2500.00D;
        // aqui voce forçou, e coube, entao não dá o problema que deu em cima
        System.out.println(doubleInInteger);

        // Ele neste caso ignorou os numeros decimais
        // Conclui-se que o casting não é uma prática tão boa, é melhor trocar o tipo das variáveis
        long numeroGrande = (long) 155.23D;
        System.out.println(numeroGrande);
    }
}
