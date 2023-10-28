package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] var = null;
        int[] idade = new int[3];
        System.out.println(idade);
        System.out.println(idade[1]);

        String[] nomes = new String[4];

        nomes[0] = "Luiz";
        nomes[1] = "João";
        nomes[2] = "Pedro";
        nomes[3] = "Carlos";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("==================");
        String[] aux = nomes;
        nomes = new String[5];
        for (int i = 0; i < aux.length; i++){
            nomes[i] = aux[i];
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
