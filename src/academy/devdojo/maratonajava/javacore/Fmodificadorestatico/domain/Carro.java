package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidadeMaxima " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite " + Carro.velocidadeLimite);
    }

    // No metodo estatico eu os posso utilizar o nome da clase e nunca o this
    // Porque o this se refere ao objeto e pode existir a possibilidade
    // De eu querer usar o setVelocidadeLimite sem ter instanciado um objeto
    // Logo o this não funciona dentro de um metodo estático devido a isso
    // Em contraste, a função imprime logo acima já é totalmente possivel fazer isso
    // Pois ela nao se trata de um metodo estático

    public static void setVelocidadeLimite(double velocidadeLimite) {
        // this.velocidadeLimite = velocidadeLimite; <- ERRO
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
