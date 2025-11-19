package fatec.lanchoneteapp.domain.entity;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private long nPedido;
    private long valorTotal;
    private List<Produto> produtos;
    private LocalDate data;
    private String status;

    public LocalDate getData() {
        return data;
    }

    public long getnPedido() {
        return nPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getStatus() {
        return status;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setnPedido(long nPedido) {
        this.nPedido = nPedido;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

}

