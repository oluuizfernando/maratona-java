package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoBeber = idade >= 18;

        if (isAutorizadoBeber) {
            System.out.println("Pode beber pois já tem "+idade+" anos!");
        } else {
            System.out.println("Tem que pedir pros pais!");
        }
    }
}
