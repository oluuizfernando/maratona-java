package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][]dias = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
        for(int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }

        // Variável de referencia o padrão de inicialização é nulo
    }
}
