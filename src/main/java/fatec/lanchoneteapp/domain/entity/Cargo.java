package fatec.lanchoneteapp.domain.entity;

public class Cargo {
    private String nome;
    private long salario;
    private String funcao;

    public String getFuncao() {
        return funcao;
    }
    public String getNome() {
        return nome;
    }
    public long getSalario() {
        return salario;
    }
    public void setDescricao(String funcao) {
        this.funcao = funcao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(long salario) {
        this.salario = salario;
    }

}
