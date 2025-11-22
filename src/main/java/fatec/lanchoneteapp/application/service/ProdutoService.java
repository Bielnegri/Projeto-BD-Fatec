package fatec.lanchoneteapp.application.service;

import fatec.lanchoneteapp.adapters.repository.ProdutoRepository;
import fatec.lanchoneteapp.application.exception.ProdutoInvalidoException;
import fatec.lanchoneteapp.application.exception.ProdutoNaoEncontradoException;
import fatec.lanchoneteapp.domain.entity.Produto;

import java.sql.SQLException;
import java.util.List;

public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void criarProduto(Produto produto) throws SQLException, ProdutoInvalidoException {
        if(!validarProduto(produto))
            throw new ProdutoInvalidoException("Produto já cadastrado");

        produtoRepository.salvar(produto);
    }

    public void excluirProduto(Produto produto) throws SQLException {
        produtoRepository.excluir(produto);
    }

    public Produto buscarProduto(int idProduto) throws SQLException, ProdutoNaoEncontradoException {
        Produto produto = produtoRepository.buscarPorID(new Produto(idProduto));

        if(produto == null)
            throw new ProdutoNaoEncontradoException("Produto não encontrado");

        return produto;
    }

    public void atualizarProduto(Produto produto) throws SQLException {
        produtoRepository.atualizar(produto);
    }

    public List<Produto> listarProdutos() throws SQLException {
        return produtoRepository.listar();
    }

    public boolean validarProduto(Produto produto) throws SQLException {
        try{
            buscarProduto(produto.getId());
            return false;
        } catch(ProdutoNaoEncontradoException e){
            return true;
        }
    }
}
