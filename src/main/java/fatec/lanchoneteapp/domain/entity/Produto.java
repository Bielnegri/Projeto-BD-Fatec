package fatec.lanchoneteapp.domain.entity;

class Produto {
    private int idProd;
    private String nome;
    private long qntdEstoq;
    private long valorUn;

    public int getIdProd() {
        return idProd;
    }

    public String getNome() {
        return nome;
    }

    public long getQntdEstoq() {
        return qntdEstoq;
    }

    public long getValorUn() {
        return valorUn;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQntdEstoq(long qntdEstoq) {
        this.qntdEstoq = qntdEstoq;
    }

    public void setValorUn(long valorUn) {
        this.valorUn = valorUn;
    }


}