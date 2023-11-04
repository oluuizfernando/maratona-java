package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.  in);

        System.out.println("Informe seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);
        System.out.println("Informe seu sexo: ");
        char sexo = scan.next().charAt(0);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
    }
}
