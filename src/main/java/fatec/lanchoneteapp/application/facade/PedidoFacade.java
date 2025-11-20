package fatec.lanchoneteapp.application.facade;

import fatec.lanchoneteapp.application.dto.HistoricoDTO;
import fatec.lanchoneteapp.application.dto.PedidoDTO;
import fatec.lanchoneteapp.application.dto.ProdutoDTO;

import java.util.List;

public interface PedidoFacade {
    

    // --- PEDIDO ---

    /**
     * Cria um novo pedido para um cliente específico com uma lista de produtos.
     *
     * @param clienteId o ID do cliente para quem o pedido está sendo criado
     * @param produtos  a lista de produtos a serem incluídos no pedido
     * @return os detalhes do pedido criado encapsulados em um objeto PedidoDTO
     */
    PedidoDTO criarPedido(Long clienteId, List<ProdutoDTO> produtos);

    /**
     * Busca os detalhes de um pedido específico com base no seu ID.
     *
     * @param pedidoId o ID do pedido a ser buscado
     * @return os detalhes do pedido encapsulados em um objeto PedidoDTO
     */
    PedidoDTO buscarPedido(Long pedidoId);

    /**
     * Lista todos os pedidos cadastrados no sistema.
     *
     * @return uma lista de objetos PedidoDTO representando os pedidos existentes
     */
    List<PedidoDTO> listarPedidos();

    // Atualizar dados gerais do pedido
    /**
     * Atualiza as informações de um pedido específico, permitindo adicionar ou alterar uma observação associada a ele.
     *
     * @param pedidoId o ID do pedido a ser atualizado
     * @param observacao a nova observação a ser associada ao pedido
     * @return os detalhes do pedido atualizado encapsulados em um objeto PedidoDTO
     */
    PedidoDTO atualizarPedido(Long pedidoId, String observacao);

    // Cancelar
    /**
     * Cancela um pedido existente com base no seu ID único.
     *
     * @param pedidoId o ID do pedido a ser cancelado
     */
    void cancelarPedido(Long pedidoId);


    // --- ITENS DO PEDIDO ---

    /**
     * Adiciona um produto a um pedido existente com a quantidade especificada.
     *
     * @param pedidoId   o ID do pedido ao qual o produto será adicionado
     * @param produtoId  o ID do produto que será adicionado ao pedido
     * @param quantidade a quantidade do produto a ser adicionada ao pedido
     * @return os detalhes atualizados do pedido encapsulados em um objeto PedidoDTO
     */
    PedidoDTO adicionarProduto(Long pedidoId, Long produtoId, int quantidade);

    /**
     * Remove um produto de um pedido existente com base no ID do pedido e no ID do produto.
     *
     * @param pedidoId  o ID do pedido do qual o produto será removido
     * @param produtoId o ID do produto a ser removido do pedido
     * @return os detalhes atualizados do pedido encapsulados em um objeto PedidoDTO
     */
    PedidoDTO removerProduto(Long pedidoId, Long produtoId);

    /**
     * Atualiza a quantidade de um produto específico em um pedido existente.
     *
     * @param pedidoId       o ID do pedido no qual a quantidade do produto será atualizada
     * @param produtoId      o ID do produto cuja quantidade será alterada
     * @param novaQuantidade a nova quantidade a ser definida para o produto no pedido
     * @return os detalhes atualizados do pedido encapsulados em um objeto PedidoDTO
     */
    PedidoDTO atualizarQuantidadeProduto(Long pedidoId, Long produtoId, int novaQuantidade);

    // --- STATUS ---

    /**
     * Atualiza o status de um pedido existente com base no seu ID único.
     *
     * @param pedidoId   o ID do pedido cujo status será atualizado
     * @param novoStatus o novo status a ser atribuído ao pedido
     * @return os detalhes do pedido atualizado encapsulados em um objeto PedidoDTO
     */
    PedidoDTO atualizarStatus(Long pedidoId, String novoStatus);

    // --- HISTÓRICO ---

    /**
     * Lista o histórico de alterações ou eventos relacionados a um pedido específico.
     *
     * @param pedidoId o ID do pedido cujo histórico será listado
     * @return uma lista de objetos HistoricoDTO representando as entradas no histórico do pedido
     */
    List<HistoricoDTO> listarHistorico(Long pedidoId);


}
