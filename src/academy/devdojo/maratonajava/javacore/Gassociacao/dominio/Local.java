package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;
    private Seminario[] seminarios;

    public Local() {}

    public Local(String endereco) {
        this.endereco = endereco;
    }
    public Local(String endereco, Seminario[] seminarios) {
        this.endereco = endereco;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }
}
