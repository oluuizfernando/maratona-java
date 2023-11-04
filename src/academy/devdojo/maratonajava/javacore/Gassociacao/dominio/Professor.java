package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void imprime() {
        System.out.println("------------------");
        System.out.println(this.getNome());
        if (this.seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            if (seminario.getLocal() != null) {
                System.out.println(seminario.getLocal().getEndereco());
            }
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
}
