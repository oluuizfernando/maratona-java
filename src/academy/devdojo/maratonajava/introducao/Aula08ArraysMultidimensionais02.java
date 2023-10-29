package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] num = {1,2,3};

        int[][] vary = new int[3][];
        vary[0] = new int[2];
        vary[1] = num;
        vary[2] = new int[]{5,6,7,8,9};

        for(int[] var: vary){
            System.out.println(var.length);
        }

        int [][]dias = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int [][]numeros = {{1, 2, 3}, {4, 5, 6}, {7, 12, 10}};

        for (int[] n: numeros) {
            for (int x: n) {
                System.out.println(x);
            }
        }
    }
}
