package fatec.lanchoneteapp.application.repository;

import java.util.List;

public interface StrategyRepository<T> {
    void salvar(T entidade);
    void atualizar(T entidade);
    void excluir(T entidade);
    T buscar(T entidade);
    List<T> listar();
}
