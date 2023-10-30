package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        int salario = 6000;
        String resultado = salario > 5000 ? "Pode doar 500!" : "Não tem condições de doar!";
        System.out.printf(resultado);

        // É possivel aninhar operadores ternários
    }
}
