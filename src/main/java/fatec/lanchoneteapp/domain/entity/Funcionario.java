package fatec.lanchoneteapp.domain.entity;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private String tel;
    private LocalDate dataContrat;

    public Cargo getCargo() {
        return cargo;
    }

    public LocalDate getDataContrat() {
        return dataContrat;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setDataContrat(LocalDate dataContrat) {
        this.dataContrat = dataContrat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}

