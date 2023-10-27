package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 22;

        if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 21) {
            System.out.println("Jovem");
        } else {
            System.out.println("Adulto");
        }
    }
}
