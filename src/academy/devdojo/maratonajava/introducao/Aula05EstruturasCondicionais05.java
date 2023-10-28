package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        int diaUtil = 8;
        switch (diaUtil) {
            default:
                System.out.println("Valor invalido");
                break;
            case 1:
            case 7:
                System.out.printf("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
        }
    }
}
