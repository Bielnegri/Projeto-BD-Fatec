package fatec.lanchoneteapp.application.facade;

import fatec.lanchoneteapp.application.dto.HistoricoDTO;
import fatec.lanchoneteapp.application.dto.PedidoDTO;
import fatec.lanchoneteapp.application.dto.ProdutoDTO;

import java.util.List;

public class PedidoFacadeImpl implements PedidoFacade{

    @Override
    public PedidoDTO criarPedido(Long clienteId, List<ProdutoDTO> produtos) {
        return null;
    }

    @Override
    public PedidoDTO buscarPedido(Long pedidoId) {
        return null;
    }

    @Override
    public List<PedidoDTO> listarPedidos() {
        return List.of();
    }

    @Override
    public PedidoDTO atualizarPedido(Long pedidoId, String observacao) {
        return null;
    }

    @Override
    public void cancelarPedido(Long pedidoId) {

    }

    @Override
    public PedidoDTO adicionarProduto(Long pedidoId, Long produtoId, int quantidade) {
        return null;
    }

    @Override
    public PedidoDTO removerProduto(Long pedidoId, Long produtoId) {
        return null;
    }

    @Override
    public PedidoDTO atualizarQuantidadeProduto(Long pedidoId, Long produtoId, int novaQuantidade) {
        return null;
    }

    @Override
    public PedidoDTO atualizarStatus(Long pedidoId, String novoStatus) {
        return null;
    }

    @Override
    public List<HistoricoDTO> listarHistorico(Long pedidoId) {
        return List.of();
    }
}
